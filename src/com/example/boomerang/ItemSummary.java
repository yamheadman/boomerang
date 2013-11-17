package com.example.boomerang;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

public class ItemSummary extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		ArrayList <Item> itemList= new ArrayList<Item>();
        Item item = new Item();
        
        //Define layouts objects to add
        TextView type;
        LinearLayout hl;
        LinearLayout ll;
        ScrollView sv = new ScrollView(this);
        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setPadding(50, 50, 50, 0);

        
        //Populate the list view with the items
        for(int i = 0; i<10; i++){
        	hl = new LinearLayout(this);
        	item.setType("Test");
        	
        	itemList.add(item);
            type = new TextView(this);
            type.setText("test");

            ll.addView(type);

        }
        
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