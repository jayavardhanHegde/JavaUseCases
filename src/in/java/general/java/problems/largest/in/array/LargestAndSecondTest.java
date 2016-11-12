package in.java.general.java.problems.largest.in.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jayavardhan
 *
 */
public class LargestAndSecondTest {

	@Before
	public void setUp(){
		
	}
	
	@Test
	public void testEmptyArray(){
		int[] inputArray = {};
		int[] result = LargestInArray.findLargestAndSecond(inputArray);
		Assert.assertArrayEquals(null, result);
	}
	
	@Test
	public void testSingleElement(){
		int[] inputArray = {5};
		int[] result = LargestInArray.findLargestAndSecond(inputArray);
		Assert.assertEquals(5, result[0]);
	}
	
	@Test
	public void testLargestAndsecond(){
		int[] numbers = {6,3,37,12,46,5,64,21};
		int[] result = LargestInArray.findLargestAndSecond(numbers);
		Assert.assertEquals(64, result[0]);
		Assert.assertEquals(46, result[1]);
	}
	
	@Test
	public void testWithSameNumber(){
		int[] numbers = {10,10,10};
		int[] result = LargestInArray.findLargestAndSecond(numbers);
		Assert.assertEquals(10, result[0]);
		Assert.assertEquals(10, result[0]);
	}
	
}
