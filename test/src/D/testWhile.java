package D;

public class testWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
        //固定循环的次数
        //循环变量赋初值  --表达式1
        int i=1;
        //循环变量的条件  --表达式2
        while(i<=10){
        	sum=sum+i;
        	//循环趋向结束，循环变量的变化--表达式3
        	i++;
        }
        System.out.println("sum="+sum);
	}

}
