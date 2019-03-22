package cn.tedu.KongZhiLiuCheng;

import java.util.Scanner;

public class Test {

public static void main(String[] args){
	
	/*int x,y,z;//公鸡，母鸡，小鸡数量分别为x，y，z
	for(x = 0;x <= 33;x++){//公鸡最多只能买33只
		for(y = 0;y <= 50;y++){//母鸡最多只能买50只
			z = 100 - x - y;
			if(3*x + 2*y + z/3 == 100 && z % 3 == 0){
				System.out.println("公鸡，母鸡，小鸡数量分别为"+x+","+y+","+z);
			}
		}
	}*/
	/*int x,y,z;
	for(x=0;x <= 9;x++){
		for(y=0;y <= 12;y++){
			z=36 - x - y;
			if(x*4 + y*3 + z/2 == 36 && z%2==0){
				System.out.println("男人，女人，小孩数量分别有"+x+","+y+","+z+",");
			}
		}
	}*/
	/*int a,b,c,d;
	for(a=1;a<9;a++){
		for(b=0;b<9;b++){
			for(c=0;c<9;c++){
				for(d=0;d<9;d++){
					if((a*10+b+c*10+d)*(a*10+b+c*10+d)==a*1000+b*100+c*10+d){
						System.out.println(a*1000+b*100+c*10+d);
					}
				}
			}
		}
	}*/
	
	
	/*Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int i,j,k;
	
		for(i = 1;i<=n ;i++){
			for(j = 1;j <= n-i;j++){
				System.out.print(" ");
			}
			for(k = 1;k <= 2*i-1;k++){
				System.out.print("*");
			}
			System.out.println(" ");
		}*/
	
	
	/*for(int a =1;a<=9;a++){
		for(int b = 1;b<=a;b++){
			System.out.print(b+"*"+a+"="+a*b+" ");
		}
		System.out.println("");
	}*/
	
		
	/*for(int i = 100;i<1000;i++){//i的范围
		int ge = i%10;//个位数
		int shi = i/10%10;//十位数
		int bai = i/100;//百位数
		if(i==ge*ge*ge+shi*shi*shi+bai*bai*bai){//满足水仙花数的条件
			System.out.println(i);
		}
	}*/
		
		
	/*Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();//获取这个整数
	int sum = 0;
	for(int i = 0;n>0;i++){//只要这个数大于0继续次循环
		sum += n%10;//求个位数
		n=n/10;//去掉个位数
	}
	System.out.println(sum);*/
	
	
	/*Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int c = 0;//这个数不能被整除的次数
	for(int i=2;i<n;i++){//这个需要除的次数
		if(n%i!=0){
			c++;
			}
	}if(c==n-2){//质数只能被1和本身整除
		System.out.println("这个数是质数");
	}else{
		System.out.println("这个数不是质数");
	}*/
	
	
	/*for(int n=1;n<=1000;n++){
		int sum = 0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum += i;
				if(sum==n){
					System.out.println(n);
				}
			}
		}
	}*/
	
	
	/*final double a = 4.0;
	double PI = 0;
	int b = -1;
	int c = 0;
	while(PI <= 3.1415926 || PI >= 3.1415927){
		b = b + 2;
		PI = PI + a/b;
		c++;
		b = b + 2;
		PI = PI - a/b;
		c++;
	}
	System.out.println(c+"次");*/
	
	/*Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a = 0 ,b = 1 ,c = 0;
	System.out.print(a+" ");
	for(int i = 1;i<= n-1 ;i++){
		c = a + b;
		a = b ;
		b = c ;
		System.out.print(a+" ");
	}*/
	
	
	/*Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i = 0;
	while (n>0){
		if(n%2!=0){
			i++;
		}
		n=n/2;
	}
	System.out.println(i);*/
	
	

	/*double pi = 0.0;
	//分母
	double b = 1.0;
	//控制正负
	int prefix = 1;
	
	int count = 0;
	
	while(pi<3.1415926 || pi>3.1415927){
		pi+=prefix*4/b;
		//计数
		count++;
		//分母
		b+=2;
		//正负
		prefix*=-1;
	}
	System.out.println(count);
	*/
	
	
	/*double a = 4.0;
	double PI = 0.0;
	int b = -1;
	int c = 0;
	while(PI <= 3.1415926 || PI >= 3.1415927){
		b = b + 2;
		PI = PI + a/b;
		c++;
		b = b + 2;
		PI = PI - a/b;
		c++;
	}
	System.out.println(c+"次");*/
	
	/*Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a = 0 ,b = 1 ,c = 0;
	System.out.print(a+" ");
	for(int i = 1;i <= n-1 ;i++){
		c = a + b;
		a = b ;
		b = c ;
		System.out.print(a+" ");
	}*/
	
	/*Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	boolean flag = true;
	//判断整数n是否在正常范围
	if(n<1){
		System.out.println("false!!!");
		flag = false;
	}
	//n == 1
	if(n == 1){
		System.out.println(0);
		flag = false;
	}
	//n == 2
	if(n == 2){
		System.out.println(0+"\t"+1);
		flag = false;
	}
	
	//打印二项
	if(flag)
	System.out.print(0+"\t"+1+"\t");
	int f1 = 0;
	int f2 = 1;
	int next = 0;
	//有规律的项
	for(int i = 3;i <= n;i++){
		next = f1 + f2;
		f1 = f2;
		f2 = next;
		System.out.print(next+"\t");
	}*/
	
	
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int c = 0;
	for(int i = 1;i<=32;i++){
		int t = n >> i;
	if((t&1) != 0){
		c++;
	}
	}
	System.out.println(c);
	}
}
