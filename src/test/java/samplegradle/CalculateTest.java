package samplegradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {

	public float calculateInterest(float pr,float rate,float time)
	{
		return pr*time*rate/100;
	}
	public static void main(String[] args)
	{
		CalculateTest c=new CalculateTest();
		System.out.println(c.calculateInterest(4000,4,3));
	}
}
