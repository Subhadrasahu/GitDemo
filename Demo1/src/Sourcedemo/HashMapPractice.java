package Sourcedemo;

import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Login();
		abs();

	}
	public static HashMap<String,String> Login()
	{
		HashMap<String,String> hm = new HashMap<String, String>();
		hm.put("x", "aa@aa");
		hm.put("y", "bb@bb");
		//hm.put("aa", "bb@bb");
		//hm.put("aa", "cc@cc");
		System.out.println(hm);
		return hm;
	}
	
	public static ArrayList<String> abs()
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("subha");
		a.add("Dotnet");
		a.add("java");
		System.out.println(a);
		a.add(0, "aaa");
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.removeFirst();
		System.out.println(a);
		return a;
	}
	
}
