package D;
public class basic26 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //����String��ıȽ��Ƿ������Ҫ��equals(Object obj)����
		//������������Ҫ�Ƚ���ȶ���Ҫ��equals(Object obj);
		Integer num1=new Integer(100);
		Integer num2=new Integer(100);
		System.out.println(num1==num2);
		num1=num2;
		System.out.println(num1==num2);
	}

}
