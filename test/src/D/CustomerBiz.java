package D;

import java.util.Scanner;

public class CustomerBiz {
       //��Ա����
	String name[]=new String[30];
	//��Ա����--��ӹ˿�������Ҫ�ѵõ������ӵ�name������ȥ
	String[] addName(String n){
		//��������
		for(int i=0;i<name.length;i++){
			if(name[i]==null){
				name[i]=n;
				break;
			}
		}
		return name;
	}
	//��Ա����2  ��ʾ���й˿�����
	void showName(){
		//��������
		for(int i=0;i<name.length;i++){
			if(name[i]!=null){
				System.out.println(name[i]+" ");
			}
		}
	}
	//�޸Ŀͻ������ķ���
	boolean modifyName(String n,String name2){
		boolean boo=false;
		for(int i=0;i<5;i++){
			if(name[i].equals(n)){
				name[i]=name2;
				boo=true;
				break;
			}
		}
		return boo;
	}
	//��ͻ�����1
	boolean search(String n){
		boolean boo=false;
		for(int i=0;i<name.length;i++){
			if(name[i]==null){
				break;
			}
			if(name[i].equals(n)){
				boo=true;
				break;
			}
		}
		return boo;
	}
	//��ͻ�����2
	boolean search(int p,int q,String n){
		boolean boo=false;
		for(int i=p-1;i<q;i++){
			if(name[i]==null){
				break;
			}
			if(name[i].equals(n)){
				boo=true;
				break;
			}
		}
		return boo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        //ͨ���ഴ������
        //����ͻ�����
        CustomerBiz cc=new CustomerBiz();
        String name=null;
        for(int i=0;i<5;i++){
        	System.out.println("������ͻ�������");
        	name=input.next();
        	cc.addName(name);
        }
        //��ʾ���пͻ�����
        System.out.println("********");
        System.out.println("\t�ͻ������б�");
        System.out.println("********");
        cc.showName();
        System.out.println();
        //����ѧ������
        
         System.out.println("��������Ҫ���ҿͻ���������");
         name=input.next();
         if(cc.search(name)){
        	 System.out.println("�ҵ��ÿͻ�");
         }else{
        	 System.out.println("û���ҵ��ÿͻ�");
         }
         String name2=null;
         System.out.println("������ÿͻ�Ҫ�޸ĵ�������");
         name=input.next();
         System.out.println("�������¿ͻ���������");
         name2=input.next();
         boolean find=cc.modifyName(name,name2);
         if(find){
        	 System.out.println("******�޸Ľ��******");
        	 System.out.println("�ҵ����޸ĳɹ�");
        	 System.out.println("�ͻ��б�");
        	 cc.showName();
         }else{
        	 System.out.println("��Ҫ�޸ĵĿͻ�����������");
         }
         //���������
         System.out.println("�����뿪ʼ���ҵ�λ��");
         int p=input.nextInt();
         System.out.println("������������ҵ�λ��");
         int q=input.nextInt();
         System.out.println("��������ҵ�����");
         name=input.next();
         System.out.println("******���ҽ��******	");
         if(cc.search(p,q,name)){
        	 System.out.println("�ҵ��˸�ѧ��");
         }else{
        	 System.out.println("û���ҵ���ѧ��");
         }
	}

}
