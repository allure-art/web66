package D;
//����ӿ�
interface Memory{
	//ֻ�ܶ�����󷽷�������û��abstract����
	void getName();
	void getMemoryType();
}
//ʵ�ֽӿڣ�ͨ����ʵ�ֽӿ�
class xxx implements Memory{

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("�ִ�");
	}

	@Override
	public void getMemoryType() {
		// TODO Auto-generated method stub
		System.out.println("DDR2");
	}
	
}
public class class33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //�����ӿڶ��󣬽ӿڲ���ʵ���������ǿ��Խ��ӿ�ʵ����Ķ���ֵ���ӿڶ���
		Memory m=new xxx();
		m.getName();
		m.getMemoryType();
	}

}
