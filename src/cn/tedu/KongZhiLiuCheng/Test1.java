package cn.tedu.KongZhiLiuCheng;
/*
 * 	break:可以再switch语句中使用，用于结束switch语句，也可以在循环
 * 中使用，用于结束当前循环
 * 	continue：用于循环语句中使用，用于跳过本次循环
 * 	return(后面方法讲)
 * 	标号:for()
 */

public class Test1 {
	public static void main(String[] args) {
		//打印5*5 的*
	wc:for(int i = 1 ;i<=5;i++){//外层循环控制行数
		nc:for(int j = 1;j<=5;j++){//内层循环控制列数
				if(j==3){
					//结束当前循环
					break wc;
					//跳过本次循环
					//continue;
				}
				System.out.print("*");
			}System.out.println();//换行
		}
		
		/*//打印99乘法表
		for(int a = 1;a<=9;a++){
			for(int b = 1;b<=a;b++){
				
				System.out.print(b+"*"+a+"="+a*b+'\t');
				
			}System.out.println();
		}*/
		
		
	}
}
