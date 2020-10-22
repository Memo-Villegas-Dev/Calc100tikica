package com.androidavanzado.calc100tifika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button sumar, restar, multiplicar, dividir;
    Button t0,t1,t2,t3,t4,t5,t6,t7,t8,t9;
    Button tpunto, tigual, tborrar, tborrartodo, traiz, tpotencia,
            tmodulo, tcociente,tcuadrado, tcubo, tlogaritmon,
            tlogaritmo, tfactorial, tunoequis, tseno, tcoseno,
            ttangente, tdiezelevado, tabs, tsignos, tpi;
    EditText num;
    TextView resultado;
    Double op1, op2;
    Integer ope1, ope2;
    int operador;
    String primero, segundo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = (EditText) findViewById(R.id.numero);
        resultado = (TextView) findViewById(R.id.operacion);
        sumar = (Button) findViewById(R.id.sumar);
        restar = (Button) findViewById(R.id.restar);
        dividir = (Button) findViewById(R.id.dividir);
        multiplicar = (Button) findViewById(R.id.multiplicar);
        tpunto = (Button) findViewById(R.id.tpunto);
        tigual = (Button) findViewById(R.id.tigual);
        tborrar = (Button) findViewById(R.id.tborrar);
        tborrartodo = (Button) findViewById(R.id.tborrartodo);
        traiz = (Button) findViewById(R.id.traiz);
        tpotencia = (Button) findViewById(R.id.tpotencia);
        tmodulo = (Button) findViewById(R.id.tmodulo);
        tcociente = (Button) findViewById(R.id.tcociente);
        tcuadrado = (Button) findViewById(R.id.tcuadrado);
        tcubo = (Button) findViewById(R.id.tcubo);
        tlogaritmon = (Button) findViewById(R.id.tlogaritmon);
        tlogaritmo = (Button) findViewById(R.id.tlogaritmo);
        tfactorial = (Button) findViewById(R.id.tfactorial);
        tunoequis = (Button) findViewById(R.id.tunoequis);
        tseno = (Button) findViewById(R.id.tseno);
        tcoseno = (Button) findViewById(R.id.tcoseno);
        ttangente = (Button) findViewById(R.id.ttangente);
        tdiezelevado = (Button) findViewById(R.id.tdiezelevado);
        tabs = (Button) findViewById(R.id.tabs);
        tsignos = (Button) findViewById(R.id.tsignos);
        tpi = (Button) findViewById(R.id.tpi);
        t0 = (Button) findViewById(R.id.t0);
        t1 = (Button) findViewById(R.id.t1);
        t2 = (Button) findViewById(R.id.t2);
        t3 = (Button) findViewById(R.id.t3);
        t4 = (Button) findViewById(R.id.t4);
        t5 = (Button) findViewById(R.id.t5);
        t6 = (Button) findViewById(R.id.t6);
        t7 = (Button) findViewById(R.id.t7);
        t8 = (Button) findViewById(R.id.t8);
        t9 = (Button) findViewById(R.id.t9);

        sumar.setOnClickListener(this);
        restar.setOnClickListener(this);
        dividir.setOnClickListener(this);
        multiplicar.setOnClickListener(this);
        tpunto.setOnClickListener(this);
        tigual.setOnClickListener(this);
        tborrar.setOnClickListener(this);
        tborrartodo.setOnClickListener(this);
        traiz.setOnClickListener(this);
        tpotencia.setOnClickListener(this);
        tmodulo.setOnClickListener(this);
        tcociente.setOnClickListener(this);
        tcuadrado.setOnClickListener(this);
        tcubo.setOnClickListener(this);
        tlogaritmo.setOnClickListener(this);
        tlogaritmon.setOnClickListener(this);
        tfactorial.setOnClickListener(this);
        tunoequis.setOnClickListener(this);
        tseno.setOnClickListener(this);
        tcoseno.setOnClickListener(this);
        ttangente.setOnClickListener(this);
        tdiezelevado.setOnClickListener(this);
        tabs.setOnClickListener(this);
        tsignos.setOnClickListener(this);
        tpi.setOnClickListener(this);
        t0.setOnClickListener(this);
        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
        t3.setOnClickListener(this);
        t4.setOnClickListener(this);
        t5.setOnClickListener(this);
        t6.setOnClickListener(this);
        t7.setOnClickListener(this);
        t8.setOnClickListener(this);
        t9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        primero = num.getText().toString();
        switch (v.getId()) {
            case R.id.traiz:
                op1 = Double.parseDouble(primero);
                resultado.setText((Math.sqrt(op1)) + "");
                num.setText("");
                break;

            case R.id.sumar:
                op1 = Double.parseDouble(primero);
                operador = 0; // 0 = sumar
                resultado.setText(num.getText() + "+");
                num.setText("");
                break;

            case R.id.dividir:
                op1 = Double.parseDouble(primero);
                operador = 1; // 1 = dividir
                resultado.setText(num.getText() + "÷");
                num.setText("");
                break;

            case R.id.multiplicar:
                op1 = Double.parseDouble(primero);
                operador = 2; // 2 = multiplicar
                resultado.setText(num.getText() + "x");
                num.setText("");
                break;

            case R.id.tpotencia:
                op1 = Double.parseDouble(primero);
                operador = 3; //3 = potencia
                resultado.setText(num.getText() + "^");
                num.setText("");
                break;

            case R.id.tmodulo:
                ope1 = Integer.parseInt(primero);
                operador = 4; //4 = modulo
                resultado.setText(num.getText()+"%");
                num.setText("");
                break;

            case R.id.tcociente:
                ope1 = Integer.parseInt(primero);
                operador = 5; //5 = cociente
                resultado.setText(num.getText()+"÷");
                num.setText("");
                break;

            case R.id.tcuadrado:
                op1 = Double.parseDouble(primero);
                resultado.setText((Math.pow(op1,2)) + "");
                num.setText("");
                break;

            case R.id.tcubo:
                op1 = Double.parseDouble(primero);
                resultado.setText((Math.pow(op1,3)) + "");
                num.setText("");
                break;

            case R.id.tlogaritmon:
                op1 = Double.parseDouble(primero);
                resultado.setText((Math.log(op1))+"");
                num.setText("");
                break;

            case R.id.tlogaritmo:
                op1 = Double.parseDouble(primero);
                resultado.setText((Math.log10(op1))+"");
                num.setText("");
                break;

            case R.id.tfactorial:
                ope1 = Integer.parseInt(primero);
                int factorial = 1;
                for(int i = 2; i <= ope1; i++){
                    factorial = factorial * i;
                }
                resultado.setText((factorial)+"");
                num.setText("");
                break;

            case R.id.tunoequis:
                op1 = Double.parseDouble(primero);
                resultado.setText((1/op1)+"");
                num.setText("");
                break;

            case R.id.tseno:
                op1 = Double.parseDouble(primero);
                Double gradossin = Math.toRadians(op1);
                resultado.setText((Math.sin(gradossin))+"");
                num.setText("");
                break;

            case R.id.tcoseno:
                op1 = Double.parseDouble(primero);
                Double gradoscos = Math.toRadians(op1);
                resultado.setText((Math.cos(gradoscos))+"");
                num.setText("");
                break;

            case R.id.ttangente:
                op1 = Double.parseDouble(primero);
                Double gradostan = Math.toRadians(op1);
                resultado.setText((Math.tan(gradostan))+"");
                num.setText("");
                break;

            case R.id.tdiezelevado:
                ope1 = Integer.parseInt(primero);
                resultado.setText((Math.pow(10,ope1))+"");
                num.setText("");
                break;

            case R.id.tabs:
                op1 = Double.parseDouble(primero);
                resultado.setText((Math.abs(op1))+"");
                num.setText("");
                break;

            case R.id.tsignos:
                String result1 = resultado.getText().toString();
                double result = Double.parseDouble(result1);
                resultado.setText((result = result-(result*2))+"");
                break;

            case R.id.tpi:
                num.setText(num.getText()+"3.141592653589793");
                break;

            case R.id.tigual:
                if (operador == 0) {
                    op2 = Double.parseDouble(primero);
                    resultado.setText((op1 + op2) + "");
                }

                if (operador == 1) {
                    op2 = Double.parseDouble(primero);
                    resultado.setText((op1 / op2) + "");
                }

                if (operador == 2) {
                    op2 = Double.parseDouble(primero);
                    resultado.setText((op1 * op2) + "");
                }

                if (operador == 3){
                    op2 = Double.parseDouble(primero);
                    resultado.setText((Math.pow(op1,op2))+"");
                }

                if(operador == 4){
                    ope2 = Integer.parseInt(primero);
                    resultado.setText((ope1 % ope2) + "");
                }

                if(operador == 5){
                    ope2 = Integer.parseInt(primero);
                    resultado.setText((ope1 / ope2)+"");
                }
                num.setText("");
                break;

            case R.id.tborrar:
                num.setText("");
                break;

            case R.id.tborrartodo:
                resultado.setText("");
                break;

            case R.id.t0:
                num.setText(num.getText()+"0");
                break;

            case R.id.t1:
                num.setText(num.getText()+"1");
                break;

            case R.id.t2:
                num.setText(num.getText()+"2");
                break;

            case R.id.t3:
                num.setText(num.getText()+"3");
                break;

            case R.id.t4:
                num.setText(num.getText()+"4");
                break;

            case R.id.t5:
                num.setText(num.getText()+"5");
                break;

            case R.id.t6:
                num.setText(num.getText()+"6");
                break;

            case R.id.t7:
                num.setText(num.getText()+"7");
                break;

            case R.id.t8:
                num.setText(num.getText()+"8");
                break;

            case R.id.t9:
                num.setText(num.getText()+"9");
                break;

            case R.id.tpunto:
                num.setText(num.getText()+".");
                break;


        }
    }
}