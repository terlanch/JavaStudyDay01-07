package cn.tedu.Method;

import java.util.Scanner;

public class MethodTest1 {
	public static void main(String[] args) {
		//StackOverflowError---ջ�������  �����ݹ�ľ�����
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(sum(n));
	}

	public static int sum(int n) {
	
		if(n == 1){
			return 1;
		}
		
		return sum(n-1)+n;
	}

}
