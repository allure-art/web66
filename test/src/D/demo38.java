package D;

public class demo38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //ѭ��Ƕ��
		/*
		 * ��i=1ʱ   ��������  �ڲ�for���ִ����  ִ�л������
		 * ��i=2ʱ   ��������  �ڲ�for���ִ����   ִ�л������
		 * ��i=3ʱ   ��������  �ڲ�for���ִ����   ִ�л������
		 * ��i=4ʱ   ��������  �ڲ�for���ִ����    ִ�л������
		 * ��i=5ʱ   ��������  �ڲ�for���ִ����    ִ�л������
		 * ��i=6ʱ   ����������  ѭ������
		 */
		System.out.println("******�����ڳ˷���******");
		//��ӡi*j=i*j
		for(int i=1;i<=5;i++){
			System.out.println("�����"+i+"�У�");
			for(int j=1;j<=i;j++){
				System.out.println(j+"*"+i+"="+i*j);
			}
			System.out.println("");
		}
	}

}
