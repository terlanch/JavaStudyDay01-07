package cn.tedu.KongZhiLiuCheng;

import java.util.Scanner;

public class IfDemo1 {
	public static void main(String[] args) {
		//����¼��Ǯ
		Scanner sc = new Scanner(System.in);
		//��ȡ����--Ǯ
		int money = sc.nextInt();
		//�ͼ۸���бȽ�
		if(money>999){
			//���if���������ֻ��һ�仰����ʡ��
			System.out.println("������");
			}
		else{
	        
			System.out.println("Over");
		}
		System.out.println("�ؼ�");
	}

}
