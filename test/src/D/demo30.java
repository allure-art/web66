package D;

public class demo30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //实现数值反转
		int num=12345;
		int n;
		System.out.println(num+"反转为:");
		while(num>0){
			n=num%10;
			System.out.println(n);
			num=num/10;
		}
	}

}
