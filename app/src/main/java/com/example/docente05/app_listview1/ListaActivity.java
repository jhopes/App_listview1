package com.example.docente05.app_listview1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListaActivity extends ActionBarActivity {

    private ListView lv_ListaCursos;
    private ArrayAdapter ListaCursosAdapter;
    String[] ListaCurso= {"Lenguaje de Programación III",
            "Métodos Numéricos","Ingeniería Administrativa","Contabilidad II"
            ,"Ciencia y Biblia","Computación Gráfica", "Cálculo III","dddddd"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        lv_ListaCursos = (ListView) findViewById(R.id.listView);
        ListaCursosAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,ListaCurso);
        lv_ListaCursos.setAdapter(ListaCursosAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lista, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
