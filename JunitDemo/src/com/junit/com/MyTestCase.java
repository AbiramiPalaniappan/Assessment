package com.junit.com;

import org.junit.Assert;
import org.junit.Test;


public class MyTestCase 
{
	@Test
    public void addtionTest()
	{
        int x=30;
        int y=20;
        int result=50;
        Calculator calculator = new Calculator();
        int finalResult=calculator.addition(x,y);
        Assert.assertEquals(result, finalResult);
    }
}
