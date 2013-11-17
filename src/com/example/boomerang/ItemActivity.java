package com.example.boomerang;

import java.io.File;
import java.util.ArrayList;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ItemActivity extends Activity {
	
	  private Spinner conditionSpinner;
	  private Spinner itemTypeSpinner;
	  private Spinner colorSpinner;
	  private Spinner materialSpinner;
	  private TextView comments;

		private boolean donate;
		
		private double length;
		private double width;
		private TextView height;
		private double minPrice;
	  
	  private File output=null;
	  
	  private static final int CONTENT_REQUEST = 100;
	  private static final int RESULT_LOAD_IMAGE = 200;
	  
	 // private Button submit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.item_activity);
		

		
		
		//Initialize inputs
		createConditionSpinner();
		createItemTypeSpinner();
		createColorSpinner();
		createMaterialSpinner();
		createComments();
		createHeight();
		
		
		/*Button btn = (Button) findViewById(R.id.add_items);
		  
		btn.setOnClickListener(new View.OnClickListener() {
	          public void onClick(View v) {
	              // Perform action on click
	        	  takePicture();
	          }

		});
		
		Button submit = (Button) findViewById(R.id.submit);
		submit.setOnClickListener(new View.OnClickListener() {
	          public void onClick(View v) {
	              // Perform action on click
	        	  //createItem();
	          }

		});
		
		Button gallery = (Button) findViewById(R.id.gallery);
		gallery.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				goGallery();
			}

		});		*/
	}

		
	  public void createItemTypeSpinner() {
		  
			itemTypeSpinner = (Spinner) findViewById(R.id.item_type_input);
			// Create an ArrayAdapter using the string array and a default spinner layout
			ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
			        R.array.item_type, android.R.layout.simple_spinner_item);
			// Specify the layout to use when the list of choices appears
			
			adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			// Apply the adapter to the spinner
			itemTypeSpinner.setAdapter(adapter);

		  }
	  
	  public void createConditionSpinner() {
		  
			conditionSpinner = (Spinner) findViewById(R.id.condition_spinner);
			// Create an ArrayAdapter using the string array and a default spinner layout
			ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
			        R.array.condition_spinner, android.R.layout.simple_spinner_item);
			// Specify the layout to use when the list of choices appears
			
			adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			// Apply the adapter to the spinner
			conditionSpinner.setAdapter(adapter);

		  }
	  
	  public void createColorSpinner() {
		  
			colorSpinner = (Spinner) findViewById(R.id.color_spinner);
			// Create an ArrayAdapter using the string array and a default spinner layout
			ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
			        R.array.color_string, android.R.layout.simple_spinner_item);
			// Specify the layout to use when the list of choices appears
			
			adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			// Apply the adapter to the spinner
			colorSpinner.setAdapter(adapter);

		  }
	  
	  public void createMaterialSpinner() {
		  
			materialSpinner = (Spinner) findViewById(R.id.material_spinner);
			// Create an ArrayAdapter using the string array and a default spinner layout
			ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
			        R.array.material_string, android.R.layout.simple_spinner_item);
			// Specify the layout to use when the list of choices appears
			
			adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			// Apply the adapter to the spinner
			materialSpinner.setAdapter(adapter);

		  }
	  
	  public void createComments() {
		  
			comments = (TextView) findViewById(R.id.comments_input);
		  }
	  
	  public void createHeight() {
		  
			height = (EditText) findViewById(R.id.comments_input);
		  }
	  
	  public void takePicture() {
		  //Toast.makeText(getApplicationContext(), "Test", Toast.LENGTH_LONG).show();
		  Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		  File dir=
			        Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);

			    output=new File(dir, "CameraContentDemo.jpeg");
			    intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(output));

			    startActivityForResult(intent, CONTENT_REQUEST);
	  }
	  
	  public void goGallery() {
		  Intent galleryIntent = new Intent(Intent.ACTION_GET_CONTENT);
          galleryIntent.setType("image/png");
          startActivityForResult(galleryIntent, RESULT_LOAD_IMAGE);
	  }
	  
	  public void createItem(){
		  
		  //Create the Item object
		  Item item = new Item();
		  
		  //Set properties
		  String condition = conditionSpinner.getSelectedItem().toString();
		  String type = itemTypeSpinner.getSelectedItem().toString();
		  String color = colorSpinner.getSelectedItem().toString();
		  String material = materialSpinner.getSelectedItem().toString();
		 // double heightInput =  Double.parseDouble(height.getText().toString());
		  
		  //Set properties on the item
		  item.setCondition(condition);
		  item.setType(type);
		  item.setColor(color);
		  item.setMaterial(material);
		 // item.setHeight(heightInput);
		  
		  item.setComments(comments.getText().toString());
		  
			//Initialize Singleton Client
			SingleClient sClient = SingleClient.getInstance();
			Client client = sClient.getClient();
		  
			
		//Add item to client array of items
			
			ArrayList <Item> items = new ArrayList <Item>();
			
			
			//items = sClient.getClient().getItems();
		  
		
		  items.add(item);
		  
		  
		  //Update Singleton Client with updated client
		  
		  client.setItems(items);
		  
		  sClient.setClient(client);
		  
		  
		 
		  
		  
		 // Toast.makeText(getApplicationContext(), client.getId(), Toast.LENGTH_LONG).show();

	  }
	  
	  
	  public void goToSummary(View view){
		  createItem();
		  
		 // Intent intent = new Intent(this, ItemSummary.class);	    	
	    	//startActivity(intent);
	  }
	  
	 
	/*  public void addListenerOnButton() {
		  
			conditionSpinner = (Spinner) findViewById(R.id.condition_spinner);

			submit = (Button) findViewById(R.id.submit);
		 
			submit.setOnClickListener(new OnClickListener() {
		 
			  @Override
			  public void onClick(View v) {
		 
			    Toast.makeText(MyAndroidAppActivity.this,
				"OnClickListener : " + 
		                "\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()) + 
		                "\nSpinner 2 : "+ String.valueOf(spinner2.getSelectedItem()),
					Toast.LENGTH_SHORT).show();
			  }
		 
			});
		  }*/



	

}
