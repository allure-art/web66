package D;
//������
abstract class Shape1{
	//��Ա����
	String tt;
	//��Ա����
	public void method(){
		System.out.println("��������Զ�����ͨ��Ա����");
	}
	//���󷽷���abstract���Σ�ֻ�з�������û�з�����
	public abstract void show();
}
class AAA{
	
}
class Circle extends Shape1{
	public void show(){
		System.out.println("����һ��Բ��");
	}
}
class Square extends Shape1{
	public void show(){
		System.out.println("����һ������");
	}
}
public class basic32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Shape1 ss=new Circle();
        Shape1 dd=new Square();
       // Shape1 rr=new Shape1();
        ss.show();
        ss.method();
	}

}
