package com.logigear.oop.customGson;

import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.logigear.oop.shape.Triangle;
import com.logigear.oop.shape.Vertex;

public class TriangleDeserializer implements JsonDeserializer<Triangle> {

	public Triangle deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
	
		JsonElement vertextes = json.getAsJsonObject().get("vertexes");
		
		Type vertexListType = new TypeToken<ArrayList<Vertex>>(){}.getType();
		
		Gson gson = new Gson();
		ArrayList<Vertex> realVertexes = gson.fromJson(vertextes.toString(), vertexListType);


		return new Triangle(json.getAsJsonObject().get("color").getAsString(), realVertexes);
	}

}
