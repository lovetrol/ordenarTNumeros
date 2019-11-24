package com.example.ordenartnumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public static EditText editTextNumber1, editTextNumber2, editTextNumber3, editTextNumber4,
            editTextNumber5, editTextNumber6, editTextNumber7, editTextNumber8,
            editTextNumber9, editTextNumber10, editTextNumber11, editTextNumber12,
            editTextNumber13, editTextNumber14, editTextNumber15, editTextNumber16,
            editTextNumber17, editTextNumber18, editTextNumber19, editTextNumber20;

    private TextView textViewNumerosOrdenados;

    private Button buttonOrdenar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        editTextNumber3 = findViewById(R.id.editTextNumber3);
        editTextNumber4 = findViewById(R.id.editTextNumber4);
        editTextNumber5 = findViewById(R.id.editTextNumber5);
        editTextNumber6 = findViewById(R.id.editTextNumber6);
        editTextNumber7 = findViewById(R.id.editTextNumber7);
        editTextNumber8 = findViewById(R.id.editTextNumber8);
        editTextNumber9 = findViewById(R.id.editTextNumber9);
        editTextNumber10 = findViewById(R.id.editTextNumber10);
        editTextNumber11 = findViewById(R.id.editTextNumber11);
        editTextNumber12 = findViewById(R.id.editTextNumber12);
        editTextNumber13 = findViewById(R.id.editTextNumber13);
        editTextNumber14 = findViewById(R.id.editTextNumber14);
        editTextNumber15 = findViewById(R.id.editTextNumber15);
        editTextNumber16 = findViewById(R.id.editTextNumber16);
        editTextNumber17 = findViewById(R.id.editTextNumber17);
        editTextNumber18 = findViewById(R.id.editTextNumber18);
        editTextNumber19 = findViewById(R.id.editTextNumber19);
        editTextNumber20 = findViewById(R.id.editTextNumber20);

        buttonOrdenar = findViewById(R.id.buttonOrdenar);




            buttonOrdenar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int count = 0;

                    editTextNumber1.setError(null);
                    editTextNumber2.setError(null);
                    editTextNumber3.setError(null);
                    editTextNumber4.setError(null);
                    editTextNumber5.setError(null);
                    editTextNumber6.setError(null);
                    editTextNumber7.setError(null);
                    editTextNumber8.setError(null);
                    editTextNumber9.setError(null);
                    editTextNumber10.setError(null);
                    editTextNumber11.setError(null);
                    editTextNumber12.setError(null);
                    editTextNumber13.setError(null);
                    editTextNumber14.setError(null);
                    editTextNumber15.setError(null);
                    editTextNumber16.setError(null);
                    editTextNumber17.setError(null);
                    editTextNumber18.setError(null);
                    editTextNumber19.setError(null);
                    editTextNumber20.setError(null);


                    String editText1 = editTextNumber1.getText().toString().trim();
                    String editText2 = editTextNumber2.getText().toString().trim();
                    String editText3 = editTextNumber3.getText().toString().trim();
                    String editText4 = editTextNumber4.getText().toString().trim();
                    String editText5 = editTextNumber5.getText().toString().trim();
                    String editText6 = editTextNumber6.getText().toString().trim();
                    String editText7 = editTextNumber7.getText().toString().trim();
                    String editText8 = editTextNumber8.getText().toString().trim();
                    String editText9 = editTextNumber9.getText().toString().trim();
                    String editText10 = editTextNumber10.getText().toString().trim();
                    String editText11 = editTextNumber11.getText().toString().trim();
                    String editText12 = editTextNumber12.getText().toString().trim();
                    String editText13 = editTextNumber13.getText().toString().trim();
                    String editText14 = editTextNumber14.getText().toString().trim();
                    String editText15 = editTextNumber15.getText().toString().trim();
                    String editText16 = editTextNumber16.getText().toString().trim();
                    String editText17 = editTextNumber17.getText().toString().trim();
                    String editText18 = editTextNumber18.getText().toString().trim();
                    String editText19 = editTextNumber19.getText().toString().trim();
                    String editText20 = editTextNumber20.getText().toString().trim();




                    if(editText1.isEmpty()){
                        editTextNumber1.setError(getText(R.string.mensajedeError));
                    }else{
                        count += 1;
                    }

                    if(editText2.isEmpty()){

                        editTextNumber2.setError(getText(R.string.mensajedeError));
                    }else{
                        count += 1;
                    }

                    if(editText3.isEmpty()){
                        editTextNumber3.setError(getText(R.string.mensajedeError));
                    } else {
                        count += 1;
                    }

                    if(editText4.isEmpty()){
                        editTextNumber4.setError(getText(R.string.mensajedeError));
                    }else {
                        count += 1;
                    }

                    if(editText5.isEmpty()){
                        editTextNumber5.setError(getText(R.string.mensajedeError));
                    }else{
                        count += 1;
                    }

                    if(editText6.isEmpty()){
                        editTextNumber6.setError(getText(R.string.mensajedeError));
                    }else{
                        count += 1;
                    }

                    if(editText7.isEmpty()){
                        editTextNumber7.setError(getText(R.string.mensajedeError));
                    } else {
                        count += 1;
                    }

                    if(editText8.isEmpty()){
                        editTextNumber8.setError(getText(R.string.mensajedeError));
                    }else {
                        count += 1;
                    }

                    if(editText9.isEmpty()){
                        editTextNumber9.setError(getText(R.string.mensajedeError));
                    }else{
                        count += 1;
                    }

                    if(editText10.isEmpty()){
                        editTextNumber10.setError(getText(R.string.mensajedeError));
                    }else{
                        count += 1;
                    }

                    if(editText11.isEmpty()){
                        editTextNumber11.setError(getText(R.string.mensajedeError));
                    } else {
                        count += 1;
                    }

                    if(editText12.isEmpty()){
                        editTextNumber12.setError(getText(R.string.mensajedeError));
                    }else {
                        count += 1;
                    }

                    if(editText13.isEmpty()){
                        editTextNumber13.setError(getText(R.string.mensajedeError));
                    }else{
                        count += 1;
                    }

                    if(editText14.isEmpty()){
                        editTextNumber14.setError(getText(R.string.mensajedeError));
                    }else{
                        count += 1;
                    }

                    if(editText15.isEmpty()){
                        editTextNumber15.setError(getText(R.string.mensajedeError));
                    } else {
                        count += 1;
                    }

                    if(editText16.isEmpty()){
                        editTextNumber16.setError(getText(R.string.mensajedeError));
                    }else {
                        count += 1;
                    }

                    if(editText17.isEmpty()){
                        editTextNumber17.setError(getText(R.string.mensajedeError));
                    }else{
                        count += 1;
                    }

                    if(editText18.isEmpty()){
                        editTextNumber18.setError(getText(R.string.mensajedeError));
                    }else{
                        count += 1;
                    }

                    if(editText19.isEmpty()){
                        editTextNumber19.setError(getText(R.string.mensajedeError));
                    } else {
                        count += 1;
                    }

                    if(editText20.isEmpty()){
                        editTextNumber20.setError(getText(R.string.mensajedeError));
                    }else {
                        count += 1;
                    }

                    if(count==20){
                        ordenar();
                    }
                }
            });
    }

    /*El método que use es el ordenamiento de burbuja / método de la burbuja*/
    public void ordenar(){

        int num1 = Integer.parseInt(editTextNumber1.getText().toString());
        int num2 = Integer.parseInt(editTextNumber2.getText().toString());
        int num3 = Integer.parseInt(editTextNumber3.getText().toString());
        int num4 = Integer.parseInt(editTextNumber4.getText().toString());
        int num5 = Integer.parseInt(editTextNumber5.getText().toString());
        int num6 = Integer.parseInt(editTextNumber6.getText().toString());
        int num7 = Integer.parseInt(editTextNumber7.getText().toString());
        int num8 = Integer.parseInt(editTextNumber8.getText().toString());
        int num9 = Integer.parseInt(editTextNumber9.getText().toString());
        int num10 = Integer.parseInt(editTextNumber10.getText().toString());
        int num11 = Integer.parseInt(editTextNumber11.getText().toString());
        int num12 = Integer.parseInt(editTextNumber12.getText().toString());
        int num13 = Integer.parseInt(editTextNumber13.getText().toString());
        int num14 = Integer.parseInt(editTextNumber14.getText().toString());
        int num15 = Integer.parseInt(editTextNumber15.getText().toString());
        int num16 = Integer.parseInt(editTextNumber16.getText().toString());
        int num17 = Integer.parseInt(editTextNumber17.getText().toString());
        int num18 = Integer.parseInt(editTextNumber18.getText().toString());
        int num19 = Integer.parseInt(editTextNumber19.getText().toString());
        int num20 = Integer.parseInt(editTextNumber20.getText().toString());



        int orderNumbers[] = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10,
                               num11, num12, num13, num14, num15, num16, num17, num18, num19, num20};

        //Este anidamiento de loops representa el ordenamiento de los números, el método de la burbuja
        for(int i=0; i<orderNumbers.length; i++){
            for(int j=0; j<orderNumbers.length-i-1; j++){
                if(orderNumbers[j]>orderNumbers[j+1]){
                    int almacenaCambio = orderNumbers[j+1];
                    orderNumbers[j+1] = orderNumbers[j];
                    orderNumbers[j] = almacenaCambio;

                }
            }

        }


        textViewNumerosOrdenados = findViewById(R.id.textViewNumerosOrdenados);


        String almacenNumerosOrdenados = "";
        for(int i: orderNumbers){
            almacenNumerosOrdenados = almacenNumerosOrdenados + " " + i ;
            textViewNumerosOrdenados.setText(almacenNumerosOrdenados);
        }

    }



}
