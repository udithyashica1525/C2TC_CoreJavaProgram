package day1;

public class PrimitiveDataTypesDemoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           byte byteMax = 127;
           byte byteMin = -128;
           
           System.out.println("Min range of byte is"+ byteMin+"Max range of byte is "+byteMax);
           
           short shortMax = 12345;
           short shortMin = -12345;
           
           System.out.println("Minshort range of byte is" +shortMin+ "Maxshort range of byte is "+shortMax);
           
           int maxInt = 123456789;
           int minInt = -123456789;
           System.out.println("Minint range of byte is" +minInt+ "Maxint range of byte is" +maxInt);
           
           long maxLong = 1234567891012345L;
           long minLong = -1234567891012345L;
           System.out.println("Minlong range of byte is"+minLong+"Maxlong range of byte is "+maxLong);
   		
   		float f=3234.141243278345f;
   		double d=3456.14124512345678902345678914f;
   		System.out.println("float value is "+f+" double value is "+d);
   		
   		//boolean 
   		boolean flag=false;
   		System.out.println("boolean value is "+flag); 
	}

}
