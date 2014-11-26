package com.example.sistemadecompras;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import android.view.*;
import android.app.*;


public class ComprasActivity extends Activity {

	//declaração das variáveis
	CheckBox varchkarroz, varchkleite, varchkcarne, varchkfeijao;
	Button varbtnTotal;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras);
        
        varchkarroz = (CheckBox)findViewById(R.id.chkarroz);
        varchkcarne = (CheckBox)findViewById(R.id.chkcarne);
        varchkfeijao = (CheckBox)findViewById(R.id.chkfeijao);
        varchkleite = (CheckBox)findViewById(R.id.chkleite);
        
        varbtnTotal = (Button)findViewById(R.id.btnTotal);
        
        varbtnTotal.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				double total =0;
				if(varchkarroz.isChecked())
				   total += 2.69;
				if(varchkleite.isChecked())
				total += 5.00;
				if(varchkcarne.isChecked())
			    	total += 9.7;
				if(varchkfeijao.isChecked())
				   total += 2.30;
				
				AlertDialog.Builder dialogo = new
				AlertDialog.Builder(ComprasActivity.this);
				dialogo.setTitle("Aviso");
				dialogo.setMessage("Valor total da compra :" +
				String.valueOf(total));
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
				
			}
		});
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.compras, menu);
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
