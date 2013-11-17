package com.example.boomerang;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.*;

public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    /** Called when the user clicks the Add Client button */
    public void goToClient(View view) {
    	Intent intent = new Intent(this, ClientActivity.class);
    	startActivity(intent);
    }
    

    
}
