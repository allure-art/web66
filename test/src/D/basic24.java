package D;

class basic24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //�����ַ�������
		String str="helloword";
		//����ͨ�����췽���õ�
		String str1=new String();
		String str2=new String("helloword");
		//�����ַ����鴴���ַ�������
		char cc[]={'h','e','L','L','O'};
		String str3=new String(cc);
		System.out.println(str+" "+str1+" "+str2+" "+str3);
		//���ַ����ĳ��� String���length ����
		int l=str3.length();
		System.out.println(l);
	}

}
