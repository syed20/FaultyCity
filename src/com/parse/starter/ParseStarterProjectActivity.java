package com.parse.starter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;

import com.parse.ParseAnalytics;
import com.parse.ui.ParseLoginBuilder;

public class ParseStarterProjectActivity extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
Button btn_top = (Button) findViewById(R.id.btn_top);
		
		btn_top.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(),TermsandCondition.class);
				startActivityForResult(intent,0);
			}
			 
		});
		
	
		ParseAnalytics.trackAppOpened(getIntent());
		
		
		ParseLoginBuilder builder = new ParseLoginBuilder(ParseStarterProjectActivity.this);
		startActivityForResult(builder.build(), 0);
	
	}
}

