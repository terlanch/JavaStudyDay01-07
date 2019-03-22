package cn.tedu.KongZhiLiuCheng;

import java.util.Scanner;

/*
 * 格式3
 * 	if(判断条件1){
 * 		语句体1
 * }else if(判断条件2){
 * 		语句体2
 * }else if(判断条件3){
 * 		语句体3
 * }
 * ...
 * else{
 * 		语句体n+1
 * }
 * 执行流程：
 * 		先去计算判断条件1，如果是true，就执行语句体1，如果是false就去计算判断条件2，如果是true就去执行语句体2，
 * 如果是false就去执行判断条件3，如果是true就执行语句体3，如果都是false就去执行语句体n+1
 * 测试：1.正确数据 2.边界数据 3.错误数据
 */
public class IfDemo3 {
	public static void main(String[] args) {
		//根据输入的星星数展示用户的段位
		Scanner sc = new Scanner(System.in);
		//获取数据
		int star = sc.nextInt();
		//以此判断
		if(star >= 0 && star < 10){
			System.out.println("黑铁");
		}else if(star >= 10 && star < 20){
			System.out.println("青铜");
		}else if(star >= 20 && star < 30){
			System.out.println("白银");
		}else if(star >= 30 && star < 40){
			System.out.println("黄金");
		}else if(star >= 40 && star < 50){
			System.out.println("铂金");
		}else if(star >= 50 && star < 60){
			System.out.println("钻石");
		}else if(star >= 60 && star < 70){
			System.out.println("大师");
		}else if(star >= 70 && star < 80){
			System.out.println("宗师");
		}else if(star >= 80 && star < 100){
			System.out.println("王者");
		}else{
			System.out.println("输入数据错误");
		}
		
	}

}
