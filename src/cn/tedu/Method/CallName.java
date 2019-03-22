package cn.tedu.Method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CallName {
	public static void main(String[] args) {
		System.out.println("-------随机点名器-------");
		//创建一个存储多个同学名字的数组
		String[] students = new String[4];
		//1.存储全班同学的名字
		addStudentName(students);
		//2.打印全班同学每一个人的姓名
		printStudentName(students);
		//3.获取随机点名到的学生姓名
		String randomName = randomStudentName(students);
		System.out.println("被点到名的同学是:"+randomName);
	}
	
	
	/*
	 *1.存储全班同学名字
	 *	创建一个存储多个同学 名字的数组
	 *键盘输入每个同学的名字，存储到数组中
	 */
	public static void addStudentName(String[] students) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<students.length;i++){
			System.out.println("存储第"+(i+1)+"个名字：");
			students[i] = sc.next();
			
		}
			
	}
	
	/*
	 * 2.打印全班同学的名字
	 */
	public static void printStudentName(String[] students) {
		
		for(int i = 0;i<students.length;i++){
			System.out.println("第"+(i+1)+"个学生的名字是"+students[i]);
		}
		
	}	
	/*
	 * 3.在班级总人数范围内，随机产生一个随机数，返回随机数位置上的学生姓名
	 */
	private static String randomStudentName(String[] students) {
		// TODO Auto-generated method stub
		//根据数组长度，获取随机索引
		int index = new Random().nextInt(students.length);
		//通过随机索引从数组中获取姓名
		String name = students[index];
		//返回随机点到的名称
		return name;
	}

}
