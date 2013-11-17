package com.example.boomerang;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class ChooseClient extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_choose_client);
		

        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.choose_client, menu);
		return true;
	}

    public void addItems(View view) {
    	//Create a client object
    	Client client = new Client();
        
    	//set the Client
    	SingleClient theClient = SingleClient.getInstance();
    	theClient.setClient(client);
    	
    	Intent intent = new Intent(this, AddItems.class);
    	
    	startActivity(intent);
    }
	
}
