package D;

public class basic15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //定义char 数组    正确答案
		char key[]={'a','b','c','d','a','b','c','d'};
		//五个学生，每个学生十个答案
		char answer[][]={
				{'a','b','c','d','d','d','c','d','a','b'},
				{'a','a','c','d','a','b','c','d','a','b'},
				{'b','b','b','d','a','b','b','d','a','b'},
				{'a','c','c','d','a','b','c','d','a','b'},
				{'a','d','c','d','d','b','c','d','a','b'}	
		};
		//遍历二维数组
		int ca=0;
		for(int i=0;i<answer.length;i++){
			ca=0;
			for(int j=0;j<answer[i].length;j++){
				if(answer[i][j]==key[j])
					ca++;
			}
			System.out.println("第"+(i+1)+"个同学答对了"+ca+"题");
		}
	}

}
