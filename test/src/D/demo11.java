package D;

import java.util.Scanner;

public class demo11 {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("�������ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ\n");
      Scanner input=new Scanner(System.in);
      System.out.println("�������Ա��(<4λ����)>");
      int castNo=input.nextInt();
      System.out.println("�������Ա�����գ�");
      String birthday=input.next();
      System.out.println("��������֣�");
      int jf=input.nextInt();
      if(castNo>=1000&&castNo<=9999){
    	  System.out.println("��¼��Ļ�Ա��Ϣ��");
    	  System.out.println(castNo+"\t"+birthday+"\t"+jf);
      }else{
    	  System.out.println("¼����Ϣ����");
      }
	}

}
