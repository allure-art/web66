package D;

import java.util.Scanner;

public class demo31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("������ѧ��������");
        String name=input.next();
        double sum=0;
        double score;
        for(int i=0,j=6;i<=4;i++,j--){
        	System.out.println("�������"+(i+1)+"�ſεĳɼ�");
        	score=input.nextDouble();
        	sum+=score;
        	System.out.println(i+"+"+j+"="+(i+j));
        }
        System.out.println(name+"5�ſε�ƽ���֣�"+(sum/5));
	}

}
