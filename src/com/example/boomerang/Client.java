package com.example.boomerang;

import java.util.ArrayList;

public class Client {
	private String id; 
	private String phoneNumber;
	private ArrayList <Item> itemList= new ArrayList<Item>();
	
	public Client(){	
	}
	
	
	public Client(String i, String pn){
		this.id = i;
		this.phoneNumber=pn;
	}
	
	public void setId(String i){
		this.id = i;
	}
	
	public String getId(){
		return this.id;
	}
	
	public void setPN(String pn){
		this.phoneNumber = pn;
	}
	
	public String getPN(){
		return this.phoneNumber;
	}
	
    public int describeContents(){
        return 0;
    }

  
}
