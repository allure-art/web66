package D;

import java.util.Arrays;

public class basic4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //数组排序
		int num[]={2,5,3,6,13,5,7};
		System.out.println("排序前：");
		for(int i:num){
			System.out.println(i+"\t");
		}
		System.out.println();
		//完成排序
		Arrays.sort(num);
		System.out.println("排序后：");
		for(int i:num){
			System.out.println(i+"\t");
		}
	}

}
