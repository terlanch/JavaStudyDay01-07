package cn.tedu.Wei;
/*��������������ֵ
 * Ч�ʸߵͣ�2.��λ���ֻ�����������  3.��һ����������  1.(�򵥳��� �������ݶ�����)
 * 
 * 
 * 
 * */
public class WeiText {
	public static void main(String[] args) {
	int	a = 4;
	int	b = 5;
	//1.�м����
	int temp = a;
		a = b;
		b = temp;
	//2.���	
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
	//3.���
		a = a + b;
		b = a - b;
		a = a - b;
	System.out.println("a:"+a+",b:"+b);
	
	}

}
