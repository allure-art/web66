package D;

import java.util.Scanner;

public class demo32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("������һ��ֵ��");
        int num=input.nextInt();
        System.out.println("�������ֵ����������¼ӷ���");
        //for������������ֺŲ���ȱ��
        for(int i=0,j=num;i<=num;i++,j--){
        	System.out.println(i+"+"+j+"="+num);
      
        }
        int m;
        //for������������ֺŲ�����
        for(;;){
        	System.out.println("������һ��ֵ��");
        	m=input.nextInt();
        	if(m==0){
        		break;
        	}
        }
	}

}
