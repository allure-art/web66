package shujujiegou;

public class basic99 {
			public static void main(String[] args){
			final int LINE=9;
			int row,column,num;
			for(row=1;row<=LINE;row++){
			//���ѭ��
			for(column=0;column<LINE-row;column++)//ǰ���ո�
			System.out.print(" ");
			for(num=row;num>=1;num--)
			//ǰ�������
			System.out.print(num+" ");
			for(num=2;num<=row;num++)
			//���������
			System.out.print(num+" ");
			System.out.println();
			//����
			}
			
			

	}

}
