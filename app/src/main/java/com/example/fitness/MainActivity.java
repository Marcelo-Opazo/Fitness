package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar pro;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById((R.id.button)) ;
        pro =(ProgressBar)findViewById(R.id.pb);
        pro.setVisibility(View.INVISIBLE);; // transformo mi progress bar invisible

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                new Task().execute();
            }
        });

    }


    //Implementar clase Async Task

    class Task extends AsyncTask<String, Void, String>
    {

        @Override
        protected void onPreExecute() {             //Inicio de tarea
            pro.setVisibility(View.VISIBLE);
        }

        @Override
        protected String doInBackground(String... strings) {        //DEsarroollo tarea

            for (int i = 1; i<=10; i++)
            {
                try{
                    Thread.sleep(500);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {            //que pasa despues de mi tarea
            Intent i =new Intent(getBaseContext(),Menu_act.class);
            startActivity(i);
        }
    }




    // Tarea pesada
    //public void Hilo(View v)            //botar la app
    //{
      //  for (int i = 1; i<=10; i++)
        //{
        //    try{
          //      Thread.sleep(2000);
            //}
           // catch (Exception e)
           // {
            //    e.printStackTrace();
            //}
        }

