package cn.tedu.KongZhiLiuCheng;

import java.util.Scanner;

/*
 * switch��ʽ
 * 		switch(���ʽ){
 * 			case ֵ1 :
 * 				�����1��
 * 			case ֵ2 :
 * 				�����2��
 * 			case ֵ2 :
 * 				�����2��
 * 			...
 * 			default:
 * 				�����n+1��
 * 
 * }
 * ִ�����̣�������ʽ��ֵ���õ����ֵ��ÿ��case�����ֵ����ִ�бȽϣ������case��ֵ
 * ����Ƚ���������ִ��case�µĶ�Ӧ���������žͽ�����䣬������������ִ�������n+1
 * �������ͽ�����
 * 
 * 		����һ���������ض�Ӧ������
 * 
 * 		ע�⣺
 * 			1.case�����ֵ�ǳ��������Ҳ����ظ�
 * 			2.switch����ı��ʽ֧��byte��short��char�Լ�int����jdk1.5��ʼ
 * ֧��ö�٣���jdk1.7��ʼ֧��String���ַ�����
 * 			3.default֧��ʡ��---ѡ����
 * 			4.break����ʡ�ԣ�ʡ��break�����case��͸��Ч��
 * 			5.�������ı�־��1.����break��2.ִ�е��������һ��
 */
public class SwitchDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//��ȡ����
		int i = sc.nextInt();
		//����switch
		switch(i){
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		default:
			System.out.println("�������ݴ��󣡣�");
			break;
		}
			
	}

}
