package cn.tedu.Scanner;
//1.导包
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		//2.找到Scanner
		Scanner sc = new Scanner(System.in);
		
		//3.获取数据
		//获取整数
		//int num = sc.nextInt();
		//获取字符串
		String s = sc.next();
		System.out.println(s);
			
		
	}
	

}
