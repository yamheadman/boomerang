package com.example.boomerang;

public class Item {
	
	//variables
	private double length;
	private double width;
	private double height;
	private double minPrice;
	
	private String condition;
	private String type;
	private String color;
	private String material;
	private String comments;
	
	private boolean donate;
			
	//Methods
	public String getCondition() {
		return this.condition;
	}
	
	public void setCondition(String c) {
		this.condition = c;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setLength(int l) {
		this.length = l;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setWidtch(int w) {
		this.width = w;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(int h) {
		this.height = h;
	}
	
	public void setMinPrice(double p){
		this.minPrice = p;
	}
	
	public double getMinPrice(){
		return this.minPrice;
	}

	public void setType(String t){
		this.type = t;
	}
	
	public String getType(){
		return this.type;
	}

	public void setColor(String c){
		this.color = c;
	}
	
	public String getColor(){
		return this.color;
	}

	public void setMaterial(String m){
		this.material = m;
	}
	
	public String getMaterial(){
		return this.material;
	}

	public void setComments(String c){
		this.comments = c;
	}
	
	public String getComments(){
		return this.comments;
	}

	public void setDonate(boolean d){
		this.donate = d;
	}
	
	public boolean getDonate(){
		return this.donate;
	}
}
