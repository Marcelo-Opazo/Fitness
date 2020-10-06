package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Info_act extends AppCompatActivity {

    private VideoView videoV ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_act);

        videoV = (VideoView)findViewById(R.id.vd);


        //asigno a nuestro video al videoview atravez de su ruta
        String ruta = "android.resource://"+ getPackageName() + "/" + R.raw.video; //obtenemos la ruta donde se encuentra el video y se almacena
                                                                                    // en una variable tipo String La R es porque vamos a la carpeta res(resource)

        Uri uri = Uri.parse(ruta);//le decimos a que seccion del containt provaider para decirle hacia donde se tiene que direccionar
        videoV.setVideoURI(uri); // para hacer que nuestro video se reproduzca

        //Controles del video.
        MediaController media = new MediaController(this); //ocupamos al clase media controller para asignar los controles del video y la declaramos como un objeto
        videoV.setMediaController(media);
    }
}