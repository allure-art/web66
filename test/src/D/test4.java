package D;

public class test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++){
        	//�ȴ�ӡ�ո�
        	for(int s=1;s<=20-i;s++){
        		System.out.println(" ");
        	}
        	//��ӡ��
        	for(int m=1;m<=2*i-1;m++){
        		System.out.println("*");
        	}
        	System.out.println();
        }
	}

}
