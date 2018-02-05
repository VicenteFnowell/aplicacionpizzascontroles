package com.example.aplicacionpizzascontroles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


Spinner spmasa;
Button botonsiguienteing, botonsiguientetam;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Identificando vistas
        spmasa=(Spinner)findViewById(R.id.spmasas);
        botonsiguienteing=(Button)findViewById(R.id.btnsiguiente2);
        botonsiguientetam=(Button)findViewById(R.id.btnsiguiente3);




        //Rellenar Spinner
        String [] tipomasa={"Selecciona", "Clásica", "Fina", "Rústica", "Borde Queso"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,tipomasa);
        spmasa.setAdapter(adaptador);









    }//Fin OnCreate


    public void btnsiguiente1 (View view){
        //Recoger el item seleccionado de un Spinner
        String tipoSeleccionado = spmasa.getSelectedItem().toString();


        if (tipoSeleccionado.equals("Selecciona")){
            Toast.makeText(this, "Debes de seleccionar un tipo de masa de pizza", Toast.LENGTH_LONG).show();
        }else{
            // Toast.makeText(this,"Test seleccionado: "+tipoSeleccionado,Toast.LENGTH_LONG).show();
            botonsiguienteing.setEnabled(true);
            botonsiguientetam.setEnabled(true);

        }}





}//Fin MainActivity
