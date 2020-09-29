package D;

import java.util.Scanner;

public class demo13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("请输入三个数：");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int max,min;
        if(a>b){
        	max=a;
        	min=b;
        }else{
        	max=b;
        	min=a;
        }
        if(max<c){
        	System.out.println(c+"\t"+max+"\t"+min);
        }else{
        	if(min>c){
        		System.out.println(max+"\t"+min+"\t"+c);
        	}else{
        		System.out.println(max+"\t"+c+"\t"+min);
        	}
        }
        //中间变量
        int temp;
        if(a<b){
        	//两个数之间的比较和交换
        	temp=a;
        	a=b;
        	b=temp;
        }
        if(a<c){
        	temp=a;
        	a=c;
        	c=temp;
        }if(b<c){
        	temp=b;
        	b=c;
        	c=temp;
        }
        System.out.println("三个数从大到小："+a+" "+b+" "+c);
	}

}
