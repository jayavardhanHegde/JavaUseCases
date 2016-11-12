package in.java.general.java.problems.largest.in.array;

/**
 * Util class to find the largest and second largest 
 * element in the given array.
 * 
 * @author Jayavardhan Hegde
 *
 */

public class LargestInArray {
	
	/**
	 * Method returns an Integer array which holds the largest and second largest elements
	 * @param inputArray
	 * @return int[]
	 */
	public static int[] findLargestAndSecond(int[] inputArray){
		
		if(inputArray.length <= 0){
			return null;
		}
		
		int largestElement = inputArray[0];
		int secondLargest = 0;
		int[] largestAndsecond = new int[2];
		
		if(inputArray.length == 1){
			largestAndsecond[0] = inputArray[0];
		}
		
		for(int i=1; i<=inputArray.length-1 ; i++){
			
			if(largestElement < inputArray[i]){
				secondLargest = largestElement;
				largestElement = inputArray[i];
			}else if(secondLargest < inputArray[i]){
				secondLargest = inputArray[i];
			}
		}
		
		largestAndsecond[0] = largestElement;
		largestAndsecond[1] = secondLargest;
		
		return largestAndsecond;
	}
}
