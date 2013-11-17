package com.example.boomerang;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

public class ItemList extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_item_list);
		
		//Get the client object
        SingleClient theClient = SingleClient.getInstance();
        //Client client = theClient.getClient();
        
        //TEST CODE *****
        Client client = new Client();
        ArrayList <Item> itemList= new ArrayList<Item>();
        Item item = new Item();
        
        //Define layouts objects to add
        TextView type;
        LinearLayout ll;
        ScrollView sv = new ScrollView(this);
        
        //Populate the list view with the items
        for(int i = 0; i<10; i++){
        	item.setType("Test");
        	
        	itemList.add(item);
            type = new TextView(this);
            type.setText(item.getType());
            ll = new LinearLayout(this);
            ll.addView(type);
            sv.addView(ll);
        	
        	
        }
        //END TEST CODE *****
        
        
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.item_list, menu);
		return true;
	}

}
