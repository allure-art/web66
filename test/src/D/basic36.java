package D;

import java.util.Scanner;

public class basic36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
        //把可能出现的异常的语句放在try中
			Scanner input=new Scanner(System.in);
			System.out.println("请输入第一个数：");
			int num1=input.nextInt();
			System.out.println("请输入第二个数：");
			int num2=input.nextInt();
			System.out.println("计算前：");
			System.out.println(num1/num2);
			System.out.println("计算后：");
		}
	catch(Exception e){
		//如果tr块中有语句出现异常，产生的异常对象被catch捕获，赋值给e
		System.out.println(e.toString());
	}finally{
		//释放资源
		System.out.println("不管是否有异常，fianlly中的语句都会执行");
	}
}
}