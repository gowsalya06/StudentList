package com.aspire.demo;



import java.util.ArrayList;
import java.util.Arrays;

public class Conversion {
	  public static void main(String[] args) {

	    // Array declaration and initialization
	    String cityNames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};

	    // Array to ArrayList conversion
	    ArrayList<String> cityList= new ArrayList<String>(Arrays.asList(cityNames));
	    
	   // String array[] = new String[cityList.size()];// ArrayList to String Array conversion 
	    

	    // Adding new elements to the list after conversion
	    cityList.add("Madras");
	    cityList.add("Delhi");

	    //print ArrayList elements using advanced for loop
	    for (String str: cityList)
	    {
	      System.out.println(str);
	    }
	  }
	}
