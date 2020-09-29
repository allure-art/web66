package D;
class MyThread3 implements Runnable{
        private int count=0;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			test();	
	}
private synchronized void test(){
	for(int i=0;i<5;i++){
		count++;
		Thread.yield();
		count--;
		System.out.println(count+"");
	}
}
	}
public class basic101{
	public static void main(String[] args){
		Runnable r=new MyThread3();
		Thread t1=new Thread (r);
		Thread t2=new Thread(r);
		t1.start();
		t2.start();
	}
}
