package D;

import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.Menu; 
public class TextEditor extends Frame{
          //��Ա����
	      //1.�˵��������
	MenuBar mb=new MenuBar();
	Menu file;
	MenuItem nw;
	MenuItem op;
	MenuItem cl;
	MenuItem sf;
	MenuItem ex;
	
	//2.�ı��༭����
	TextArea tx;
	//�˵������봦��ĳ�Ա����
	void menuinit(){
		mb=new MenuBar();
		file=new Menu("�ļ�");
		nw=new MenuItem("�½��ļ�");
		op=new MenuItem("���ļ�");
		cl=new MenuItem("�ر��ļ�");
		sf=new MenuItem("�����ļ�");
		ex=new MenuItem("��       ��");
		file.add(nw);
		file.add(op);
		file.add(cl);
		file.add(sf);
		file.add(ex);
		file.add(file);
		setMenuBar(mb);
	}
	//���췽��
	public TextEditor(String title){
		super(title);
		//���ô����С
		this.setSize(400,400);
		menuinit();
		//���ô�������Ļ������ʾ
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new TextEditor("�����ı��༭��");
	}

}
