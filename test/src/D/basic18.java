package D;

import java.util.Scanner;

public class basic18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        String user=null,user1=null,psw=null,psw1=null;
        int i=1;
        int castNo=0;
        while(true){
        	System.out.println("******��ӭ���뽱�͸���ϵͳ******");
        	System.out.println("\t1.ע��");
        	System.out.println("\t2.ע��");
        	System.out.println("\t3.�齱");
        	System.out.println("****************");
        	System.out.println("��ѡ��˵���");
        	int num=input.nextInt();
        	switch(num){
        	case 1:
        		System.out.println("[���͸���ϵͳ>ע��]");
        	    System.out.println("����д������Ϣ");
        	    System.out.println("�û�����");
        	    user=input.next();
        	    System.out.println("���룺");
        	    psw=input.next();
        	    castNo=(int)(Math.random()*10000);
        	    System.out.println("ע��ɹ�����Ǻ��û���������");
        	    System.out.println("�û���\t����\t��Ա��");
        	    System.out.println(user+"\t"+psw+"\t"+castNo);
        	    break;
        	    case 2:System.out.println("[���͸���ϵͳ>��¼]");
        	    int i1=1;
    			if(user!=null&&psw!=null){
    				while(true){
    					System.out.print("�û�����");
    					user1 = input.next();
    					System.out.print("���룺");
    					psw1 = input.next();
    					if(user1.equals(user)&&psw1.equals(psw)){
    						System.out.println("��ӭ����"+user1);
    						break;
    					}else{
    						
    						System.out.println("�û�������������");
    					}
    					
    					i1++;
    					if(i1==3){
    						break;
    					}
    				}
    			}else{
    				System.out.println("����ע�ᣡ");
    			}
        	    break;
			case 3:System.out.println();
        	    int xy[]=new int[5];
        	    for(int j=0;j<xy.length;j++){
        	    	xy[j]=(int)(Math.random()*10000);
        	    }
        	    System.out.println("������������");
        	    for(int n:xy){
        	    	System.out.println(n+" ");
        	    }
        	    System.out.println();
        	    for(int j=0;j<xy.length;j++){
        	    	if(castNo!=0){
        	    		if(xy[j]==castNo){
        	    			System.out.println("���Ǳ������˻�Ա��");
        	    			break;
        	    		}
        	    	}
        	    	if(j==4){
        	    		System.out.println("�㲻�ǽ������˻�Ա��");
        	    	}
        	    }
        	    break;
        	    default: System.out.println("��������");
        	}
        	System.out.println("������(y/n)");
        	String a=input.next();
        	if(a.equals("n")){
        		System.out.println("ϵͳ�˳���");
        		break;
        	}
        }
	}

}
