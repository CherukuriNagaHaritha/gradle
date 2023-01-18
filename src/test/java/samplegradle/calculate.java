package samplegradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculate {

	public float calculateInterest(float pr,float rate,float time)
	{
		return pr*rate*time/100;
	}
	public static void main(String[] args)
	{
		calculate c=new calculate();
		System.out.println(c.calculateInterest(4000,4,3));
	}

}
