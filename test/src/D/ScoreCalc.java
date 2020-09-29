package D;

import java.util.Scanner;

public class ScoreCalc {
          int score1;
          int score2;
          int score3;
          int sum;
          double avg;
          //定义一个得到成绩的方法
          void getScore(){
        	  Scanner input=new Scanner(System.in);
        	  System.out.println("请输入第一门课的成绩：");
        	  score1=input.nextInt();
        	  System.out.println("请输入第二门课的成绩：");
        	  score2=input.nextInt();
        	  System.out.println("请输入第三门课的成绩：");
        	  score3=input.nextInt();
          }
          //定义一个求和的方法
          int getSum(){
        	  sum=score1+score2+score3;
        	  return sum;
          }
          //定义一个求平均值的方法
          double getavg(){
        	  avg=sum/3;
              return avg;
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ScoreCalc s=new ScoreCalc();
        s.getScore();
        s.getSum();
        s.getavg();
	}

}
