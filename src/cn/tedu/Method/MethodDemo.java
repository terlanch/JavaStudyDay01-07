package cn.tedu.Method;
/*
 * ���ظ�����Ч�Ĵ�����г�ȡ����ȡ����ʽ���Ƿ���
 * 
 * ��д��ʽ
 * 		���η� ����ֵ���������� ���������������� ����������{
 * 			�����壻
 * 			return��
 * }
 * ���η���public static
 * ����ֵ���������ͣ�
 * 			����ʲô�������ݾ��ö�Ӧ����������
 * 			û�з���ֵ��void
 * ����������ʶ��
 * ���������� ������...��---�����б��������ͺͲ����ĸ�����
 * �����壺ִ�к��Ĵ���
 * return����ֵ����
 * 
 * �����ĵ���
 * 		1.�������� ������������ֵ��	
 * 		2.�������
 * 		3.��ֵ����
 * ע�⣺
 * 		1.���������ò�ִ��
 * 		2.ȷ��������ȷ������ֵ���������ͣ������б�	
 * 		3.return���Գ�����û����ֵ�ķ��������ڽ�������
 * 			���ã��ѷ���ֵ���з��أ���������
 * 		4.Ҫ�������е����ݣ���֤ÿһ�����ݶ��з���
 * 		5.��ȡ�ɷ����ǲ����ģ����ݸ��˾���
 * 
 * ����������
 * 	��һ�����У������˷�����һ�µķ���---����
 */

public class MethodDemo {
	public static void main(String[] args) {
		//�������Ͳ����б�ͬ��Ϊ����ǩ��
	
	
		//��ӡ5*5 �� *
		
		/*for(int i = 1;i<= 5;i++){
			for(int j = 1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//���÷���
		//1.��������
		printStar(3,6);
		//2.�������
		System.out.println(getsum(4,6));
		System.out.println(isOdd(9));
		//û�з���ֵ�ķ��������������Ҳ���ܸ�ֵ
		//System.out.println(printStar(4,5));
		//3.��ֵ����
		int result = getsum(4,6);
	}
	
	
	//Ч������Ҫ���з���---����ֵ����--void
	//�����б� ---int x��int y
	public static void printStar(int x,int y){
		for(int i = 1;i<= x;i++){
			for(int j = 1;j<= y;j++){
				if(j == 2)
					//��������
					return;
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	//�����������ĺ�
	public static int getsum(int m,int n){
		
		return m+n;
	}
	
	//�ж�һ�������Ƿ�������
	public static boolean isOdd(int q){
		//�Ѳ������ķ�Χ�����Ż�
		if(q<0){
			System.out.println("������ȷ����");
			return false;
		}
		//������Χ�������ж�
		if(q%2 !=0){
			return true;
		}
		//���е����ݶ�Ҫ����
		return false;
	}
	
	//�ж�һ�������Ƿ�������
	public static boolean isPrime(int m){
		//�������ķ�Χ
		if(m<2){
			return false;
		}
		
		//������Χ�µ��ж�
		for(int i = 2;i <= m/2;i++){
			
			if(m%i == 0){
				return false;
			}
		}
		return true;
	}
	
	
	
		
}

