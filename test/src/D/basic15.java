package D;

public class basic15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //����char ����    ��ȷ��
		char key[]={'a','b','c','d','a','b','c','d'};
		//���ѧ����ÿ��ѧ��ʮ����
		char answer[][]={
				{'a','b','c','d','d','d','c','d','a','b'},
				{'a','a','c','d','a','b','c','d','a','b'},
				{'b','b','b','d','a','b','b','d','a','b'},
				{'a','c','c','d','a','b','c','d','a','b'},
				{'a','d','c','d','d','b','c','d','a','b'}	
		};
		//������ά����
		int ca=0;
		for(int i=0;i<answer.length;i++){
			ca=0;
			for(int j=0;j<answer[i].length;j++){
				if(answer[i][j]==key[j])
					ca++;
			}
			System.out.println("��"+(i+1)+"��ͬѧ�����"+ca+"��");
		}
	}

}
