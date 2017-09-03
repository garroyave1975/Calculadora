package com.example.gabrielarroyave.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Button bNueve, bOcho, bSiete, bSeis, bCinco, bCuatro, bTres, bDos, bUno, bCero, bSuma,
    bResta, bMultiplicacion, bDivision, bPunto, bIgual, bBorrar;

    private EditText etResultado, etConcatenar;

    private double operando1;
    private double operando2;
    private Double total;

    private String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bNueve=(Button)findViewById(R.id.bNueve);
        bOcho = (Button)findViewById(R.id.bOcho);
        bSiete = (Button)findViewById(R.id.bSiete);
        bSeis = (Button)findViewById(R.id.bSeis);
        bCinco = (Button)findViewById(R.id.bCinco);
        bCuatro = (Button)findViewById(R.id.bCuatro);
        bTres = (Button)findViewById(R.id.bTres);
        bDos = (Button)findViewById(R.id.bDos);
        bUno = (Button)findViewById(R.id.bUno);
        bCero = (Button)findViewById(R.id.bCero);
        bSuma = (Button)findViewById(R.id.bSuma);
        bResta = (Button)findViewById(R.id.bResta);
        bMultiplicacion = (Button)findViewById(R.id.bMultiplicacion);
        bDivision = (Button)findViewById(R.id.bDivision);
        bIgual = (Button)findViewById(R.id.bIgual);
        bPunto = (Button)findViewById(R.id.bPunto);
        bBorrar = (Button)findViewById(R.id.bBorrar);

        etResultado = (EditText) findViewById(R.id.etResultado);


        bCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etResultado);
                etResultado.setText(etConcatenar.getText().toString()+"0");
            }
        });

        bUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etResultado);
                etResultado.setText(etConcatenar.getText().toString()+"1");
            }
        });

        bDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etResultado);
                etResultado.setText(etConcatenar.getText().toString()+"2");
            }
        });

        bTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etResultado);
                etResultado.setText(etConcatenar.getText().toString()+"3");
            }
        });

        bCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etResultado);
                etResultado.setText(etConcatenar.getText().toString()+"4");
            }
        });

        bCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etResultado);
                etResultado.setText(etConcatenar.getText().toString()+"5");
            }
        });

        bSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etResultado);
                etResultado.setText(etConcatenar.getText().toString()+"6");
            }
        });

        bSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etResultado);
                etResultado.setText(etConcatenar.getText().toString()+"7");
            }
        });

        bOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etResultado);
                etResultado.setText(etConcatenar.getText().toString()+"8");
            }
        });

        bNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etResultado);
                etResultado.setText(etConcatenar.getText().toString()+"9");
            }
        });

        bPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etResultado);
                etResultado.setText(etConcatenar.getText().toString()+".");
            }
        });

        bIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etConcatenar = (EditText)findViewById(R.id.etResultado);
                operando2= Double.parseDouble(etConcatenar.getText().toString());
                if (operador.equals("+")){
                    etResultado.setText("");
                    total=operando1+operando2;
                }
                if (operador.equals("-")){
                    etResultado.setText("");
                    total=operando1-operando2;
                }
                if (operador.equals("X")){
                    etResultado.setText("X");
                    total=operando1*operando2;
                }
                if (operador.equals("/")){
                    etResultado.setText("");
                    if (operando2!=0){
                    total=operando1/operando2;}
                    else{
                        etResultado.setText("Infinito");
                    }
                }
                etResultado.setText(String.valueOf(total));
            }
        });
        bSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador="+";
                etConcatenar=(EditText)findViewById(R.id.etResultado);
                operando1= Double.parseDouble(etConcatenar.getText().toString());
                etResultado.setText("");
            }
        });
        bResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador="-";
                etConcatenar=(EditText)findViewById(R.id.etResultado);
                operando1= Double.parseDouble(etConcatenar.getText().toString());
                etResultado.setText("");
            }
        });
        bMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador="X";
                etConcatenar=(EditText)findViewById(R.id.etResultado);
                operando1= Double.parseDouble(etConcatenar.getText().toString());
                etResultado.setText("");
            }
        });
        bDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador="/";
                etConcatenar=(EditText)findViewById(R.id.etResultado);
                operando1= Double.parseDouble(etConcatenar.getText().toString());
                etResultado.setText("");
            }
        });
        bBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operando1=0;
                operando2=0;
                etResultado.setText("");
            }
        });

    }

}

