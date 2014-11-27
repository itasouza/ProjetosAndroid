package com.example.calculodesalario;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import android.view.*;
import android.app.*;

public class SalarioActivity extends Activity {

	RadioGroup varROpcoes;
	Button varBntSalario;
	EditText varEdtSalario;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_salario);
		varEdtSalario = (EditText)findViewById(R.id.editsalario);
		varROpcoes = (RadioGroup)findViewById(R.id.rgOpcoes);
		varBntSalario = (Button)findViewById(R.id.btnCalcula);
		
		varBntSalario.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			  double salario = Double.parseDouble(varEdtSalario.getText().toString());
			  int op = varROpcoes.getCheckedRadioButtonId();
			  
			  double novo_salario = 0;
			  
			  if (op==R.id.rb40)
				  novo_salario = salario + (salario * 0.4);
			  else if (op==R.id.rb45)
				  novo_salario = salario + (salario * 0.45);
			  else if (op==R.id.rb50)
				  novo_salario = salario + (salario * 0.5);
				
			  
			  AlertDialog.Builder dialogo = new AlertDialog.Builder(SalarioActivity.this);
			  dialogo.setTitle("Novo Salário");
			  dialogo.setMessage("Seu novo salário é: R$" + String.valueOf(novo_salario));
			  dialogo.setNegativeButton("OK", null);
			  dialogo.show();
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.salario, menu);
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
