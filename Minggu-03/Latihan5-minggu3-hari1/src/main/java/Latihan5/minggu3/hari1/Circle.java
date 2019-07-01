package Latihan5.minggu3.hari1;

public class Circle extends Shape {

	   public Circle(){
	     type = "Circle";
	   }

	   @Override
	   public void draw() {
	      System.out.println("Inside Circle::draw() method.");
	   }
	}