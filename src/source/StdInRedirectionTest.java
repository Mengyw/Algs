package source;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StdInRedirectionTest {
	public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream;
        inputStream = new FileInputStream("f:/Desktop/tinyUF.txt");
        System.setIn(inputStream);
		Scanner scanner=new Scanner(System.in);
		while (scanner.hasNext()) {
		    System.out.println(scanner.nextLine());
		}
		System.out.println("over");
		scanner.close();
    }
}