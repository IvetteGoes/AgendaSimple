package com.example.saraivette.agendasimple;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.listView_lista);
        ArrayList<Datos>arraydatos = new ArrayList<Datos>();
        Datos datos ;

        datos= new Datos(getResources().getDrawable(R.drawable.sandy),"Sandra Bautista Zuñiga", "044-3331165054");
        arraydatos.add(datos);
        datos= new Datos(getResources().getDrawable(R.drawable.potter),"Javier Oropeza Chávez","044-333434660");
        arraydatos.add(datos);
        datos= new Datos(getResources().getDrawable(R.drawable.jj),"Jesús Ahumada Mendoza","044-3338422359");
        arraydatos.add(datos);
        datos= new Datos(getResources().getDrawable(R.drawable.poke),"Ángel Alamos González","044-3339702572");
        arraydatos.add(datos);

        AdapterDatos adapter = new AdapterDatos(this, arraydatos);
        lista.setAdapter(adapter);

    }


}
