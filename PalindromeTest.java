package com.stackroute.demounit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeTest {


    @Test
    public void testpal()
    {
    	PalindromeEx obj = new PalindromeEx();
        assertEquals("123 is not a palindrome ", obj.func1(123));
    }
    
    @Test
    public void testpal1()
    {
    	PalindromeEx obj = new PalindromeEx();
        assertEquals("234432 is palindrome and the sum of even numbers is less than 25", obj.func1(234432));
    }
    
    @Test
    public void testpal2()
    {
    	PalindromeEx obj = new PalindromeEx();
        assertEquals("888888 is palindrome and the sum of even numbers is greater than 25", obj.func1(888888));
    }
}