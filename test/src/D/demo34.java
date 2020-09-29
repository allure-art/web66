package D;

import java.util.Scanner;

public class demo34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        double down=0;
        int age;
        //循环次数不固定
        for(int i=1;i<=10;i++){
        	System.out.println("请输入第"+i+"位顾客的年龄：");
        	age=input.nextInt();
        	if(age<30){
        		down++;
        	}
        }
        System.out.println("30岁以下的顾客比例"+down/10*100+"%");
        System.out.println("30岁以上的顾客比例"+(10-down)/10*100+"%");
	}

}
