package D;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class bb extends WindowAdapter{
	public void WindowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
}
class KeyHandler implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		//System.out.println("����");
		if((ob==userlogin.txtName)&&(e.getKeyCode()==10)){
			System.out.println(userlogin.txtName.getText());
		}else if((ob==userlogin.txtPass)&&(e.getKeyCode()==10)){
			System.out.println(userlogin.txtName.getText());
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Ц��");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
class FocusHandler implements FocusListener{

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("��ȡ����");
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		if(ob==userlogin.txtName){
			System.out.println("�û�����"+userlogin.txtName.getText());
		}else if(ob==userlogin.txtPass){
			System.out.println("���룺"+userlogin.txtPass.getText());
		}
	}
	
}
public class userlogin {
//��Ա����
	Frame app=new Frame("��¼");
	Label lb1Name=new Label("userlogin");	
	static TextField txtName=new TextField();
	Label lb1Pass=new Label("userlogin");
	static TextField txtPass=new TextField();
	//���ù��췽���ѵ��봰���ʼ��
	Button bt=new Button("��¼");
	
	public userlogin(){
		app.setSize(300,150);
		app.setLayout(null);
	    app.addWindowStateListener(new bb());
		//�Է�����������Զ�λ
		lb1Name.setBounds(60, 50, 70, 20);
		txtName.setBounds(135, 50, 100, 20);
		//txtName.addKeyListener(new KeyHander());
		//txtName.addFocusListener(new FocusHander());
		
		lb1Pass.setBounds(60, 90, 70, 20);
		txtPass.setBounds(135, 90, 100, 20);
		//txtName.addKeyListener(new KeyHander);
		//txtName.addFocusListener(new FocusHander());
		bt.setBounds(70, 130, 70, 20);
		txtPass.setEchoChar('*');
		app.add(lb1Name);
		app.add(txtName);
		app.add(lb1Pass);
		app.add(txtPass);
		app.add(bt);
		app.setLocation(200, 100);
		app.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               new userlogin();
	}

}
