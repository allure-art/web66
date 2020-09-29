package D;
public class MyThread extends Thread{
	public void run(){
		for(int a=0;a<=9;a++){
			System.out.println(getName()+"执行第"+"次");
		}
		try{
			Thread.sleep(800);
		}catch(InterruptedException e){
			//
			e.printStackTrace();
		}
	}
		public static void main(String[] args){
			MyThread t1=new MyThread();
			MyThread t2=new MyThread();
			t1.setName("线程一");
			t2.setName("线程二");
			t1.start();
			t2.start();
		}
	}
