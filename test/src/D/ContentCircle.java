package D;
//同心圆类

public class ContentCircle {
       //static修饰成员变量
	  public static int x=100,y=100;
	  int r;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ContentCircle t1=new ContentCircle();
        ContentCircle t2=new ContentCircle();
        t1.r=50;
        t1.x+=100;
        t2.x+=200;
        t2.r=150;
        System.out.println(t1.x+","+t1.y+","+t1.r);
        System.out.println(t2.x+","+t2.y+","+t2.r);
	}

}
