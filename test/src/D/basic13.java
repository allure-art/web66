package D;

public class basic13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char key[]={'A','B','C','D','A'};
        char answer[][]={{'A','B','C','D','A'},{'A','B','C','D','A'},
        		{'A','B','C','D','A'},{'A','B','C','D','A'},{'A','B','C','D','A'}
        };
        for(int i=0;i<answer.length;i++){
        	for(int j=0;j<answer[i].length;j++){
        		System.out.println(answer[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
