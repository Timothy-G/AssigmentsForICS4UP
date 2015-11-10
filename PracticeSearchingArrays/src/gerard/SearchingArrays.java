package gerard;

import java.util.Scanner;

/**
 * @author 322040049
 *
 */
public class SearchingArrays {
	
	static Scanner scan = new Scanner(System.in);

	public static int linearSearch(int target, int [] ints){
		
		for(int i = 0; i < ints.length; i++){
			if (ints[i] == target)
			return i;
		}
		return -1;
	}

	public static int linearSearch1(double target, double [] doubles){
	
	for(int i = 0; i < doubles.length; i++){
		if (doubles[i] == target)
		return i;
	}
	return -1;
}

	public static int linearSearch2(String target, String [] Strings){
	
	for(int i = 0; i < Strings.length; i++){
		if (Strings[i].equals(target))
		return i;
	}
	return -1;
}
	public static int binarySearch(int target, int [] ints){
		int begIndex = 0;
		int endIndex = ints.length- 1;
				
		do{
		int midIndex = (begIndex + endIndex)/2;
		int i = midIndex;
		if (ints[midIndex] == target)
			return i;
		if (ints[midIndex] < target)
			begIndex = midIndex + 1;
		if (ints[midIndex] > target)
			endIndex = midIndex - 1;
		}while  (begIndex <= endIndex);
		
		return -1;

	}
	public static int binarySearch1(double target, double [] doubles){
		int begIndex = 0;
		int endIndex = doubles.length- 1;
				
		do{
		int midIndex = (begIndex + endIndex)/2;
		int i = midIndex;
		if (doubles[midIndex] == target)
			return i;
		if (doubles[midIndex] < target)
			begIndex = midIndex + 1;
		if (doubles[midIndex] > target)
			endIndex = midIndex - 1;
		}while  (begIndex <= endIndex);
		
		return -1;
	}
	
	public static int binarySearch2(String target, String [] Strings){
		int begIndex = 0;
		int endIndex = Strings.length- 1;
				
		do{
		int midIndex = (begIndex + endIndex)/2;
		int i = midIndex;
		if (target.compareTo(Strings[midIndex]) == 0)
			return i;
		if (target.compareTo(Strings[midIndex]) < 0)
			endIndex = midIndex - 1;
		if (target.compareTo(Strings[midIndex]) > 0)
			begIndex = midIndex + 1;
		}while  (begIndex <= endIndex);
		
		return -1;
	}

}
