package com.example.myfirstapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    private TextView operador1, operador2,resultado,operacion;
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,mas, menos, por, div;
    public static int habilitado=0;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Relaciono los elementos de la vista con los objetos
        operador1= findViewById(R.id.txtoperador1);
        operador2= findViewById(R.id.txtoperador2);
        resultado= findViewById(R.id.txtresultado);
        operacion=findViewById(R.id.operacion);

        //inicializacion por defecto
        habilitado=operador1.getId();
        operador1.setHint("");

        operador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Habilitacion","Hemos habilitado el primer campo");
                habilitado=operador1.getId();
                operador1.setHint("");
                operador2.setHint("0");
            }
        });


        operador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Habilitacion","Hemos habilitado el segundo campo");
                habilitado=operador2.getId();
                operador2.setHint("");
                operador1.setHint("0");
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
        dialogo1.setTitle("Importante");
        dialogo1.setMessage("Debe escribir los numeros en las cajas de texto, y presionar el boton de la operacion deseada, tras lo cual el resultado aparecerá en la caja superior");
        dialogo1.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        }
    );
        dialogo1.show();
    }

    public void btn0(View view){
        Log.e("ID",String.valueOf(habilitado));
        if (habilitado!=0){

            TextView tx=findViewById(habilitado);
            tx.setText(tx.getText()+"0");
        }
    }
    public void btn1(View view){
        Log.e("ID",String.valueOf(habilitado));
        if (habilitado!=0){

            TextView tx=findViewById(habilitado);
            tx.setText(tx.getText()+"1");
        }
    }
    public void btn2(View view){
        Log.e("ID",String.valueOf(habilitado));
        if (habilitado!=0){

            TextView tx=findViewById(habilitado);
            tx.setText(tx.getText()+"2");
        }
    }
    public void btn3(View view){
        Log.e("ID",String.valueOf(habilitado));
        if (habilitado!=0){

            TextView tx=findViewById(habilitado);
            tx.setText(tx.getText()+"3");
        }
    }
    public void btn4(View view){
        Log.e("ID",String.valueOf(habilitado));
        if (habilitado!=0){

            TextView tx=findViewById(habilitado);
            tx.setText(tx.getText()+"4");
        }
    }
    public void btn5(View view){
        Log.e("ID",String.valueOf(habilitado));
        if (habilitado!=0){

            TextView tx=findViewById(habilitado);
            tx.setText(tx.getText()+"5");
        }
    }
    public void btn6(View view){
        Log.e("ID",String.valueOf(habilitado));
        if (habilitado!=0){

            TextView tx=findViewById(habilitado);
            tx.setText(tx.getText()+"6");
        }
    }
    public void btn7(View view){
        Log.e("ID",String.valueOf(habilitado));
        if (habilitado!=0){

            TextView tx=findViewById(habilitado);
            tx.setText(tx.getText()+"7");
        }
    }
    public void btn8(View view){
        Log.e("ID",String.valueOf(habilitado));
        if (habilitado!=0){

            TextView tx=findViewById(habilitado);
            tx.setText(tx.getText()+"8");
        }
    }
    public void btn9(View view){
        Log.e("ID",String.valueOf(habilitado));
        if (habilitado!=0){

            TextView tx=findViewById(habilitado);
            tx.setText(tx.getText()+"9");
        }
    }

    //definimos los botones de operaciones
    public void btnmas(View view){
        operacion.setText("+");

        resultado.setText(String.valueOf(valor(R.id.txtoperador2) + valor(R.id.txtoperador1)));
    }

    public void btnmenos(View view){
        operacion.setText("-");
        resultado.setText(String.valueOf(valor(R.id.txtoperador2) - valor(R.id.txtoperador1)));
    }
    public void btnpor(View view){
        operacion.setText("*");
        resultado.setText(String.valueOf(valor(R.id.txtoperador2) * valor(R.id.txtoperador1)));
    }
    public void btndiv(View view){
        Integer div=valor(operador2.getId());
        operacion.setText("/");
        if (div!=0) {
            resultado.setText(String.valueOf((float) valor(R.id.txtoperador1) / valor(R.id.txtoperador2)));
        }else{
            resultado.setText("Error_");
        }
    }
    public void btnborrar(View view){
        resultado.setText("0");
        operacion.setText("");
        operador1.setText("");
        operador2.setText("");
    }


    //metodo para devolver el valor en los textview
    private int valor(int id){
        TextView tx= findViewById(id);
        String r=tx.getText().toString();
        if (r==""){
            return 0;
        }else{
            return Integer.parseInt(r);
        }
    }



}