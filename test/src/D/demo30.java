package D;

public class demo30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //ʵ����ֵ��ת
		int num=12345;
		int n;
		System.out.println(num+"��תΪ:");
		while(num>0){
			n=num%10;
			System.out.println(n);
			num=num/10;
		}
	}

}
