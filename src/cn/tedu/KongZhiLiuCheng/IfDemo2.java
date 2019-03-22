package cn.tedu.KongZhiLiuCheng;
/*
 * 格式2
 * if（判断条件）{
 * 		语句体1；
 * }else{
 * 		语句体2；
 * }
 * 
 * 执行流程：先去计算判断条件，如果是true就执行语句体1，如果是false就执行语句体2
 * 
 * 如果if语句格式2返回的是一个值就和三目等效
 */
public class IfDemo2 {
	public static void main(String[] args) {
		
		//求两个整数的最大值
		int a = 10;
		int b = 1;
		int c = 8;
		if(a>b){
			System.out.println(a);
		}
		else{
			System.out.println(b);
			
		}
		//求三个整数的最大值
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
