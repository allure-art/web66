package D;

import java.util.Scanner;

public class Shape {
       //带两个参数打印图形的方法
	public void method(int num,String str){
		for(int i=0;i<num;i++){
			for(int j=0;j<=i;j++){
				System.out.println(str+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("请输入要打印的行数：");
        int n=input.nextInt();
        System.out.println("请输入要打印的符号：");
        String s=input.next();
        Shape ss=new Shape();
        //调用method(int num,String str)的方法，完成数据传递，然后程序转入method方法中
	    ss.method(n, s);
	}

}
