package com.stackroute.demounit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TomJerryTest {


    @Test
    public void testtomjerry()
    {
    	TomJerry obj = new TomJerry();
        assertEquals("Tom", obj.func2(23));
    }
    
    @Test
    public void testtomjerry1()
    {
    	TomJerry obj = new TomJerry();
        assertEquals("Jerry", obj.func2(26));
    }
    
    
    @Test
    public void testtomjerry2()
    {
    	TomJerry obj = new TomJerry();
        assertEquals("Invalid input", obj.func2(31));
    }
}
