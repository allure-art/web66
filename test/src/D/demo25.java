package D;

import java.util.Scanner;

public class demo25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        String str="n";
        //循环语句
        while(str.equals("n")){
        	System.out.println("上午学习理论");
        	System.out.println("下午上机实验");
        	System.out.println("是否掌握了学习内容(y/n)");
        	str=input.next();
        }
        System.out.println("程序结束");
	}

}
