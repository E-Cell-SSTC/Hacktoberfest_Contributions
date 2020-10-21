/*
 * Largest Contiguous array sum using Kadane’s Algorithm:
 * Input: 3
		  5
		  -8 5 3 1 6
		  7
		  9 0 8 -1 -2 -2 6
		  5
		  6 -3 -10 0 2
 *Output: Maximum Contiguous array sum is:
  		  15
  		  Maximum Contiguous array sum is:
  		  18
  		  Maximum Contiguous array sum is:
  		  6
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestSumContiguousSubarray {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); // Inputting the test cases
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine().trim());	//read size of array
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");	//read elements of array
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}

			Kadane obj = new Kadane();
			System.out.println("Maximum Contiguous array sum is:");
			System.out.println(obj.maxSubarraySum(arr, n));
		}
	}

}

class Kadane {

	int maxSubarraySum(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }            
        }        
        return max;
	}

}
