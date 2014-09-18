package com.parse.starter;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

import android.app.Application;

public class ParseApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "Sm1UAiSlytOmejutgmAj7KCNLOmjTVCNSbhShWQK", "b5Pi67Mvnp31GU1LJopTR9MlkoVBI4aOOY1lwqu6");

		// Add your initialization code here


		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
	    
		// If you would like all objects to be private by default, remove this line.
		defaultACL.setPublicReadAccess(true);
		
		ParseACL.setDefaultACL(defaultACL, true);
	}

}
