package D;

import java.util.Scanner;

public class test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        int a[]=new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
        	System.out.println("������ѧ���ɼ���");
        	a[i]=input.nextInt();
        	sum+=a[i];
        }
        System.out.println("ѧ����ƽ����Ϊ��"+(sum/5.0	));
        while(true){
        	System.out.println("��������Ҫ��ѯ�ڼ��ſεĳɼ���");
        	int num=input.nextInt();
        	if(num>5){
        		break;
        	}
        	System.out.println("ѧ����"+num+"�ſεĳɼ�Ϊ��"+a[num-1]);
        }
	}

}
