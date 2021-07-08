package com.logigear.oop;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.logigear.oop.customGson.CustomDeserializer;
import com.logigear.oop.customGson.CustomSerializer;
import com.logigear.oop.customGson.TriangleDeserializer;
import com.logigear.oop.shape.Polygon;
import com.logigear.oop.shape.Rectangle;
import com.logigear.oop.shape.Triangle;
import com.logigear.oop.shape.Vertex;

public class MyApp {

	public static void main(String[] args) {
		String rectPath = "\\src\\test\\java\\files\\rect.json";
		
		Polygon rect = new Rectangle("PINK");
		rect.addVertex(new Vertex(1, 1));
		rect.addVertex(new Vertex(1, 3));
		rect.addVertex(new Vertex(3, 3));
		rect.addVertex(new Vertex(3, 1));
		
		String jsonStr = CustomSerializer.toString(rect);
		Utility.writeToFile(rectPath, jsonStr);
//		System.out.println(jsonStr);
		
		Polygon savedRect = CustomDeserializer.polygonDeserialize(Utility.readFromFile(rectPath), Rectangle.class);
		System.out.println(savedRect.getPerimeter());
		System.out.println(savedRect.toString());
	}
}