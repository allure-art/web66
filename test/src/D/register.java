package D;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;

public class register extends Frame{
	//��Ա����

	TextField name=new TextField();
	Checkbox man=new Checkbox("��");
	Checkbox woman=new Checkbox("Ů");
	CheckboxGroup sex=new CheckboxGroup();
	TextField age=new TextField("20",40);
	//����
	Choice nativeplace=new Choice();
	//����
	Checkbox like1=new Checkbox("����");
	Checkbox like2=new Checkbox("����");
	Checkbox like3=new Checkbox("�˶�");
	//ϲ������վ
	List website=new List(4);
	//ȷ�� ȡ�� �˳�
	Button btn1=new Button("ȷ��");
	Button btn2=new Button("ȡ��");
	Button btn3=new Button("�˳�");
	//ע�ᴰ���е��ı���ǩ
	Label l=new Label("������Ϣ�����");
	Label l1=new Label("����");
	Label l2=new Label("����");
	Label l3=new Label("����");
	Label l4=new Label("����");
	Label l5=new Label("ϲ������վ");
	//���췽��
	public register(String title){
		super(title);
		this.setSize(400, 400);
		this.setVisible(true);
		this.setLayout(null);
		l.setBounds(50, 50, 100, 20);
		l1.setBounds(50, 100, 40, 20);
		name.setBounds(90, 100, 100, 20);
		//l2.setBounds(230, 100, 40, 20);
		//man.setCheckboxGroup(sex);
		//woman.setCheckboxGroup(sex);
		////sex.setSelectedCheckbox(man);
		//man.setBounds(270, 150, 60, 20);
		//woman.setBounds(330, 100, 60, 20);
		l2.setBounds(50, 150, 40, 20);
		age.setBounds(90, 150, 50, 20);
		l3.setBounds(230, 150, 40, 20);
		nativeplace.add("����");
		nativeplace.add("�Ϻ�");
		nativeplace.add("���");
		nativeplace.add("����");
		nativeplace.add("�㶫");
		nativeplace.add("����");
		nativeplace.setBounds(270, 150, 60, 20);
		l4.setBounds(50, 200, 40, 20);
		like1.setBounds(90, 200, 60, 20);
		like2.setBounds(150, 200, 60, 20);
		like3.setBounds(210, 200, 100, 20);
		website.add("����");
		website.add("�Ѻ�");
		website.add("����");
		website.add("�Ա�");
		website.add("�ϼ���");
		website.add("�»���");
		l5.setBounds(50, 250, 80, 20);
		website.setBounds(130, 250, 100, 60);
		btn1.setBounds(110, 330, 50, 20);
		btn2.setBounds(180, 330, 50, 20);
		btn3.setBounds(250, 330, 50, 20);
		this.add(l);
		this.add(l1);
		this.add(name);
		this.add(l2);
		this.add(age);
		this.add(l3);
		this.add(nativeplace);
		this.add(l4);
		this.add(like1);
		this.add(like2);
		this.add(like3);
		this.add(l5);
		this.add(website);
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		setLocationRelativeTo(null);
		btn1.addActionListener((ActionListener) this);
		btn2.addActionListener((ActionListener) this);
		btn3.addActionListener((ActionListener) this);
		age.addKeyListener((KeyListener) this);
		age.addFocusListener((FocusListener) this);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new register("������Ϣ");
	}

}
