package D;

import java.util.Scanner;

public class demo34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        double down=0;
        int age;
        //ѭ���������̶�
        for(int i=1;i<=10;i++){
        	System.out.println("�������"+i+"λ�˿͵����䣺");
        	age=input.nextInt();
        	if(age<30){
        		down++;
        	}
        }
        System.out.println("30�����µĹ˿ͱ���"+down/10*100+"%");
        System.out.println("30�����ϵĹ˿ͱ���"+(10-down)/10*100+"%");
	}

}
