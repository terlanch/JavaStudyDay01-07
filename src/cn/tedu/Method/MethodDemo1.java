package cn.tedu.Method;
/*
 * ��һ�����У������˷�����һ�µķ���---����
 * ����о�ȷƥ��ͽ��о�ȷƥ�䣬���û�о�ȷƥ��ͽ�����Ծ�ȷ��ƥ��
 * ����������˶����Ծ�ȷ��ƥ��ͻᱨ�������ṩ��ȷƥ��
 */
public class MethodDemo1 {
	public static void main(String[] args) {
		//�������Ͳ����б�ͬ��Ϊ������ǩ
		System.out.println(sum(2,3));	
	}

	public static int sum(int i,int j){
		System.out.println("int int");
		return i+j;
	}
	
	public static double sum(int m,double n){
		System.out.println("int int");
		return m+n;
	}
	
	public static double sum(double d1,double d2){
		System.out.println("int int");
		return d1+d2;
	}
}