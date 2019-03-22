package cn.tedu.KongZhiLiuCheng;
/*
 * 	do...while循环
 * 		格式
 * 			初始值
 * 			do{
 * 			循环体；
 * 			控制条件；
 * 		}while（判断条件）；
 * 		执行流程：
 * 			1.先去计算初始值
 *   		2.直接执行循环体以及控制条件
 *   		3.执行完控制条件之后的值和判断条件进行判断，如果是true重
 *   复操作2,3，直到为false 
 */


public class DoWhileDemo {
	public static void main(String[] args) {
		//print 1-10
		int i = 1 ;
		do{
			System.out.print(i+" ");
			i++;
		}while(1 <= 10);	
	}
}
/* 
 * 三种循环联系与区别
 * 		1.三种循环可以等效转换
 * 		2.优先选择for循环，其次是while，最后才是do。。。while
 * 		3.都会出现死循环
 * 		4.do。。。while最少会执行一次
 * 		5.for循环的初始值循环结束之后拿不到这个值
 * 
 */
