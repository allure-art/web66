
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int STB=89;
		int Java=90;
		int SQL=60;
		System.out.print("STB的成绩是："+STB);
		System.out.print("Java的成绩是："+Java);
		System.out.print("SQL的成绩是："+SQL);
		int diffen;
		double avg;
		diffen=Java-SQL;
		System.out.println("Java和SQL的成绩差："+diffen);
        avg=(STB+Java+SQL)/3;
        System.out.println("3门课的平均分是："+avg);
	}

}


