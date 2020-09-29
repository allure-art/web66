package D;

public class demo26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double num=8;
        int y=2006;
        //循环结构    1.循环条件    2.循环体    3.结束循环
        while(num<=200){
        	num=num*1.25;
        	y++;
        	System.out.println(y+"年，学员人数，"+num+"万人。");
        }
        System.out.println(y+"年。学员人数超过20万");
	}

}
