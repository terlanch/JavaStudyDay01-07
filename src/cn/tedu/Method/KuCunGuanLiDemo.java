package cn.tedu.Method;

import java.util.Scanner;

public class KuCunGuanLiDemo {
	public static void main(String[] args) {
		//��¼�����Ʒ��Ϣ
		//Ʒ���ͺ�
		String[] brands = new String[]{"MacBookAir","ThinkPadT450"};
		//�ߴ��С
		double[] sizes = new double[]{13.3,14.0};
		//�۸�
		double[] prices = new double[]{6988.88,4999.99};
		//�������
		int[] counts = new int[]{0,0};
		
		//ͨ��whileѭ��ģ�����Ա���й����ظ�ѡ�����
		while(true){
			//��ӡ���ܲ˵����������ռ�������Ĺ���ѡ�����
			int choose = chooseFunction();
			//ִ����Ŷ�Ӧ�Ĺ���
			switch(choose){
			case 1://�鿴����嵥
				printStore(brands,sizes,prices,counts);
				break;
			case 2://�޸���Ʒ�����
				update(brands,counts);
				break;
			case 3:
				exit();
				return;
			default:
				System.out.println("------------------------");
				System.out.println("����ѡ������������ѡ�����");
				break;
					
			}
		}
	}
	
	/*
	 * �������ܲ˵�
	 * @return ������Զ��������Ĺ��ܲ������
	 */
	public static int chooseFunction() {
		System.out.println("--------������--------");
		System.out.println("1.�鿴����嵥");
		System.out.println("2.�޸���Ʒ�������");
		System.out.println("3. �˳�");
		System.out.println("������Ҫִ�еĲ�����ţ�");
		//���ռ�������Ĺ���ѡ�����
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		
		return choose;
	}
	
	/*
	 * �鿴����嵥
	 * @param brands ��ƷƷ���ͺ�
	 * @param sizes ��Ʒ�ߴ��С
	 * @param prices ��Ʒ�۸�
	 * @param counts ��Ʒ�������
	 */
	private static void printStore(String[] brands, double[] sizes, double[] prices, int[] counts) {
		//ͳ���ܿ�������ͳ�ƿ���ܽ��
		int totalCount = 0;
		double totalPrice = 0.0;
		for(int i = 0;i<brands.length;i++){
			totalCount += counts[i];
			totalPrice += prices[i];
		}
		//�б���
		System.out.println("--------�鿴����嵥--------");
		System.out.println("Ʒ���ͺ�                   �ߴ�\t�۸�\t�����");
		//�б��в�
		for(int i = 0;i<brands.length;i++){
			System.out.println(brands[i]+"\t"+sizes[i]+"\t"+prices[i]+"\t"+counts[i]);
		}
		//�б�ײ�
		System.out.println("----------------------------");
		System.out.println("�ܿ������"+totalCount);
		System.out.println("�ܽ��"+totalPrice);
	}
	
	/*
	 * �޸���Ʒ�����
	 */
	public static void update(String[] brands, int[] counts) {
		System.out.println("--------�޸���Ʒ�������--------");
		for(int i = 0;i<brands.length;i++){
			System.out.println("������"+brands[i]+"��Ʒ�����");
			counts[i] = new Scanner(System.in).nextInt();
		}
		
	}
	
	/*
	 *�˳�
	 */
	private static void exit() {
		System.out.println("--------�˳�--------");
		System.out.println("�����˳�ϵͳ");
	}


}
