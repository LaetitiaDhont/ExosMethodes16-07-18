package package1;
import java.util.Arrays;
public class Exo1Array {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.Write a Java method to find the smallest number among 15 numbers.
		
	int array[] = {65,25,36,48,20,97,16,11,32,28,36,2,23,76,77};
	Arrays.sort(array);
	int firstNum = array[0];
	System.out.println("The smallest number is " + firstNum);
	}

}
