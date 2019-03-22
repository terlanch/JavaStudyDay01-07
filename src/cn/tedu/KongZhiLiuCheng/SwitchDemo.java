package cn.tedu.KongZhiLiuCheng;

import java.util.Scanner;

/*
 * switch格式
 * 		switch(表达式){
 * 			case 值1 :
 * 				语句体1；
 * 			case 值2 :
 * 				语句体2；
 * 			case 值2 :
 * 				语句体2；
 * 			...
 * 			default:
 * 				语句体n+1；
 * 
 * }
 * 执行流程：计算表达式的值，拿到这个值和每个case后面的值依次执行比较，如果有case的值
 * 满足比较条件，就执行case下的对应的语句体接着就结束语句，如果都不满足就执行语句体n+1
 * 接着语句就结束了
 * 
 * 		输入一个数，返回对应的星期
 * 
 * 		注意：
 * 			1.case后面的值是常量，并且不能重复
 * 			2.switch后面的表达式支持byte、short，char以及int，从jdk1.5开始
 * 支持枚举，从jdk1.7开始支持String（字符串）
 * 			3.default支持省略---选择题
 * 			4.break可以省略，省略break会出现case穿透的效果
 * 			5.语句结束的标志：1.遇到break，2.执行到代码最后一行
 */
public class SwitchDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//获取数据
		int i = sc.nextInt();
		//操作switch
		switch(i){
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期七");
			break;
		default:
			System.out.println("输入数据错误！！");
			break;
		}
			
	}

}
