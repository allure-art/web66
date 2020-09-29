package D;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
class Hander extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}
public class TestEditor extends Frame implements ActionListener{
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
	//�˵������봦���Ա����
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
    mb.add(file); 
    setMenuBar(mb);
    //Ϊ������Ӽ�����

    nw.addActionListener(this);
    op.addActionListener(this);
    cl.addActionListener(this);
    sf.addActionListener(this);
    ex.addActionListener(this);
	}
	//���췽��
	public TestEditor(String title){
		super(title);
		//���ô����С
		this.setSize(400,400);
		menuinit();
		this.setLocationRelativeTo(null);
		tx=new TextArea();
		this.add(tx);
		//this.setLocationRelativeTo(null);
        this.setVisible(true);
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new TestEditor("�����ı��༭��");
	}
    public void actionPerformed(ActionEvent e){
    	Object ob=e.getSource();
    	JFileChooser f=new JFileChooser();
    	if((ob==nw)||(ob==cl)){
    		tx.setText(" ");
    	}else if(ob==op){
    		f.showSaveDialog(this);
    		//��ȡ�ļ�������--������
    		try{
    			StringBuffer s=new StringBuffer();
    			//�ַ�������
    			FileReader in=new FileReader(f.getSelectedFile());
    			while(true){
    				int b=in.read();
    				if(b==-1){
    					break;
    				}else{
    					s.append((char)b);
    				}
    			}
    			tx.setText(s.toString());
    			in.close();
    		}catch(Exception e2){
    		
    		}
    	}else if(ob==sf){
    		f.showSaveDialog(this);
    		try{
    			FileWriter out=new FileWriter(f.getSelectedFile());
    			String str=tx.getText();
    			System.out.println(str);
    			out.close();
    		}catch(Exception e2){
    			
    		}
    	}else if(ob==ex){
    		System.exit(0);
    	}
	}
    
}
