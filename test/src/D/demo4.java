package D;

import java.util.Scanner;

public class demo4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("������һ������");
        int date=input.nextInt();
        date=(int)((date*10+5)/2+3.14159);
        System.out.println("���ܺ�"+date);
	}

}
