package cn.tedu.Method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CallName {
	public static void main(String[] args) {
		System.out.println("-------���������-------");
		//����һ���洢���ͬѧ���ֵ�����
		String[] students = new String[4];
		//1.�洢ȫ��ͬѧ������
		addStudentName(students);
		//2.��ӡȫ��ͬѧÿһ���˵�����
		printStudentName(students);
		//3.��ȡ�����������ѧ������
		String randomName = randomStudentName(students);
		System.out.println("���㵽����ͬѧ��:"+randomName);
	}
	
	
	/*
	 *1.�洢ȫ��ͬѧ����
	 *	����һ���洢���ͬѧ ���ֵ�����
	 *��������ÿ��ͬѧ�����֣��洢��������
	 */
	public static void addStudentName(String[] students) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<students.length;i++){
			System.out.println("�洢��"+(i+1)+"�����֣�");
			students[i] = sc.next();
			
		}
			
	}
	
	/*
	 * 2.��ӡȫ��ͬѧ������
	 */
	public static void printStudentName(String[] students) {
		
		for(int i = 0;i<students.length;i++){
			System.out.println("��"+(i+1)+"��ѧ����������"+students[i]);
		}
		
	}	
	/*
	 * 3.�ڰ༶��������Χ�ڣ��������һ������������������λ���ϵ�ѧ������
	 */
	private static String randomStudentName(String[] students) {
		// TODO Auto-generated method stub
		//�������鳤�ȣ���ȡ�������
		int index = new Random().nextInt(students.length);
		//ͨ����������������л�ȡ����
		String name = students[index];
		//��������㵽������
		return name;
	}

}
