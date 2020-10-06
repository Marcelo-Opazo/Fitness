package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class Menu_act extends AppCompatActivity {

    private ViewFlipper vf;
    private int[] images = {R.drawable.a,R.drawable.b,R.drawable.c};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_act);

        vf = (ViewFlipper)findViewById(R.id.slider);

        for(int i =0; i <images.length; i++)
        {
            flip_image(images[i]);
        }
    }

    public void flip_image(int i)
    {
        //vamos a dar la config del slider
        ImageView view = new ImageView(this);
        view.setBackgroundResource(i);

        vf.addView(view);// añadimos las imagene al viewflipper
        vf.setFlipInterval(2300); // su desplazamientosera de 2300 milis
        vf.setAutoStart(true); //inicia de forma automatica

        //SEntido del slider
        vf.setInAnimation(this,android.R.anim.slide_in_left);
        vf.setOutAnimation(this,android.R.anim.slide_out_right);
    }

    public void Maps(View v)
    {
        Intent i = new Intent(this,Maps_act.class);
        startActivity(i);
    }

    public void Info(View v)
    {
        Intent i = new Intent(this,Info_act.class);
        startActivity(i);
    }
    public void Clientes(View v)
    {
        ArrayList<String>clientes = new ArrayList<String>();
        clientes.add("Roberto");
        clientes.add("Ivan");

        ArrayList<String>Planes = new ArrayList<String>();
        Planes.add("xtreme");
        Planes.add("mindfullness");

        Intent i = new Intent(this,Clientes_act.class);
        i.putExtra("listaClientes",clientes);       //PREPARO el dato para ser enviado
        i.putExtra("listaPlanes",Planes);
        startActivity(i);
    }
}