package com.carloschiluiza.operacionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Creamos la instancia de nuestros elementos
    EditText txtNumero1, txtNumero2;
    TextView lblResultado;

    //Creamos unas variables Globales para almacenar los 2 números ingresados
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumero1 = findViewById(R.id.txtNumero1);
        txtNumero2 = findViewById(R.id.txtNumero2);
        lblResultado = findViewById(R.id.lblResultado);
    }

    public void onClick(View view) {
        String txtNum1 = txtNumero1.getText().toString();
        String txtNum2 = txtNumero2.getText().toString();

        if (txtNum1.equals("") || txtNum2.equals("")) {
            Toast.makeText(this,"ERROR: SE DEBE INGRESAR DOS NUMEROS ENTERO!!!. No pueden estar vacio los Campos.",Toast.LENGTH_LONG).show();
        }else {
            num1 = Integer.parseInt(txtNumero1.getText().toString());
            num2 = Integer.parseInt(txtNumero2.getText().toString());

            switch (view.getId()) {
                case R.id.btnSumar:
                    suma();
                    break;
                case R.id.btnRestar:
                    restar();
                    break;
                case R.id.btnMultiplicar:
                    multiplicar();
                    break;
                case R.id.btnDividir:
                    dividir();
                    break;
            }
        }
    }

    private void suma() {
        int resultado = num1 + num2;
        lblResultado.setText("El Resultado de la SUMA es: " + resultado);
    }

    private void restar() {
        int resultado = num1 - num2;
        lblResultado.setText("El Resultado de la RESTA es: " + resultado);
    }

    private void multiplicar() {
        int resultado = num1 * num2;
        lblResultado.setText("El Resultado de la MULTIPLICACIÓN es: " + resultado);
    }

    private void dividir() {
        if(num2 != 0){
            int resultado = num1 / num2;
            lblResultado.setText("El Resultado de la DIVISIÓN es: " + resultado);
        }else{
            Toast.makeText(this,"BOBASOOOO!!!", Toast.LENGTH_LONG).show();
            lblResultado.setText("El Número 2 debe ser diferente a CERO");
        }

    }


    public void ClicText(View view) {
        lblResultado.setText("Resultado:");
    }
}
