package home_work;
import java.util.Scanner;
public class test_resut {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);

	int score = sc.nextInt();

	int result = score >= 90 ? 'A':(score >=80 ? 'B': 'c');
	System.out.println(result);
	

		
	}

}
