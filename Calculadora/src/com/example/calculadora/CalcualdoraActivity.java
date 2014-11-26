package com.example.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import android.view.*;
import android.app.*;
//http://www.apostilaandroid.net/


public class CalcualdoraActivity extends Activity {

	EditText varednumero1,varednumero2;
	Button varbtSomar, varbtSubtrair, varbtMultiplciar, varbtDividir;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcualdora);
        varednumero1 = (EditText) findViewById(R.id.ednumero1);
        varednumero2 = (EditText) findViewById(R.id.ednumero2);
        varbtSomar = (Button) findViewById(R.id.btnSomar);
        varbtSubtrair = (Button) findViewById(R.id.btnSubtrair);
        varbtMultiplciar =(Button) findViewById(R.id.btnMultiplicar);
        varbtDividir = (Button) findViewById(R.id.btnDividir);
        
       
        
        
        varbtSomar.setOnClickListener(new View.OnClickListener() {
        
        	@Override
        	public void onClick(View arg0) {
        		
        	double num1 = Double.parseDouble(varednumero1.getText().toString());
        	double num2 = Double.parseDouble(varednumero2.getText().toString());
            double soma = num1 + num2;
        	
            AlertDialog.Builder dialogo = new
        	AlertDialog.Builder(CalcualdoraActivity.this);
            
        	dialogo.setTitle("Resultado soma");
        	dialogo.setMessage("A soma é " + soma);
        	dialogo.setNeutralButton("OK", null);
        	dialogo.show();
        	
        	}
        	
        	});
        
        
        varbtSubtrair.setOnClickListener(new View.OnClickListener() {
            
        	@Override
        	public void onClick(View arg0) {
        		
        	double num1 = Double.parseDouble(varednumero1.getText().toString());
        	double num2 = Double.parseDouble(varednumero2.getText().toString());
            double subtracao = num1 - num2;
        	
            AlertDialog.Builder dialogo = new
        	AlertDialog.Builder(CalcualdoraActivity.this);
            
        	dialogo.setTitle("Resultado da Subtração");
        	dialogo.setMessage("A subtração é " + subtracao);
        	dialogo.setNeutralButton("OK", null);
        	dialogo.show();
        	
        	}
        	
        	});
        
        
        varbtMultiplciar.setOnClickListener(new View.OnClickListener() {
            
        	@Override
        	public void onClick(View arg0) {
        		
        	double num1 = Double.parseDouble(varednumero1.getText().toString());
        	double num2 = Double.parseDouble(varednumero2.getText().toString());
            double multiplicar = num1 * num2;
        	
            AlertDialog.Builder dialogo = new
        	AlertDialog.Builder(CalcualdoraActivity.this);
            
        	dialogo.setTitle("Resultado da Multiplicação");
        	dialogo.setMessage("A multiplicação é " + multiplicar);
        	dialogo.setNeutralButton("OK", null);
        	dialogo.show();
        	
        	}
        	
        	});
        
        
        
        varbtDividir.setOnClickListener(new View.OnClickListener() {
            
        	@Override
        	public void onClick(View arg0) {
        		
        	double num1 = Double.parseDouble(varednumero1.getText().toString());
        	double num2 = Double.parseDouble(varednumero2.getText().toString());
            double dividir = num1 / num2;
        	
            AlertDialog.Builder dialogo = new
        	AlertDialog.Builder(CalcualdoraActivity.this);
            
        	dialogo.setTitle("Resultado da Divisão");
        	dialogo.setMessage("A divisão é " + dividir);
        	dialogo.setNeutralButton("OK", null);
        	dialogo.show();
        	
        	}
        	
        	});
     
    }


    
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calcualdora, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
