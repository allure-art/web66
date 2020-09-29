package D;

import java.util.Scanner;

public class CustomerBiz {
       //成员属性
	String name[]=new String[30];
	//成员方法--添加顾客姓名，要把得到姓名加到name数组中去
	String[] addName(String n){
		//遍历数组
		for(int i=0;i<name.length;i++){
			if(name[i]==null){
				name[i]=n;
				break;
			}
		}
		return name;
	}
	//成员方法2  显示所有顾客姓名
	void showName(){
		//遍历数组
		for(int i=0;i<name.length;i++){
			if(name[i]!=null){
				System.out.println(name[i]+" ");
			}
		}
	}
	//修改客户姓名的方法
	boolean modifyName(String n,String name2){
		boolean boo=false;
		for(int i=0;i<5;i++){
			if(name[i].equals(n)){
				name[i]=name2;
				boo=true;
				break;
			}
		}
		return boo;
	}
	//查客户姓名1
	boolean search(String n){
		boolean boo=false;
		for(int i=0;i<name.length;i++){
			if(name[i]==null){
				break;
			}
			if(name[i].equals(n)){
				boo=true;
				break;
			}
		}
		return boo;
	}
	//查客户姓名2
	boolean search(int p,int q,String n){
		boolean boo=false;
		for(int i=p-1;i<q;i++){
			if(name[i]==null){
				break;
			}
			if(name[i].equals(n)){
				boo=true;
				break;
			}
		}
		return boo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        //通过类创建对象
        //输入客户姓名
        CustomerBiz cc=new CustomerBiz();
        String name=null;
        for(int i=0;i<5;i++){
        	System.out.println("请输入客户姓名：");
        	name=input.next();
        	cc.addName(name);
        }
        //显示所有客户姓名
        System.out.println("********");
        System.out.println("\t客户姓名列表");
        System.out.println("********");
        cc.showName();
        System.out.println();
        //查找学生姓名
        
         System.out.println("请输入需要查找客户的姓名：");
         name=input.next();
         if(cc.search(name)){
        	 System.out.println("找到该客户");
         }else{
        	 System.out.println("没有找到该客户");
         }
         String name2=null;
         System.out.println("请输入该客户要修改的姓名：");
         name=input.next();
         System.out.println("请输入新客户的姓名：");
         name2=input.next();
         boolean find=cc.modifyName(name,name2);
         if(find){
        	 System.out.println("******修改结果******");
        	 System.out.println("找到并修改成功");
        	 System.out.println("客户列表");
        	 cc.showName();
         }else{
        	 System.out.println("您要修改的客户姓名不存在");
         }
         //按区间查找
         System.out.println("请输入开始查找的位置");
         int p=input.nextInt();
         System.out.println("请输入结束查找的位置");
         int q=input.nextInt();
         System.out.println("请输入查找的姓名");
         name=input.next();
         System.out.println("******查找结果******	");
         if(cc.search(p,q,name)){
        	 System.out.println("找到了该学生");
         }else{
        	 System.out.println("没有找到该学生");
         }
	}

}
