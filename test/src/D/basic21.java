package D;
class Teacher{
	//��Ա����
	String name;
	String p;
	String c;
	int age;
	void showlnfo(){
		System.out.println(name+"��ʦ\nרҵ����"+p+"\n���ڿγ̣�"+c+"\n���䣺"+age);
	}
	//��Ա����
}
public class basic21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Teacher t1=new Teacher();
        t1.name="��";
        t1.p="���������";
        t1.c="������ƺ�java�������";
        t1.age=15;
        t1.showlnfo();
	}

}
