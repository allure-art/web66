package D;

public class Person {
         String name;
         int age;
     public Person(String name,int age){
    	 //����Ա������ֲ������ı�������ͬʱ����Ҫͨ��this�ؼ���������Ա����
    	 this.name=name;
    	 this.age=age;
     }
     void Show(){
    	 System.out.println("������"+this.name+"�����䣺"+this.age);
     }
     public Person(){
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person p=new Person();
        p.Show();
        Person p1=new Person("С��",18);
        p1.Show();
	}

}
