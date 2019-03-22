package cn.tedu.KongZhiLiuCheng;
/*
 * 	While cycle structure
 * 		格式
 * 			while（判断条件）{
 * 				循环体；
 * 				控制条件；
 * 		}
 *			 	
 */

public class WhileDemo {
	public static void main(String[] args) {
		
		/*//print 1-10
		//初始值
		int i = 1;
		//循环次数不确定的时候用while
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
