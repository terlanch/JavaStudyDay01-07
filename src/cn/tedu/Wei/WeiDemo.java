package cn.tedu.Wei;
/*
 * 位运算符
 * 		>>（右移）---如果是正数 右移几位就在最左边补几个0，如果是负数右移几位就在最左边补几个1
 *
 * 		<<（左移）---无论正负数左移几位最右边就补几个0
 * 		>>>（无符号右移）---无论正负数右移几位就在最左边补几个0
 */
public class WeiDemo {
	public static void main(String[] args) {
		
		//操作>>如果是正数右移几位 操作数/2^移动的位数
		System.out.println(4>>2);
		//<<左移几位 操作数*2^移动位数
		System.out.println(4<<2);
		//>>>无论以多少位都是正数
		System.out.println(4>>>2);
		//移动的位数要对32进行取余，取余的结果才是真正移动的位数
		System.out.println(4>>32);
	}

}
/*4>>2
 * [00]00000000 00000000 00000000 000001(00)
 *
 *
 *
 */

