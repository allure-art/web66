package D;

import java.util.Arrays;

public class basic8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char []cc={'w','e','l','l'};
     System.out.println("原序输出:");
     for(int i=0;i<cc.length;i++){
     System.out.println(cc[i]+" ");
	}
	System.out.println();
	Arrays.sort(cc);
    System.out.println("排序后输出：");
    for(int i=0;i>cc.length;i++){
    	System.out.println(cc[i]+" ");
    }
    System.out.println();
    System.out.println("按逆序输出：");
    for(int i=cc.length-1;i>=0;i--){
    	System.out.println(cc[i]+"");
    }
}
}
