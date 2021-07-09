package com.sist.lib;
import java.util.*;
interface III
{
	public void display();
}
class AAA implements III
{
	public void display()
	{
		System.out.println("AAA:display() call...");
	}
	
}
class BBB implements III
{
	public void display()
	{
		System.out.println("BBB:display() call...");
	}
}
class CCC implements III
{
	public void display()
	{
		System.out.println("CCC:display() call...");
	}
}
class DDD implements III
{
	public void display()
	{
		System.out.println("DDD:display() call...");
	}
}
class EEE implements III
{
	public void display()
	{
		System.out.println("EEE:display() call...");
	}
}
//�������̽��� ���õ� ��� Ŭ������ ��Ƽ� �Ѱ��� �̸����� �����Ҷ�
//Controller (Ŭ���� ����) => 
/*
*   ��ü 
*   ===
*    �����ε� /�������̵� => ��������
*    �������̽� => ������
*/
//Ŭ������ ȿ�������� ���� => �������̽� , ��
//put(): ���� , get(key) : �б� 
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,III> map=new HashMap<String, III>();
		map.put("aaa", new AAA());
		map.put("bbb", new BBB());
		map.put("ccc", new CCC());
		map.put("ddd", new DDD());
		map.put("eee", new EEE());
		// ������ (Ŭ���� ����)
		Scanner scan=new Scanner(System.in);
		System.out.println("��ɾ� �Է�(aaa,bbb,ccc,ddd,eee):");
		String cmd=scan.next();
		// �������̽� �Ѱ��� ����
		// III�� ��ü�� ���� ���� �Է��� �� ���
		III i=map.get(cmd);
		i.display();
		/*
		if(cmd.equals("aaa"))
		{
			AAA a=new AAA();
			a.display();
		}
		else if(cmd.equals("bbb"))
		{
			BBB a=new BBB();
			a.display();
		}
		else if(cmd.equals("ccc"))
		{
			CCC a=new CCC();
			a.display();
		}
		else if(cmd.equals("ddd"))
		{
			DDD a=new DDD();
			a.display();
		}
		else if(cmd.equals("eee"))
		{
			EEE a=new EEE();
			a.display();
		}
		*/
		
	}

}
