package cn.tedu.KongZhiLiuCheng;
/*
 * ��ʽ2
 * if���ж�������{
 * 		�����1��
 * }else{
 * 		�����2��
 * }
 * 
 * ִ�����̣���ȥ�����ж������������true��ִ�������1�������false��ִ�������2
 * 
 * ���if����ʽ2���ص���һ��ֵ�ͺ���Ŀ��Ч
 */
public class IfDemo2 {
	public static void main(String[] args) {
		
		//���������������ֵ
		int a = 10;
		int b = 1;
		int c = 8;
		if(a>b){
			System.out.println(a);
		}
		else{
			System.out.println(b);
			
		}
		//���������������ֵ
		if(a>b){
			if(a>c){
				System.out.println(a);
			}
			else{
				System.out.println(c);
			}
		}
		else{
			if(b>c){
				System.out.println(b);
			}
			else{
				System.out.println(c);
			}
		}
	}

}
