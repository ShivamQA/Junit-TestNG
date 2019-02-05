package com.qainfotech.junit.TestngExample;
import java.util.*;
public class App 
{
	public ArrayList<String> consecutive(ArrayList<String> ls)
	{
		ArrayList<String> ls1 = new ArrayList<String>();
		int j;
		for(int i=0;i<ls.size();i++)  
        {  
			for(j=1;j<ls.get(i).length();j++)
			{
				if(ls.get(i).charAt(j) == ls.get(i).charAt(j-1))
	            {
	                ls1.add(ls.get(i));
	                break;
	            }
			}     
        }  
		
		return ls1;
	}
    public static void main( String[] args )
    {
      App ob = new App();
		/*
		 * ArrayList<String> ar1 = new ArrayList<String>(); ar1.add("Shivam");
		 * ar1.add("Apple"); ar1.add("Hello"); ArrayList<String> ar2 =
		 * ob.consecutive(ar1); System.out.println(ar2);
		 */
    }
}

