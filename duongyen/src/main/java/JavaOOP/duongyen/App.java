package JavaOOP.duongyen;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<Vertex> vertex = new ArrayList<Vertex>();
    	vertex.add(new Vertex(1,1));
    	vertex.add(new Vertex(3,1));
    	vertex.add(new Vertex(1,4));
    	
    	Triangle newTriangle = new Triangle("PURPLE", vertex);
    	System.out.println(newTriangle.getPerimeter());
    	System.out.println(newTriangle.toString());
    	
    
    	
    	
    }
}
