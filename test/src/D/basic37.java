package D;

import java.io.FileReader;

public class basic37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //算术运算异常    ArithmeticException
		int a=5,b=0;
	    int c=a/b;
	    System.out.println(c);
	    //数组下标越界异常    ArrayIndexOutOfBoundsException
	    int arr[]={5,6,7,8,9};
	    //System.out.println(arr[10]);
	    System.out.println("我  你");
	    //空对象异常  NullPionterException
	    String str=null;
	    System.out.println(str.length());
	    //数据格式异常    NumberFormatException
	    String num1="中国";
	    String num2="88";
	    //把字符串转化成整形
	    int score1=Integer.parseInt(num1);
	    int score2=Integer.parseInt(num2);
	    System.out.println("总分："+(score1+score2));
	    //文件找不到异常   FileNotFoundException
	    //FileReader fr=new FileReader("e:\\test.txt");
	    System.out.println("hello");
	}

}
