package D;

public class basic29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //将字符串对象转换为StringBuffer对象
		String str="hello";
		System.out.println(str.charAt(3));
		StringBuffer sb=new StringBuffer(str);
		//将StringBuffer对象转换为字符串对象
		String ss=sb.toString();
		System.out.println(sb.append("world"));
		System.out.println(sb.append(111));
		System.out.println(false);
	}

}
