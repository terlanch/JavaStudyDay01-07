package cn.tedu.KongZhiLiuCheng;

import java.util.Scanner;

/*
 * ��ʽ3
 * 	if(�ж�����1){
 * 		�����1
 * }else if(�ж�����2){
 * 		�����2
 * }else if(�ж�����3){
 * 		�����3
 * }
 * ...
 * else{
 * 		�����n+1
 * }
 * ִ�����̣�
 * 		��ȥ�����ж�����1�������true����ִ�������1�������false��ȥ�����ж�����2�������true��ȥִ�������2��
 * �����false��ȥִ���ж�����3�������true��ִ�������3���������false��ȥִ�������n+1
 * ���ԣ�1.��ȷ���� 2.�߽����� 3.��������
 */
public class IfDemo3 {
	public static void main(String[] args) {
		//���������������չʾ�û��Ķ�λ
		Scanner sc = new Scanner(System.in);
		//��ȡ����
		int star = sc.nextInt();
		//�Դ��ж�
		if(star >= 0 && star < 10){
			System.out.println("����");
		}else if(star >= 10 && star < 20){
			System.out.println("��ͭ");
		}else if(star >= 20 && star < 30){
			System.out.println("����");
		}else if(star >= 30 && star < 40){
			System.out.println("�ƽ�");
		}else if(star >= 40 && star < 50){
			System.out.println("����");
		}else if(star >= 50 && star < 60){
			System.out.println("��ʯ");
		}else if(star >= 60 && star < 70){
			System.out.println("��ʦ");
		}else if(star >= 70 && star < 80){
			System.out.println("��ʦ");
		}else if(star >= 80 && star < 100){
			System.out.println("����");
		}else{
			System.out.println("�������ݴ���");
		}
		
	}

}
