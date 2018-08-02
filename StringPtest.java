package com.stackroute.demounit;
import static org.junit.Assert.*;
import org.junit.Test;


public class StringPtest {

	public class StringPTest
	{
			@Test
			public void reverseTest()
			{
				StringP s=new StringP();
				String result=s.reverse("abc");
				assertEquals("cba",result);
			}
	}


}
