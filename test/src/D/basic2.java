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
     //������������Ԫ���������������������
     for(int i=0;i<num.length;i++){
    	 System.out.println(num[i]+" ");
     }
     System.out.println();
     //�ڶ��ֱ�������ķ���
     for(int n:num){
    	 System.out.println(n+" ");
    	 sum+=n;
     }
     System.out.println();
     System.out.println("����Ԫ�صĺ�"+sum);
     Scanner input=new Scanner(System.in);
     System.out.println("������ֵ��");
     int m=input.nextInt();
     for(int i=0;i<num.length;i++){
    	 if(m==num[i]){
    		 System.out.println("�����а�����������ֵ");
    		 break;
    	 }
    	 if(i==num.length-1){
    		 System.out.println("�����в������������ֵ");
    	 }
    	 
    	 
    	 
    	 
    	 
     }
	}

}
