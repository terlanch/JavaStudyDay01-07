
package cn.tedu.Object;
/*
 * 	��������
 * 		�ڷ���������{}���ǹ������飬���Խ��г�ʼ����
 * 		��ÿ�����췽��ǰ����ִ�У���������Ĺ��췽��
 * 		���췽���鶼Ҫִ��
 * 	��������
 * 		û�����ƵĶ���---���Ե������Ժͷ�����ʹ��һ��
 * 		��Ҫ���´���һ�Σ���Ҫ���ڲ�������
 */


public class ObjectDemo1 {
	public static void main(String[] args) {
		//��������
		//�������� ͬ�����Ե������Ժͷ���
		//ʹ��һ�ξ�Ҫ����һ������
		new Baby("lol",12);
		new Baby("lol",12).cry();
		//System.out.println(b.name+","+b.age);
		
		//�����������ڲ�������
		m(new Baby());
	}
	
	public static void m(Baby b){
		
	}
}


//Ӥ��
class Baby{
	
	//����
	String name;
	int age;
	char gender;
	
	//��������---���Գ�ʼ��
	//�����������ÿ�����췽��֮ǰ��ִ��
	{
		this.name = "lili";
		this.age = 1;
		System.out.println("��������");
	}
	
	//�޲ι��췽��
	public Baby() {
		// TODO Auto-generated constructor stub
		/*this.name = "lili";
		this.age = 1;*/
	}
	
	//�вι���
	public Baby(int age) {
		/*this.name = "lili";
		this.age = 1;*/
		//this.age = age;

	}
	
	//
	public Baby(String name,int age) {
		/*this.name = "lili";
		this.age = 1;*/
		//this.name = name;
		//this.age =age;
		System.out.println("�в�");
	}
	
	
	//����
	public void cry(){
		System.out.println(this.name+"�������۵ؿޡ�����");
	}
	
}