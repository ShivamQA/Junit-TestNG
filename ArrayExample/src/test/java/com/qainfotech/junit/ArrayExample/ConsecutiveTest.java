package com.qainfotech.junit.ArrayExample;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.*;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class ConsecutiveTest 
{
    @Test
    public void TestArray() 
    {
    	ConsectiveArrayList ob = new ConsectiveArrayList();
    	ArrayList<String> ar1 = new ArrayList<String>();
    	ar1.add("Apple");
        ar1.add("Hello");
        ar1.add("Shivam");
        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("Apple");
        ar2.add("Hello");
        ArrayList<String> ls =new ArrayList<String>(); 
       		ls=ob.consecutive(ar1);
		assertEquals("Test Case Failed",ar2,ls);
		
        
    }
    @Test
    public void TestArrayInteger()  
    {
    	ConsectiveArrayList ob = new ConsectiveArrayList();
    	ArrayList<String> ar1 = new ArrayList<String>();
    	ar1.add("1992");
        ar1.add("112");
        ar1.add("1234");
        ArrayList<String> ar2 = new ArrayList<String>();
        
        
        assertEquals("String should only contain alphabets",ob.consecutive(ar1));
		
        
    }
}
