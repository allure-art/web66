package D;

import java.util.Scanner;

public class demo {

	public demo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num=input.nextInt();
        //输出num的百位，十位和个位  除法/  求余%
        int bw,sw,gw;
        bw=num/100;
        sw=num/10%10;
        gw=num%10;
        System.out.println(num+"的百位"+bw);
        System.out.println(num+"的十位"+sw);
        System.out.println(num+"的个位"+gw);
	}

}
