package Latihan2.minggu3.hari1;

public class FactoryProducer {
	  public static AbstractFactory getFactory(boolean rounded){   
	      if(rounded){
	         return new RoundedShapeFactory();         
	      }else{
	         return new ShapeFactory();
	      }
	   }
	}