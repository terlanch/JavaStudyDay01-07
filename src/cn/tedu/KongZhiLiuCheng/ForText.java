package cn.tedu.KongZhiLiuCheng;

public class ForText {
	public static void main(String[] args) {
		/*for(int i =1 ;i<=10;i++){
			System.out.println(i);
		}*/
		
		
		/*for(int i = 10 ;i>=1;i--){
			System.out.println(i);
		}*/
		
		
		/*int sum = 0;
		for(int i = 1;i<=10;i++){
			sum+=i;
		}
		System.out.println(sum);*/
		
		
		/*int sum = 0;
		for(int i=2;i<=100;i=i+2){
			sum+=i;
		}
		System.out.println(sum);*/
		
		
		/*int sum = 0;
		for(int i=1;i<=100;i=i+2){
			sum+=i;
		}
		System.out.println(sum);*/
		
		
		/*int acc = 1;
		for(int i =5;i>0;i--){
			acc*=i;
		}
		System.out.println(acc);*/
		
		
		/*for(int a=1;a<=9;a++){
			for(int b=0;b<=9;b++){
				for(int c=0;c<=9;c++){
					if(a*100+b*10+c==a*a*a+b*b*b+c*c*c){
						System.out.println(a+""+b+""+c);
					}
				}
			}
		}*/
		
		
		/*int count=0;
		for(int a=1;a<=9;a++){
			for(int b=0;b<=9;b++){
				for(int c=0;c<=9;c++){
					if(a*100+b*10+c==a*a*a+b*b*b+c*c*c){
						count++;
						
					}
				}
			}
		}System.out.println(count);*/
		
		
		/*for(int i=10000;1<100000;i++){//保证是五位数
			//求每位
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/100%10;
			int qian = i/1000%10;
			int wan = i/10000;
			//判断条件
			if((ge==wan)&&(shi==qian)&&(ge+shi+qian+wan==bai)){
				System.out.println(i);
			}
		
		}*/
		
		
		
	}

}
