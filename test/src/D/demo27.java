package D;

public class demo27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //计算机三大结构  顺序结构  选择结构  循环结构
		int sum=0;
		int i=1;
		while(i<=100){
			if(i%2==0){
				sum+=i;
			}
			i++;
			
		}
		System.out.println("1+2+---+100="+sum);

}
}
