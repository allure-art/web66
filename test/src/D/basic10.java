package D;
import java.util.Scanner;


public class basic10 {

	/**
	 * @param args
	 */
	public static void main(String[] args){
     int old[]=new int[5];
     Scanner input=new Scanner(System.in);
     for(int i=0;i<old.length;i++){
    	 System.out.println("请输入第"+(i+1)+"位会员积分");
    	 old[i]=input.nextInt();
     }
     int newjf[]=new int[5];
     for(int i=0;i<old.length;i++){
    	 newjf[i]=old[i]+500;
     }
     System.out.println("序号\t旧积分\t新积分");
		for(int i=0;i<old.length;i++){
			System.out.println(i+1+"\t"+old[i]+"\t"+newjf[i]);
		}
	}

}
