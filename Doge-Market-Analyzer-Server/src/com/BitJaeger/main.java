package com.BitJaeger;

import java.io.File;
import java.util.ArrayList;

import org.json.simple.JSONObject;

public class main {

	
	public static void main(String[] args) {

		System.out.println("DMA up");
		
		//Load the config
		ArrayList<Bot> bots = loadConfig();
		if(bots == null)
			return;
		
		//Start the bots 
		for(int i=0;i<bots.size();i++){
			
		}
			
	}
	
	private static ArrayList<Bot> loadConfig() {
		
		System.out.println("Loading config file...");
		
		ArrayList<Bot> bots	= new ArrayList<Bot>();
		File configFile		= new File("DMA-config.txt");
		
		//Check if the config file exists
		if(!configFile.exists()){
			System.out.println("No config file found, exiting...");
			return null;
		}
		
		//Load raw config file
		StringBuilder input = new StringBuilder();
		
		//Convert to JSON
		JSONObject configObject = new JSONObject();
		
		return bots;
	}

}
