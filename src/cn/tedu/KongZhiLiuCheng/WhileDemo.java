package cn.tedu.KongZhiLiuCheng;
/*
 * 	While cycle structure
 * 		��ʽ
 * 			while���ж�������{
 * 				ѭ���壻
 * 				����������
 * 		}
 *			 	
 */

public class WhileDemo {
	public static void main(String[] args) {
		
		/*//print 1-10
		//��ʼֵ
		int i = 1;
		//ѭ��������ȷ����ʱ����while
		while(i<11){
			System.out.print(i+" ");
			i++;
		}*/
		
		
		double sum = 15000*100*0.3;
		int money = 10000*12;
		int count = 1;
		while(money<sum){
			money += money ;
			count++;
		}System.out.println(count);
	}

}
