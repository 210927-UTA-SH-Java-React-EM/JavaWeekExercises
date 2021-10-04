package src.main.java.com.example.activity.four;

public class FunWithArrays {
	
	public int[] squares(int a, int b, int c, int d) {
		//Given the four inputs, square them, and put them in an array to return
		a = a*a;
		b = b*b; 
		c = c*c;
		d = d*d;
		
		int[] sqrArr = {a,b,c,d};
		
		//This should be modified to return the correct array
		return sqrArr;
	}
	
	public int arraySum(int[] nums) {
		//Return the sum of the numbers inside of the given array
		int sumNums = 0;
		
		for(int i : nums)
		{
			sumNums += i;
		}
		
		//This should be modifed to return the correct number
		return sumNums;
	}
	
	public double arrayAverage(double[] nums) {
		//Return the average of the numbers given in the array
		
       double arrAvg = 0;
		
		for(double i : nums)
		{
			arrAvg += i;
		}
		
		double avg = arrAvg/nums.length;
		//This should be modified to return the correct number
		return avg;
	}
	
}
