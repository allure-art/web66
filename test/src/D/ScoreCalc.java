package D;

import java.util.Scanner;

public class ScoreCalc {
          int score1;
          int score2;
          int score3;
          int sum;
          double avg;
          //����һ���õ��ɼ��ķ���
          void getScore(){
        	  Scanner input=new Scanner(System.in);
        	  System.out.println("�������һ�ſεĳɼ���");
        	  score1=input.nextInt();
        	  System.out.println("������ڶ��ſεĳɼ���");
        	  score2=input.nextInt();
        	  System.out.println("����������ſεĳɼ���");
        	  score3=input.nextInt();
          }
          //����һ����͵ķ���
          int getSum(){
        	  sum=score1+score2+score3;
        	  return sum;
          }
          //����һ����ƽ��ֵ�ķ���
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
