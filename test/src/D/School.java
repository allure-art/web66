package D;

import java.util.Scanner;

public class School {
       //��Ա����
	String name;
	int classNum;
	int labNum;
	//��Ա����
	void showMe(){
		Scanner input=new Scanner(System.in);
		name=input.next();
		classNum=input.nextInt();
		labNum=input.nextInt();
		System.out.println(name+"�������ģ���"+classNum+"�����ң�"+labNum+"������");
	}
	//������ͨ�����ڹ�������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //��������
		//�������� 
		School ss;
		//Ϊ��ֵ����new����()  ʵ����
		ss=new School();
		//�϶�Ϊһ
		School ss1=new School();
		ss1.showMe();
	}

}
