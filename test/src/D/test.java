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
        //����ѭ���Ӽ��̶�̬����ɼ���ֵ������Ԫ��
        for(int i=0;i<score.length;i++){
        	System.out.println("�������"+(i+1)+"�ſεĳɼ�");
        	score[i]=input.nextInt();
        }
        //ѭ���������Ԫ��
        for(int j=0;j<score.length;j++){
        	System.out.println("score["+j+"]="+score[j]);
        }
	}

}
