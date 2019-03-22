package cn.tedu.KongZhiLiuCheng;

import java.util.Scanner;

public class IfDemo1 {
	public static void main(String[] args) {
		//键盘录入钱
		Scanner sc = new Scanner(System.in);
		//获取数据--钱
		int money = sc.nextInt();
		//和价格进行比较
		if(money>999){
			//如果if语句的语句体只有一句话可以省略
			System.out.println("买买买");
			}
		else{
	        
			System.out.println("Over");
		}
		System.out.println("回家");
	}

}
