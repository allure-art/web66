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
	//成员属性
	//1.菜单相关属性
	MenuBar mb=new MenuBar();
	Menu file;
	MenuItem nw;
	MenuItem op;
	MenuItem cl; 
	MenuItem sf;
	MenuItem ex;
	
	//2.文本编辑区域
	TextArea tx;
	//菜单构建与处理成员方法
	void menuinit(){
    mb=new MenuBar();
    file=new Menu("文件");
    nw=new MenuItem("新建文件");
    op=new MenuItem("打开文件");
    cl=new MenuItem("关闭文件");
    sf=new MenuItem("保存文件");
    ex=new MenuItem("退       出");
    file.add(nw);
    file.add(op);
    file.add(cl);
    file.add(sf);
    file.add(ex);
    mb.add(file); 
    setMenuBar(mb);
    //为组件增加监听器

    nw.addActionListener(this);
    op.addActionListener(this);
    cl.addActionListener(this);
    sf.addActionListener(this);
    ex.addActionListener(this);
	}
	//构造方法
	public TestEditor(String title){
		super(title);
		//设置窗体大小
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
     new TestEditor("简易文本编辑器");
	}
    public void actionPerformed(ActionEvent e){
    	Object ob=e.getSource();
    	JFileChooser f=new JFileChooser();
    	if((ob==nw)||(ob==cl)){
    		tx.setText(" ");
    	}else if(ob==op){
    		f.showSaveDialog(this);
    		//读取文件的内容--输入流
    		try{
    			StringBuffer s=new StringBuffer();
    			//字符输入流
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
