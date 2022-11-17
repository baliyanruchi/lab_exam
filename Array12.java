package AssignmentProblems;

public class Array12 {

	// perform addition of array passed as argument and return sum  
	int sumArray(int k[])
	{
		int sum=0;
		for(int u:k)
			sum= sum+u;
		
		return sum;
	}
	
	
	 int y;
	public static void main(String[] args) {
		Array12 a= new Array12();
		
		
		
		int arr[]= {1,2,4,5,7,78,4};
		int result =a.sumArray(arr);
		System.out.println(result);

	}

}
