package com.example.boomerang;

import android.app.Application;

public class MyApplication extends Application
{
	   private static final Client theClient= new Client();
	   public static Client getClient() 
	   { return theClient; }
	 
}
