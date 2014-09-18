package com.parse.starter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;


public class TermsandCondition extends Activity {

	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_termsand_condition);
		Button btn_down=(Button) findViewById(R.id.btn_down);
		btn_down.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(),HappeningScene.class);
				startActivityForResult(intent,0);
			}
			 
		});
			 
	
		
	}

	
}
