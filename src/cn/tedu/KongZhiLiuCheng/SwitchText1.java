package cn.tedu.KongZhiLiuCheng;

import java.util.Scanner;

/*
 * 	输入一个数代表月份，返回具体的季节
 */
public class SwitchText1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		switch(month){
		case 3:
		case 4:
		case 5:
			System.out.println("Spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Autumn");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("Winter");
			break;
		default:
			System.out.println("请输入正确月份");
		
		}
	}

}
