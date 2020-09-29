package D;

public class basic14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //二维数组的声明并分配内存
		int num[][]=new int[3][4];
		//遍历二维数组
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num[i].length;i++){
				System.out.println("num["+i+"]["+j+"]="+num[i][j]+"\t");
			}
			System.out.println();
			}
			//声明二维数组并赋初始值
			int score[][]={
					{60,70,80,90},
					{66,77,88,99},
					{79,69,69,89},
					{78,79,88,96},
					{81,83,86,91},
			};
			for(int i1=0;i1<score.length;i1++){
				for(int j=0;j<score[i1].length;j++){
					System.out.println("score["+i1+"]["+j+"]="+num[i1][j]+"\t");
				}
				System.out.println();
			}
		}
}


