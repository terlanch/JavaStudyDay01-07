package cn.tedu.KongZhiLiuCheng;

import java.util.Scanner;

public class Test {

public static void main(String[] args){
	
	/*int x,y,z;//������ĸ����С�������ֱ�Ϊx��y��z
	for(x = 0;x <= 33;x++){//�������ֻ����33ֻ
		for(y = 0;y <= 50;y++){//ĸ�����ֻ����50ֻ
			z = 100 - x - y;
			if(3*x + 2*y + z/3 == 100 && z % 3 == 0){
				System.out.println("������ĸ����С�������ֱ�Ϊ"+x+","+y+","+z);
			}
		}
	}*/
	/*int x,y,z;
	for(x=0;x <= 9;x++){
		for(y=0;y <= 12;y++){
			z=36 - x - y;
			if(x*4 + y*3 + z/2 == 36 && z%2==0){
				System.out.println("���ˣ�Ů�ˣ�С�������ֱ���"+x+","+y+","+z+",");
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
	
		
	/*for(int i = 100;i<1000;i++){//i�ķ�Χ
		int ge = i%10;//��λ��
		int shi = i/10%10;//ʮλ��
		int bai = i/100;//��λ��
		if(i==ge*ge*ge+shi*shi*shi+bai*bai*bai){//����ˮ�ɻ���������
			System.out.println(i);
		}
	}*/
		
		
	/*Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();//��ȡ�������
	int sum = 0;
	for(int i = 0;n>0;i++){//ֻҪ���������0������ѭ��
		sum += n%10;//���λ��
		n=n/10;//ȥ����λ��
	}
	System.out.println(sum);*/
	
	
	/*Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int c = 0;//��������ܱ������Ĵ���
	for(int i=2;i<n;i++){//�����Ҫ���Ĵ���
		if(n%i!=0){
			c++;
			}
	}if(c==n-2){//����ֻ�ܱ�1�ͱ�������
		System.out.println("�����������");
	}else{
		System.out.println("�������������");
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
	System.out.println(c+"��");*/
	
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
	//��ĸ
	double b = 1.0;
	//��������
	int prefix = 1;
	
	int count = 0;
	
	while(pi<3.1415926 || pi>3.1415927){
		pi+=prefix*4/b;
		//����
		count++;
		//��ĸ
		b+=2;
		//����
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
	System.out.println(c+"��");*/
	
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
	//�ж�����n�Ƿ���������Χ
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
	
	//��ӡ����
	if(flag)
	System.out.print(0+"\t"+1+"\t");
	int f1 = 0;
	int f2 = 1;
	int next = 0;
	//�й��ɵ���
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
