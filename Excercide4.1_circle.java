package com.exercise4_1;
public class Circle {
    private double radius; 
    private String color;  
  
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    
    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }
   
    public double getRadius() {
        return radius;
    }
  
    public String getColor() {
        return color;
    }
    
    public double getArea() {
        return Math.PI * radius * radius; 
    }
    
    @Override
    public String toString() {
        return "Circle: radius=" + radius + ", color=" + color;
    }
}
public class Cylinder  extends Circle{
	
	 private double height; 
	    
	    public Cylinder() {
	        super(); 
	        height = 1.0; 
	    }
	   
	    public Cylinder(double height) {
	        super(); 
	        this.height = height;
	    }
	   
	    public Cylinder(double radius, double height) {
	        super(radius); 
	        this.height = height;
	    }
	    
	    public double getHeight() {
	        return height; 
	    }
	   
	    @Override
	    public double getArea() {
	      
	        return (2 * Math.PI * getRadius() * height) + (2 * super.getArea());
	    }
	   
	    public double getVolume() {
	        return super.getArea() * height; 
	    }
	    
	    @Override
	    public String toString() {
	        return "Cylinder: subclass of " + super.toString() + ", height=" + height;
	    }
	}
public class Test {
    public static void main(String[] args) {
        
        Cylinder c1 = new Cylinder();
        System.out.println(c1);
        
        Cylinder c2 = new Cylinder(10.0);
        System.out.println(c2);
       
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println(c3);
        
        System.out.println("Cylinder 1 volume: " + c1.getVolume());
        System.out.println("Cylinder 2 volume: " + c2.getVolume());
        System.out.println("Cylinder 3 volume: " + c3.getVolume());
    }
}

