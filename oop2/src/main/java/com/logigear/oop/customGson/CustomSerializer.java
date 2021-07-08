package com.logigear.oop.customGson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CustomSerializer {
	
	public static String toString(Object obj) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(obj);
	}
	
}
