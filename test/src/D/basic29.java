package D;

public class basic29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //���ַ�������ת��ΪStringBuffer����
		String str="hello";
		System.out.println(str.charAt(3));
		StringBuffer sb=new StringBuffer(str);
		//��StringBuffer����ת��Ϊ�ַ�������
		String ss=sb.toString();
		System.out.println(sb.append("world"));
		System.out.println(sb.append(111));
		System.out.println(false);
	}

}
