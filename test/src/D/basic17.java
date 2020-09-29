package D;

public class basic17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num[][]=new int[7][7];
        for(int i=0;i<num.length;i++){
        	for(int j=0;j<=i;j++){
        		if(j==0||i==j){
        			num[i][j]=1;
        		}else{
        			num[i][j]=num[i-1][j]+num[i][j];
        		}
        		System.out.println(num[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
