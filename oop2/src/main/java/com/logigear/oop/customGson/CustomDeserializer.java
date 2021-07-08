package com.logigear.oop.customGson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.logigear.oop.Utility;
import com.logigear.oop.shape.Polygon;
import com.logigear.oop.shape.Triangle;

public class CustomDeserializer {

	public static Polygon polygonDeserialize(String json, Class<? extends Polygon> classType) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.fromJson(json, classType);
	}
	
	
	
//	public enum ShapeType {
//		Triangle, Rectangle, Square
//	}
	
//	public static Polygon deserialize(ShapeType type, String filePath) {
//
//		switch (type) {
//		case Triangle:
//			return triangleDeserializer(filePath);
//		default:
//			return null;
//		}
//
//	}
//
//	private static Triangle triangleDeserializer(String filePath) {
//
//		Gson gson = new GsonBuilder().registerTypeAdapter(Triangle.class, new TriangleDeserializer()).create();
//
//		return gson.fromJson(Utility.readFromFile(filePath), Triangle.class);
//
//	}

}
