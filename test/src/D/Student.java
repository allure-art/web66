package D;

public class Student {
       //私有成员变量
	private String name;
	private String SID;
	private String sex;
	private int age;
	//自动生成set-get方法
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s1=new Student();
        s1.age=18;
	}
    public String getName(){
    	return name;
    }
    public void setName(String name){
    	this.name=name;
    }
    public String getSID(){
    	return SID;
    }
    public void setSID(String sID){
    	SID=sID;
    }
    public String getSex(){
    	return sex;
    }
    public void setSex(String sex){
    	this.sex=sex;
    }
    public int getAge(){
    	return age;
    }
    public void setAge(int age){
    	this.age=age;
    }
}
