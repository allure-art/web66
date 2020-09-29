package D;

public class demo38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //循环嵌套
		/*
		 * 当i=1时   满足条件  内层for语句执行完  执行换行语句
		 * 当i=2时   满足条件  内层for语句执行完   执行换行语句
		 * 当i=3时   满足条件  内层for语句执行完   执行换行语句
		 * 当i=4时   满足条件  内层for语句执行完    执行换行语句
		 * 当i=5时   满足条件  内层for语句执行完    执行换行语句
		 * 当i=6时   条件不满足  循环结束
		 */
		System.out.println("******五以内乘法表******");
		//打印i*j=i*j
		for(int i=1;i<=5;i++){
			System.out.println("输出第"+i+"行：");
			for(int j=1;j<=i;j++){
				System.out.println(j+"*"+i+"="+i*j);
			}
			System.out.println("");
		}
	}

}
