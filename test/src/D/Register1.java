package D;

import java.util.Scanner;

public class Register1 {
     static void verify(){
    	 System.out.println("******��ӭ����ע��ϵͳ******");
    	 Scanner input=new Scanner(System.in);
    	 while(true){
    		 System.out.println("�������û�����");
    		 String name=input.next();
    		 System.out.println("���������룺");
    		 String psw=input.next();
    		 System.out.println("���ٴ��������룺");
    		 String psw1=input.next();
    		 //��취��֤�û���������,Ȼ���˳�ѭ��
    		 if(name.length()>=3&&psw.length()>=6){
    			 if(psw.equals(psw1)){
    			 System.out.println("ע��ɹ�");
    			 break;
    		 }else{
    			 System.out.println("�������벻һ��");
    		 }
    	 }else{
    		 System.out.println("�û����ĳ��Ȳ���С��3������ĳ��Ȳ���С��6");
    	 }
	}

}
     public static void main(String[] args) {
 		// TODO Auto-generated method stub
 		verify();
 	}

 }
  
