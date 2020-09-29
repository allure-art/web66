package D;

public class Person {
         String name;
         int age;
     public Person(String name,int age){
    	 //当成员变量与局部变量的变量名相同时，需要通过this关键字引出成员变量
    	 this.name=name;
    	 this.age=age;
     }
     void Show(){
    	 System.out.println("姓名："+this.name+"，年龄："+this.age);
     }
     public Person(){
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person p=new Person();
        p.Show();
        Person p1=new Person("小明",18);
        p1.Show();
	}

}
