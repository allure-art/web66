package D;

import java.util.Scanner;

public class demo18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("�Ƿ��ǻ�Ա��y/n):");
        String v=input.next();
        System.out.println("�����빺���");
        int num=input.nextInt();
        double m=0.0;
        if(v.equals("y")){
        	//��Ա�ۿ����
        	if(num>200){
        		m=num*0.75;
        	}else{
        		m=num*0.8;
        	}
        }else if(v.equals("n")){
        	//�ǻ�Ա�ۿ����
        	if(num>100){
        		m=num*0.9;
        	}else{
        		m=num;
        	}
        }else{
        	System.out.println("��������");
        }
        System.out.println("ʵ��֧����"+m);
	}

}
