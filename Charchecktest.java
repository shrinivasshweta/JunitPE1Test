package com.stackroute.demounit;

import static org.junit.Assert.*;

import org.junit.Test;


public class Charchecktest {


		@Test
		public void test() {
			Charcheck cc=new Charcheck();
			String result=cc.checkCha(5);
			assertEquals("Number",result);
			
		}

	}
