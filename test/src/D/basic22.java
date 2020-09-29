package D;

public class basic22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //其它类中创建Administrator对象
		Administrator a1=new Administrator();
		a1.user="zhangsan";
		a1.psw="123456";
		a1.show();
		Administrator a2=new Administrator();
		a2.user="lisi";
		a2.psw="234566";
		a2.show();

}
}