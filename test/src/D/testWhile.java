package D;

public class testWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
        //�̶�ѭ���Ĵ���
        //ѭ����������ֵ  --���ʽ1
        int i=1;
        //ѭ������������  --���ʽ2
        while(i<=10){
        	sum=sum+i;
        	//ѭ�����������ѭ�������ı仯--���ʽ3
        	i++;
        }
        System.out.println("sum="+sum);
	}

}
