package cn.tedu.Object;

/*
 * ���Ƕ���ĵĸ�������������ľ���ʵ��
 * 
 * ���췽��
 * 		����ͬ����û�з���ֵ�������εķ������ڴ�������
 * 		�Լ����Գ�ʼ�����������û�й��췽��JVM���Զ�����޲ι��죬
 * 		��������Ѿ����˹��췽��JVM�Ͳ������Զ���� ��������
 */
public class ObjectDemo {
	public static void main(String[] args) {
		//����person��Ķ���  ��������---p
		//���췽��---���ڹ�������
		Person p = new Person(10);
		//�����Խ��и�ֵ
		//.���ǡ��ġ�����˼
		//p.age = 10;
		p.name = "����";
		p.gender = 'Ů';
		//���
		//System.out.println(p.age);
		//��������
		p.eat();
		//�������������������
		//n(p);		
		//������ǻ�����������
		//m(p.age);
		System.out.println(p.age);//0
	}
	public static void m(int i){
		i++;
	}
	
	public static void n(Person p){
		p = new Person(10);
		p.age ++;
		p.eat();
	}
}
	
	//Person��
	class Person{
		//����---����
		static String name;//��̬����
		int age  ;
		char gender;
		
		//���췽��---1.����ͬ�� 2.û����������
		//java�涨�������û�й��췽����JVM�ͻ��ڵײ��Զ����һ���޲ι���
		//public Person(){}
		
		
		//�вι���---�������Խ��г�ʼ��
		//���췽����������
		//��������ṩ�˹��췽����JVM�Ͳ����Զ����һ���޲ι���
		public Person(int age){//�����ľͽ�ԭ��
			//java���ṩ��һ���ؼ���
			//this---������ǵ�ǰ��Ķ���
			this.age = age;	   //��java�����еķǾ�̬�����Ժͷ���������ͨ���������
		}
		//����ͬ������ͨ����
		public void Person(){}
		
		//��Ϊ---����
		public void eat(){
			System.out.println(name+"�ڳԶ���");
		}
		
		public void sleep(){
			System.out.println(name+"��˯��");
		}
	}


