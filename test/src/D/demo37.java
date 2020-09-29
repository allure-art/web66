package D;

public class demo37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
        for(int i=0;i<=10;i++){
        	if(i%2!=0){
        		continue;
        	}
        	sum+=i;
        }
        System.out.println(sum);
	}

}
