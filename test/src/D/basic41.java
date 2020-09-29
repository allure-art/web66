package D;

import java.util.Scanner;

public class basic41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("******文件提交系统******");
        Scanner input=new Scanner(System.in);
        System.out.println("请输入文件名：");
        String fn=input.next();
        System.out.println("请输入邮箱名：");
        String email=input.next();
        //文件名截取
        String str=fn.substring(fn.indexOf('.')+1);
        int num1=fn.indexOf('.');
        int num2=email.indexOf('.');
        int num3=email.indexOf('@');
        if(num1!=-1&&num2!=-1&&num3!=-1&&str.equals("java")&&num2>num3){
        	System.out.println("文件提取成功！");
        }else{
        	System.out.println("文件提取失败！");
        }
	}

}
