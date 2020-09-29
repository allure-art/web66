package D;

import java.util.Scanner;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int score[]=new int[4];
        Scanner input=new Scanner(System.in);
        //利用循环从键盘动态输入成绩赋值给数组元素
        for(int i=0;i<score.length;i++){
        	System.out.println("请输入第"+(i+1)+"门课的成绩");
        	score[i]=input.nextInt();
        }
        //循环输出数组元素
        for(int j=0;j<score.length;j++){
        	System.out.println("score["+j+"]="+score[j]);
        }
	}

}
