package com.example.boomerang;

public class SingleClient{
	
	private static SingleClient THECLIENT = null;
	private Client client;
	 
	    // Private constructor suppresses 
	    private SingleClient(){}
	 

	    private synchronized static void createInstance() {
	        if (THECLIENT == null) { 
	            THECLIENT = new SingleClient();
	            THECLIENT.client = null;
	        }
	    }
	 
	    public static SingleClient getInstance() {
	        createInstance();
	        return THECLIENT;
	    }
	    
	    public void setClient(Client c){
	    	THECLIENT.client = c;
	    }
	    
	    public Client getClient(){
	    	return THECLIENT.client;
	    }
	    
	    
	    
	}

	
