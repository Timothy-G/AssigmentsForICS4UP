package gerard;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] ints = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println(SearchingArrays.linearSearch(14, ints));
		System.out.println(SearchingArrays.binarySearch(3, ints));
		
		double [] doubles = {1.444,2.5635,3.009,4.353,5.956895,6.43563,7.7,8.345,9.482,10.1,11.0,12.74,13.574,14.363,15.00000000000000000000001};
		System.out.println(SearchingArrays.linearSearch1(7.7, doubles)); 
		System.out.println(SearchingArrays.binarySearch1(4.353, doubles)); 
	
		String [] strings = {"Cat","Dog","Lemon","Zebra"};
		System.out.println(SearchingArrays.linearSearch2("Lemon", strings)); 
		System.out.println(SearchingArrays.binarySearch2("Cat", strings)); 
	}
}
