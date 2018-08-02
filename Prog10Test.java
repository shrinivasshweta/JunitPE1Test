package com.stackroute.demounit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prog10Test 
{

	@Test
	public void methodTest() 
	{
		Prog10 p=new Prog10();
		String result=p.method("welcome");
		assertEquals("welcomeomeomeome",result);
	}

}