package D;

import java.util.Scanner;

public class demo22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("�������Ƿ�Ϊ��Ա(y/n)");
        String v=input.next();
        if(v.equals("y")){
        	System.out.println("�������Ա���֣�");
        	int jf=input.nextInt();
        	if(jf>800) System.out.println("����6���Ż�");
        	else if(jf>4000) System.out.println("����7���Ż�");
        	else if(jf>2000) System.out.println("����8���Ż�");
        	else System.out.println("����9���Ż�");
        }else{
        	System.out.println("�ǻ�Ա��û���ۿ�");
        }
	}

}
