package source;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new java.io.BufferedInputStream(System.in));
		while(sc.hasNext()){
			System.out.print(sc.nextInt());
		}
		System.out.println("over");
	}

}
