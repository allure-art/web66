package D;

public class basic5 {

	 /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[] pp={"aaa","bbb","ccc","eee","ddd"};
    //ѧϰ��������--ѭ�������������Ԫ��
    System.out.println("���λ���ؼ���Ʒ�У�");
    for(int i=0;i<pp.length-1;i++){
    	System.out.println(pp[i]);
    }
    //��������--����2
    for(String ss:pp){
    	System.out.println(ss);
    }
	}

}
