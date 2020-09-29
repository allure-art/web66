package D;

public class basic11 {
     static void showme(){
    	 System.out.println("我们正在学习java语言");
     }
     static int add(int a,int b){
    	 int sum=a+b;
    	 a+=10;
    	 b+=10;
    	 System.out.println("a="+a);
    	 System.out.println("b="+b);
    	 return sum;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       showme();
       int x=80;
       int y=90;
       //通过变量传值
       int sum=add(x,y);
       System.out.println("x="+x);
       System.out.println("y="+y);
       System.out.println("x+y="+sum);
	}

}
