package cn.tedu.Method;
/*
 * �����Ĵ�ֵ
 * 		���������ǻ����������;���ֵ�Ŀ���
 * 		����������Ӧ���������;��ǵ�ֵַ�Ŀ���
 * 		�����������ĵ�ֵַ�ҵ��˶��ڴ沢�����˸Ķ�ԭֵ�ͻ�Ķ�
 * 		���û���ҵ����ڴ�Ͳ�Ӱ��
 */


public class MethodDemo2 {
	//���еķ����� ִ�� ������ջ��
	public static void main(String[] args) {
		//int i = 2;
		//ʵ��---ʵ�ʲ���
		//���������ǻ������ͣ�����ֵ�Ŀ���
		//m(i);
		int[] arr = {1,2,3};
		//������������
		//m(arr[0]);
		//����������Ӧ���������ͣ�������ֵַ
		//mn(arr);
		change(arr);
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		//System.out.println(arr[0]);
	}
	public static void change(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0;i<arr.length;i++){
			arr[i] *= 2;
		}
	}
	//�β�---����ֵ
	private static void m(int i) {
		// TODO Auto-generated method stub
		i++;
		
	}
	public static void n(int[] arr){
		 arr[0] = 10;
	}
	
	public static void mn(int[] arr){
		//����֮��ĵ�ֵַ���µĵ�ֵַ����
		arr = new int[]{2,3,4};
	}
	
}
