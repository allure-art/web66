package D;

public class basic9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* int a=170;
        //������ֵ
        int b=a;
        System.out.println(b);
        b=180;
        System.out.println(a);
        System.out.println(b);
        int infozhang[]={170,60};
        //��infozhang�ĵ�ַ��infoli �൱��һ����ַ�ռ�����������
        int infoli[]=infozhang;
        System.out.println("�޸�֮ǰ�źƵ����:"+infozhang[0]);
        infoli[0]=180;
        infoli[1]=70;
        System.out.println("�޸�֮���źƵ���ߣ�"+infozhang[0]);
        System.out.println("��������ߣ�"+infoli[0]);*/
        int infozhang[]={170,60};
      //��infozhang�ĵ�ַ��infoli   �൱��һ����ַ�ռ�����������
      		int infoli[]=new int[2];
      		
      		infoli[0]=infozhang[0];
      		infoli[1]=infozhang[1];
      		System.out.println("�޸�֮ǰ�źƵ���ߣ�"+infozhang[0]);
      		System.out.println("�޸�֮ǰ��������ߣ�"+infoli[0]);
      		infoli[0]=180;
      		infoli[1]=70;
      		System.out.println("�޸�֮���źƵ���ߣ�"+infozhang[0]);
      		System.out.println("�޸�֮����������ߣ�"+infoli[0]);
        
        
	}

}
