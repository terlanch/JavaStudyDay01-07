package cn.tedu.KongZhiLiuCheng;

import java.util.Scanner;

/*
 * ѡ����
 * 		���
 * 		ѡ��
 * 		��ȷ���
 */
public class SwitchText {
	public static void main(String[] args) {
		//���
		System.out.println("�������ѡ����ѡ����ÿ�"
				+ "���ˡ�");
		//ѡ��
		System.out.println("A �Ʋ�");
		System.out.println("B ����");
		System.out.println("C ������");
		System.out.println("D ����");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		//����switch
		switch(s){
		case "A":
			System.out.println("������ȷ��");
			break;
		case "B":
			System.out.println("����۹ⲻ��Ŷ");
			break;
		case "C":
			System.out.println("�ش���ȷ");
			break;
		case "D":
			System.out.println("�ش���ȷ");
			break;
		}
		
	}

}
