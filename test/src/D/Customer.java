package D;

import java.util.Scanner;

public class Customer {
     int cardNum;
     int jf;
     String cardType;
     //�õ��˿ͻ�Ա�ŵķ���
     int getCardNum(){
    	 cardNum=(int)(Math.random()*10000);
    	 return cardNum;
     }
     void show(){
    	 System.out.println("��Ա���ǣ�"+this.cardNum+",��Ա���֣�"+this.jf+",��Ա�����ͣ�"+this.cardType);
     }
     void methd(){
    	 Scanner input=new Scanner(System.in);
    	 System.out.println("���������Ļ��֣�");
    	 jf=input.nextInt();
    	 System.out.println("�����뿨���ͣ�");
    	 cardType=input.next();
    	 if((cardType.equals("��")&&jf>1000)||(cardType.equals("��")&&jf>3000	)){
    		 jf+=500;
    	 }
    	 getCardNum();
    	 show();
     }
     int add(){
    	 return(int)(3.0+4.0);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Customer cc=new Customer();
        cc.methd();
        int sum=cc.add();
        System.out.println(sum);
        if(sum>6){
        	sum+=6;
        	int i=100;
        	System.out.println(i);
        }
        //�������÷�Χ
        //System.out.println(i);
        int num=99;
        System.out.println(num);
	}

}
