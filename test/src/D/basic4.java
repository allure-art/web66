package D;

import java.util.Arrays;

public class basic4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //��������
		int num[]={2,5,3,6,13,5,7};
		System.out.println("����ǰ��");
		for(int i:num){
			System.out.println(i+"\t");
		}
		System.out.println();
		//�������
		Arrays.sort(num);
		System.out.println("�����");
		for(int i:num){
			System.out.println(i+"\t");
		}
	}

}
