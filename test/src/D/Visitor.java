package D;

import java.util.Scanner;

public class Visitor {
      String name;
      int age;
      void method(){
    	  Scanner input=new Scanner(System.in);
    	  while(true){
    		  System.out.println("������������");
    		  name=input.next();
    		  if(name.equals("n")){
    			  System.out.println("�����˳�");
    		      break;
    		  }
    		  System.out.println("���������䣺");
    		  age=input.nextInt();
    		  if(age>=12){
    			  System.out.println(name+"������Ϊ"+age+"�꣬��ƱΪ20Ԫ");
    		  }else{
    			  System.out.println(name+"������Ϊ"+age+"�꣬��ƱΪ0Ԫ");
    		  }
    	  }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Visitor v=new Visitor();
         v.method();
	}

}
