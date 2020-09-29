package D;

import java.util.Scanner;

public class Visitor {
      String name;
      int age;
      void method(){
    	  Scanner input=new Scanner(System.in);
    	  while(true){
    		  System.out.println("请输入姓名：");
    		  name=input.next();
    		  if(name.equals("n")){
    			  System.out.println("程序退出");
    		      break;
    		  }
    		  System.out.println("请输入年龄：");
    		  age=input.nextInt();
    		  if(age>=12){
    			  System.out.println(name+"的年龄为"+age+"岁，门票为20元");
    		  }else{
    			  System.out.println(name+"的年龄为"+age+"岁，门票为0元");
    		  }
    	  }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Visitor v=new Visitor();
         v.method();
	}

}
