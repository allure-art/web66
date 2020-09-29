package D;

import java.util.Scanner;

public class demo11 {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("购物管理系统>客户信息管理>添加客户信息\n");
      Scanner input=new Scanner(System.in);
      System.out.println("请输入会员号(<4位整数)>");
      int castNo=input.nextInt();
      System.out.println("请输入会员号生日：");
      String birthday=input.next();
      System.out.println("请输入积分：");
      int jf=input.nextInt();
      if(castNo>=1000&&castNo<=9999){
    	  System.out.println("已录入的会员信息：");
    	  System.out.println(castNo+"\t"+birthday+"\t"+jf);
      }else{
    	  System.out.println("录入信息有误");
      }
	}

}
