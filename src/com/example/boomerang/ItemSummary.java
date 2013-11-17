package com.example.boomerang;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class ItemSummary extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Initialize Singleton Client
		SingleClient sClient = SingleClient.getInstance();
		Client client = sClient.getClient();
	  
		
	//Add item to client array of items
		
		
		ArrayList <Item> itemList= client.getItems();
        Item item;
        
        //Define layouts objects to add
        TextView type;
        LinearLayout hl;
        LinearLayout ll;
        ScrollView sv = new ScrollView(this);
        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setPadding(50, 50, 50, 0);

        
        //Populate the list view with the items
        for(int i = 0; i<itemList.size(); i++){
        	hl = new LinearLayout(this);
        	hl.setPadding(50, 20, 50, 0);
        	
        	item = itemList.get(i);
        	
        //	item.setType("Test");
        	
            type = new TextView(this);
            type.setText(item.getType());
            hl.addView(type);
            
            ll.addView(hl);

        }
        Toast.makeText(getApplicationContext(), ""+itemList.size(), Toast.LENGTH_LONG).show();
        
        Button submitButton = new Button(this);
        submitButton.setText(R.string.submit);
    	hl = new LinearLayout(this);
    	hl.setPadding(50, 20, 50, 0);
    	hl.addView(submitButton);
        
        ll.addView(hl);
        
        
        sv.addView(ll);
        
        
        setContentView(sv);
        //END TEST CODE *****
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.item_summary, menu);
		return true;
	}

}
