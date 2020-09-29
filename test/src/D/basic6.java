package D;

import java.util.Arrays;

public class basic6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num[]={33,44,55,66,77};
       //利用Arrays类的sort方法对num数组排序
       Arrays.sort(num);
       System.out.println("排序后:");
       for(int i:num){
    	   System.out.println(i+"\n");
       }
	}

}
