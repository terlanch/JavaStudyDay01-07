package cn.tedu.KongZhiLiuCheng;

import java.util.Scanner;

/*
 * 选择题
 * 		题干
 * 		选项
 * 		正确结果
 */
public class SwitchText {
	public static void main(String[] args) {
		//题干
		System.out.println("请从下列选项中选出最好看"
				+ "的人。");
		//选项
		System.out.println("A 黄渤");
		System.out.println("B 贾玲");
		System.out.println("C 吴彦祖");
		System.out.println("D 貂蝉");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		//操作switch
		switch(s){
		case "A":
			System.out.println("不是正确答案");
			break;
		case "B":
			System.out.println("你的眼光不错哦");
			break;
		case "C":
			System.out.println("回答正确");
			break;
		case "D":
			System.out.println("回答正确");
			break;
		}
		
	}

}
