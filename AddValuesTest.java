package com.stackroute.demounit;
import static org.junit.Assert.*;
import org.junit.Test;

public class AddValuesTest {
	@Test
	public void test() {
		AddValues av=new AddValues();
		int result=av.calVal();
		assertEquals(18,result);
	}

}
