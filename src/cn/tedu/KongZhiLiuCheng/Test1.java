package cn.tedu.KongZhiLiuCheng;
/*
 * 	break:������switch�����ʹ�ã����ڽ���switch��䣬Ҳ������ѭ��
 * ��ʹ�ã����ڽ�����ǰѭ��
 * 	continue������ѭ�������ʹ�ã�������������ѭ��
 * 	return(���淽����)
 * 	���:for()
 */

public class Test1 {
	public static void main(String[] args) {
		//��ӡ5*5 ��*
	wc:for(int i = 1 ;i<=5;i++){//���ѭ����������
		nc:for(int j = 1;j<=5;j++){//�ڲ�ѭ����������
				if(j==3){
					//������ǰѭ��
					break wc;
					//��������ѭ��
					//continue;
				}
				System.out.print("*");
			}System.out.println();//����
		}
		
		/*//��ӡ99�˷���
		for(int a = 1;a<=9;a++){
			for(int b = 1;b<=a;b++){
				
				System.out.print(b+"*"+a+"="+a*b+'\t');
				
			}System.out.println();
		}*/
		
		
	}
}
