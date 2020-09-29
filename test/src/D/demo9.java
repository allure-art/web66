package D;

public class demo9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean boo=false;
        boolean boo1=3==5;
        boolean boo2=true||false;
        System.out.println(boo);
        System.out.println(boo1);
        System.out.println(boo2);
        int a=5;
        int b=7;
        boolean boo3=a==b;
        a=b;
        System.out.println("a="+a+"b="+b);
        //逻辑运算符
        //与运算，全真才为真，有假结果为假
        System.out.println(true&&true);
        System.out.println(true&&false);
        //或运算，有真结果为真，全假才为假
        System.out.println(false||true);
        System.out.println(false||false);
        //非运算，求反
        System.out.println(false);
	}

}
