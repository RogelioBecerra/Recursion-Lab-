
public class ArraySum {

	
	public int sumOfArray(Integer[] arr, int index) {
		
		
		if(index < 0)
			return 0;
		return arr[index] + sumOfArray(arr,index - 1);
		
	}
}
