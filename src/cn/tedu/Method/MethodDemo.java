package cn.tedu.Method;
/*
 * 对重复且有效的代码进行抽取，抽取的形式就是方法
 * 
 * 书写格式
 * 		修饰符 返回值的数据类型 方法名（数据类型 参数名，）{
 * 			方法体；
 * 			return；
 * }
 * 修饰符：public static
 * 返回值的数据类型：
 * 			返回什么样的数据就用对应的类型来接
 * 			没有返回值：void
 * 方法名：标识符
 * （数据类型 参数名...）---参数列表（数据类型和参数的个数）
 * 方法体：执行核心代码
 * return：把值返回
 * 
 * 方法的调用
 * 		1.单独调用 方法名（参数值）	
 * 		2.输出调用
 * 		3.赋值调用
 * 注意：
 * 		1.方法被调用才执行
 * 		2.确定两个明确：返回值的数据类型，参数列表	
 * 		3.return可以出现在没返回值的方法里用于结束方法
 * 			作用：把返回值进行返回，结束方法
 * 		4.要处理所有的数据，保证每一类数据都有返回
 * 		5.抽取成方法是不定的，根据个人经验
 * 
 * 方法的重载
 * 	在一个类中，出现了方法名一致的方法---重载
 */

public class MethodDemo {
	public static void main(String[] args) {
		//方法名和参数列表共同作为方法签名
	
	
		//打印5*5 的 *
		
		/*for(int i = 1;i<= 5;i++){
			for(int j = 1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//调用方法
		//1.单独调用
		printStar(3,6);
		//2.输出调用
		System.out.println(getsum(4,6));
		System.out.println(isOdd(9));
		//没有返回值的方法不能输出而且也不能赋值
		//System.out.println(printStar(4,5));
		//3.赋值调用
		int result = getsum(4,6);
	}
	
	
	//效果不需要进行返回---返回值类型--void
	//参数列表 ---int x，int y
	public static void printStar(int x,int y){
		for(int i = 1;i<= x;i++){
			for(int j = 1;j<= y;j++){
				if(j == 2)
					//结束方法
					return;
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	//求两个整数的和
	public static int getsum(int m,int n){
		
		return m+n;
	}
	
	//判断一个整数是否是奇数
	public static boolean isOdd(int q){
		//把不正常的范围进行优化
		if(q<0){
			System.out.println("不是正确的数");
			return false;
		}
		//正常范围的数的判断
		if(q%2 !=0){
			return true;
		}
		//所有的数据都要处理
		return false;
	}
	
	//判断一个整数是否是质数
	public static boolean isPrime(int m){
		//不正常的范围
		if(m<2){
			return false;
		}
		
		//正常范围下的判断
		for(int i = 2;i <= m/2;i++){
			
			if(m%i == 0){
				return false;
			}
		}
		return true;
	}
	
	
	
		
}

