package D;

import java.util.Scanner;

public class basic3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //���޷������ֵ
		int max=0;
		Scanner input=new Scanner(System.in);
		int num[]=new int[5];
		for(int i=0;i<num.length;i++){
			System.out.println("�������"+(i+1)+"�ſγɼ�");
			num[i]=input.nextInt();
			if(max<num[i]){
				max=num[i];
			}
		}
			System.out.println("��߷֣�"+max);
	
	}

}
