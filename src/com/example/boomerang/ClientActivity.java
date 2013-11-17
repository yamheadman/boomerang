package com.example.boomerang;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class ClientActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.client_activity);
		
		SingleClient client = SingleClient.getInstance();
		
	}

    public void addItems(View view) {
    	Intent intent = new Intent(this, ItemActivity.class);
    	startActivity(intent);
    }
	
}
