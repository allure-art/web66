package D;
public class MyThread extends Thread{
	public void run(){
		for(int a=0;a<=9;a++){
			System.out.println(getName()+"ִ�е�"+"��");
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
			t1.setName("�߳�һ");
			t2.setName("�̶߳�");
			t1.start();
			t2.start();
		}
	}
