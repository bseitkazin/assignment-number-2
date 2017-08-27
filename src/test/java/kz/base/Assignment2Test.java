package kz.base;

import org.junit.Assert;
import org.junit.Test;

public class Assignment2Test {
	
	@Test
	public void test() {
		Assignment2 obj = new Assignment2();
		obj.setValue(123);
		int result = obj.getSumOfDigitsinInt(obj.getValue());
		Assert.assertEquals(result, 6);
	}
}