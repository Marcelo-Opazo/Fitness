package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Clases.Planes;

public class Clientes_act extends AppCompatActivity {

    private Spinner spinC, spinP;
    private EditText editM;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes_act);

        spinC=(Spinner)findViewById(R.id.spinClientes);
        spinP=(Spinner)findViewById(R.id.spinPlanes);

        editM=(EditText) findViewById(R.id.editMont);
        txt=(TextView) findViewById(R.id.txt1);

        //recibo el arreglo enviado por el intent desde el menu
        ArrayList<String> listaClientes = (ArrayList<String>)getIntent().getSerializableExtra("listaClientes");
        ArrayList<String> listaPlanes = (ArrayList<String>)getIntent().getSerializableExtra("listaPlanes");

        ArrayAdapter<String> adapt = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaClientes);
        ArrayAdapter<String> adapts = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaPlanes);
        spinC.setAdapter(adapt);
        spinP.setAdapter(adapts);
    }

    public void Calcular(View v)
    {
        Planes plan = new Planes();


        String cliente = spinC.getSelectedItem().toString();
        String planes = spinP.getSelectedItem().toString();


        int saldo = Integer.parseInt(editM.getText().toString());
        int xtreme = Integer.parseInt(plan.getXtreme());
        int mind = Integer.parseInt(plan.getMindfullness());
        int result = saldo - xtreme;
        int result2 = saldo - mind;


        if(cliente.equals("Roberto") && planes.equals("xtreme"))
        {
            txt.setText("El valor xtreme es: " + result);
        }
        if(cliente.equals("Roberto") && planes.equals("mindfullness"))
        {
            txt.setText("El valor de mindfullness es: " + result2);
        }
    }
}