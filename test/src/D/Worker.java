package D;

public class Worker {
       String name;
       public void setName(String name){
    	   this.name=name;
       }
       void showMe(){
    	   System.out.println("我的名字叫："+name);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Worker ww=new Worker();
        ww.setName("张大伟");
        ww.showMe();
	}

}
