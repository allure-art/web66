package D;
//����
class Person1{
	//��Ա����
	private String name;
	private int age;
	//show������һ���������ķ��������Ҳ��������������ø���Ա������ͬ��
	//�ڷ�������Ҫ���ʳ�Ա����һ��Ҫʹ��this���������this������Ҳ����ʡ��
	public void show(){
		System.out.println("������"+this.name+"�����䣺"+age);
	}
	public Person1(){
		System.out.println("�����Ǹ���ɵ�ƣ�");
	}
	public Person1(String name){
		System.out.println("�������Ĺ��췽��");
	}
	//�Զ�����set��get����
	public String setName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
}
//����
class Teacher1 extends Person1{
	public Teacher1(){
		super("����");
		System.out.println("�����㣬�벻Ҫ���֣�");
	}
	int tAge;
	//�����ж����븸��ͬ����������Ϊ�������ǣ��������ǣ�����������з��ʲ��������show����
	public void show(){
		System.out.println("������"+111+"������"+111+"����"+tAge);
	}
}
class Stu extends Person1{
	
}
//������
public class TestJc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         *Teacher1 t1=new Teacher1();
         *������ԴӸ���̳����Ժͷ���
         *t1.name="����";
         *t1.age=35;
         *ti.tAge=7;
         *t1.show();
         */
		Teacher1 t1=new Teacher1();
		t1.setName("����");
		t1.setAge(40);
		t1.tAge=12;
		t1.show();
		Person1 p=new Person1();
		//�ѽ�ʦ�����ֵ��������������ǿ��Եģ����൱�������ǵ�һ�����С��Χ
		//����ת�� �����Ϳ��Ը�ֵ���������ͣ���������Ҫת������Ҫǿת
		Person1 p2=new Teacher1();
		//Teacher1 t2=new Person1();
		//��������Ҫת����������Ҫǿת
		Teacher1 t3=(Teacher1)p2;
		Person1 p3=new Stu();
		//����ת���쳣 ClassCastException
		Teacher1 t4=(Teacher1)p3;
	}

}
