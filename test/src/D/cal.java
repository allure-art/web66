package D;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class cal{
	public static void main(String[] args){
		Frame user=new Frame("����");
		user.setBounds(400, 400, 300, 150);
        Label label1=new Label("�û���");
        Label label2=new Label("����");
        JTextField textField=new JTextField(20);
        JPasswordField passwordField=new JPasswordField(20);
        user.setLayout(new FlowLayout(FlowLayout.CENTER));
        Button button=new Button("��¼");
        user.add(label1);
        user.add(textField);
        user.add(label2);
        user.add(passwordField);
        user.add(button);
        
        user.setVisible(true);
	}
}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
