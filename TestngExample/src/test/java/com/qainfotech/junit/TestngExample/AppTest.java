package com.qainfotech.junit.TestngExample;


import java.util.ArrayList;

import org.testng.*;
import org.testng.annotations.Test;


public class AppTest
{
    @Test
    public void TestArray()
    {
    	App ob = new App();
    	ArrayList<String> ar1 = new ArrayList<String>();
    	ar1.add("Shivam");
        ar1.add("Apple");
        ar1.add("Hello");
        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("Apple");
        ar2.add("Hello");
        Assert.assertEquals(ar2,ob.consecutive(ar1),"Test Case Failed");
        
    }
}
