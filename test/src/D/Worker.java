package D;

public class Worker {
       String name;
       public void setName(String name){
    	   this.name=name;
       }
       void showMe(){
    	   System.out.println("�ҵ����ֽУ�"+name);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Worker ww=new Worker();
        ww.setName("�Ŵ�ΰ");
        ww.showMe();
	}

}
