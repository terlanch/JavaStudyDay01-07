package cn.tedu.SanMu;
/*��Ŀ��Ԫ�������
 * 	��ʽ	
 * 		���ʽ������ֵ�������ʽ1�����ʽ2��
 * 	ִ�����̣�
 * 		��ȥ������ʽ��ֵ��������ֵ��true���Ͱѱ��ʽֵ1���أ������false�Ͱѱ��ʽֵ2���з��ء�
 */
public class SanMuDemo {
	public static void main(String[] args) {
		//���������������ֵ
		int a = 5;
		int b = 9;
		int c = 20;
		//����һ������������ֵ��ʱ��
		//Ҫ��֤������������ͺ��������ʽֵ������һ��
		int max = a > b?a : b;
		System.out.println(max);
		//�������ʽ1 2ֵ�����Ϳ��Բ�һ�������и�ǰ��û����һ�����������ܷ���ֵ��
		System.out.println(a>b?'a':true);
		//���������������ֵ
		//1.�����Ƚ�
		int max1 = a>b?a:b;
		int max11 = c>max1?c:max1;
		System.out.println("max��"+max11);
		//2.��ĿǶ��
		System.out.println(a>b?(a>c?a:c):(b>c?b:c));
		
		
		
	}

}
