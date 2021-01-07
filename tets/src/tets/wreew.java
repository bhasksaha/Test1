package tets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wreew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver",
//				System.getProperty("user.dir") +"\\chromedriver.exe");
////		
//		WebDriver we=new ChromeDriver();
//		we.get("https://www.google.co.in/");
		d1();
		d2();
		d3();

	}


Removed first block of code

	This is the newly added lines
	
	
	
	
	
	public static void d2() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");

			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*");

			}
			System.out.println("");
		}
	}

	public static void d3() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}
	
	public static void d4() {
		
		int e[]= {1,3,4};
		
		int[] a,b,e1;
		
		
		int[] c=new int[5];
		
//		b= {1,2,3,4};
		
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}
}
