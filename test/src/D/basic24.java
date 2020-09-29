package D;

class basic24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //创建字符串对象
		String str="helloword";
		//可以通过构造方法得到
		String str1=new String();
		String str2=new String("helloword");
		//利用字符数组创建字符串对象
		char cc[]={'h','e','L','L','O'};
		String str3=new String(cc);
		System.out.println(str+" "+str1+" "+str2+" "+str3);
		//求字符串的长度 String类的length 方法
		int l=str3.length();
		System.out.println(l);
	}

}
