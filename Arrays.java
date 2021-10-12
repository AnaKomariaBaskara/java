import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuffer text = new StringBuffer(scanner.nextLine());
    	        System.out.println(text.reverse());
	}
}