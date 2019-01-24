import java.util.Scanner;
import java.util.*;

//This program prints the users name who is running this program.

public class Hello {
	
	public static void main(String[] args){
		
		Scanner x = new Scanner(System.in);
		String name = x.nextLine();
		String name2 = x.nextLine();
		System.out.println("The person running this program is:" + name);
		System.out.println("The 2nd person running this program is: " + name2);
	}
	
}
