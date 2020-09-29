package shujujiegou;

public class basic98 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        final int LINE=9;
		        int row,column,num;
		        for(row=1;row<=LINE;row++){                  	//外层循环
		            for(column=0;column<LINE-row;column++)   	//前导空格
		                System.out.print("  ");
		            for(num=row;num>=1;num--)            //前面的数字
		                System.out.print(num+" ");
		            for(num=2;num<=row;num++)           //后面的数字
		            	System.out.print(num+" ");
		            System.out.println();         	//换行
		        }
		    }
		

	}


