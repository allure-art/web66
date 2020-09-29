package D;

import java.util.Scanner;

public class basic2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num[]={8,4,2,1,23,344,12};
     int sum=0;
     //把数组中所有元素输出————遍历数组
     for(int i=0;i<num.length;i++){
    	 System.out.println(num[i]+" ");
     }
     System.out.println();
     //第二种遍历数组的方法
     for(int n:num){
    	 System.out.println(n+" ");
    	 sum+=n;
     }
     System.out.println();
     System.out.println("数组元素的和"+sum);
     Scanner input=new Scanner(System.in);
     System.out.println("请输入值：");
     int m=input.nextInt();
     for(int i=0;i<num.length;i++){
    	 if(m==num[i]){
    		 System.out.println("数列中包含的输入数值");
    		 break;
    	 }
    	 if(i==num.length-1){
    		 System.out.println("数列中不包含输入的数值");
    	 }
    	 
    	 
    	 
    	 
    	 
     }
	}

}
