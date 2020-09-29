import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;


public class button {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Frame f=new Frame("¼ÆËãÆ÷");
		    f.setSize(300, 300);
		    Panel p=new Panel();
		    GridLayout g1=new GridLayout(4,4);	
		    Button b1=new Button("1");
		    Button b2=new Button("2");
		    Button b3=new Button("3");
		    Button jia=new Button("+");
		    
		    Button b4=new Button("4");
		    Button b5=new Button("5");
		    Button b6=new Button("6");
		    Button jian=new Button("-");
		    Button b7=new Button("7");
		    Button b8=new Button("8");
		    Button b9=new Button("9");
		    Button den=new Button("=");
		    Button cheng=new Button("*");
		    Button b0=new Button("0");
		    Button dian=new Button(".");
		    Button chu=new Button("/");
		    p.setLayout(g1);
		    p.add(b1);
		    p.add(b2);
		    p.add(b3);
		    p.add(jia);
		    p.add(b4);
		    p.add(b5);
		    p.add(b6);
		    p.add(jian);
		    p.add(b7);
		    p.add(b8);
		    p.add(b9);
		    p.add(cheng);
		    p.add(b0);
		    p.add(dian);
		    p.add(den);
		    p.add(chu);
		    f.add(p);
		    f.setLocationRelativeTo(null);
		    f.setVisible(true);
	}

}
