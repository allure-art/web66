package D;

import java.util.Scanner;

public class Shape {
       //������������ӡͼ�εķ���
	public void method(int num,String str){
		for(int i=0;i<num;i++){
			for(int j=0;j<=i;j++){
				System.out.println(str+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("������Ҫ��ӡ��������");
        int n=input.nextInt();
        System.out.println("������Ҫ��ӡ�ķ��ţ�");
        String s=input.next();
        Shape ss=new Shape();
        //����method(int num,String str)�ķ�����������ݴ��ݣ�Ȼ�����ת��method������
	    ss.method(n, s);
	}

}
