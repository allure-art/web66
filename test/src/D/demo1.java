package D;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;



public abstract class demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    JFrame f1=new JFrame();
    f1.setLayout(new FlowLayout());
    JButton b1=new JButton("1");
    JButton b2=new JButton("2");
    JTextField jj=new JTextField(200);
    f1.add(jj);
    f1.add(jj);
    f1.add(b2);
    f1.setSize(300,200);
    f1.setVisible(true);
	}

}
