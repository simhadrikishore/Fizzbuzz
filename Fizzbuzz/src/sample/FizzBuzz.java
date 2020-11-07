package sample;
import java.util.*;
public class FizzBuzz {
	public static void main(String args[]) {
		int n = 100;
		System.out.println("Here is the fizzbuzz series:");
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0)
				System.out.println("FizzBuzz" + " ");
			else if (i % 5 == 0)
				System.out.println("Buzz" + " ");
			else if (i % 3 == 0)
				System.out.println("Fizz" + " ");
			else
				System.out.println(i + " ");
		}
	} 
}
