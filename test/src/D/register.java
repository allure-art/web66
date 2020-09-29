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
	//成员属性

	TextField name=new TextField();
	Checkbox man=new Checkbox("男");
	Checkbox woman=new Checkbox("女");
	CheckboxGroup sex=new CheckboxGroup();
	TextField age=new TextField("20",40);
	//籍贯
	Choice nativeplace=new Choice();
	//爱好
	Checkbox like1=new Checkbox("读书");
	Checkbox like2=new Checkbox("上网");
	Checkbox like3=new Checkbox("运动");
	//喜欢的网站
	List website=new List(4);
	//确认 取消 退出
	Button btn1=new Button("确认");
	Button btn2=new Button("取消");
	Button btn3=new Button("退出");
	//注册窗体中的文本标签
	Label l=new Label("个人信息调查表");
	Label l1=new Label("姓名");
	Label l2=new Label("年龄");
	Label l3=new Label("籍贯");
	Label l4=new Label("爱好");
	Label l5=new Label("喜欢的网站");
	//构造方法
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
		nativeplace.add("北京");
		nativeplace.add("上海");
		nativeplace.add("天津");
		nativeplace.add("重庆");
		nativeplace.add("广东");
		nativeplace.add("河南");
		nativeplace.setBounds(270, 150, 60, 20);
		l4.setBounds(50, 200, 40, 20);
		like1.setBounds(90, 200, 60, 20);
		like2.setBounds(150, 200, 60, 20);
		like3.setBounds(210, 200, 100, 20);
		website.add("新浪");
		website.add("搜狐");
		website.add("网易");
		website.add("淘宝");
		website.add("赶集网");
		website.add("新华网");
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
		new register("个人信息");
	}

}
