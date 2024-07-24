import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int x, y, sum,sub;
    Scanner sc = new Scanner(System.in); 
    System.out.println("Type a number:");
    x = sc.nextInt(); 
    System.out.println("Type another number:");
    y = sc.nextInt(); 

    sum = x + y;  
    sub=x-y;
    System.out.println("Sum is: " + sum); 
     System.out.println("Difference is: " + sub); 
		System.out.println("");
	}
}