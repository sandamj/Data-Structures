package DataStructures;
import java.util.Scanner;

public class TowerOfHanoi {
	
	//recursive function
	public static void hanoi(int n,char s,char a,char d) {
	
		//Base case
		if(n == 1) {
			System.out.println("Move disk 1 from rod " +s+ " to rod " +d);
			return;
		}
		
		//Move n-1 disks from source to auxiliary
		hanoi(n-1, s,d,a);
		System.out.println("Move disk " +n+ " from rod " +s+ " to rod " +d);
		
		//Move n-1 disks from auxiliary to destination
		hanoi(n-1,a,s,d);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of disks: ");
		int n = in.nextInt();
		hanoi(n,'A','B','C');

	}

}
