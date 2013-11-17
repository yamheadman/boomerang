package com.example.boomerang;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.*;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
    
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }
    
    /** Called when the user clicks the Add Client button */
    public void goToClient(View view) {
    	Intent intent = new Intent(this, ChooseClient.class);
    	startActivity(intent);
    }
    

    
}
