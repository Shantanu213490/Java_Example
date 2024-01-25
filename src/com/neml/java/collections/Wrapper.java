package com.neml.java.collections;

public class Wrapper {
	
	public static void main(String[] args) {
		
		int a = 20;
		char ch= 'c';
		boolean flag = true;
		primitiveToWrapper(a,ch,flag);
		
		System.out.println("--------------------------------------------------------");
		Float floatObj = 3.14f;
		Long longObj = 123535646577l;
		Double dObj = 98745.1245435d;
		wrapperToPrimitive(floatObj,longObj,dObj);
		
	}
	    public static void primitiveToWrapper(int a,char ch,boolean flag) {
		Integer intObj = Integer.valueOf(a);
		Character charObj = Character.valueOf(ch);
		Boolean bObj = Boolean.valueOf(flag);
		
		System.out.println("Value of Integer obj is "+intObj);
		System.out.println("Value of Character obj is "+charObj);
		System.out.println("Value of Boolean obj is "+bObj);
		}
	    
	    
	    public static void wrapperToPrimitive(Float floatObj,Long longObj,Double dObj) {
	    	
	    	float f = floatObj.floatValue();
	    	long l = longObj.longValue();
	    	double d = dObj.doubleValue();
	    	
	    	System.out.println("primitive Value of float is "+f);
			System.out.println("primitive Value of long is "+l);
			System.out.println("primitive Value of double is "+d);
	    }

}
