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
    	 System.out.println("�������"+(i+1)+"λ��Ա����");
    	 old[i]=input.nextInt();
     }
     int newjf[]=new int[5];
     for(int i=0;i<old.length;i++){
    	 newjf[i]=old[i]+500;
     }
     System.out.println("���\t�ɻ���\t�»���");
		for(int i=0;i<old.length;i++){
			System.out.println(i+1+"\t"+old[i]+"\t"+newjf[i]);
		}
	}

}
