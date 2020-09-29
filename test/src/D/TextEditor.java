package D;

import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.Menu; 
public class TextEditor extends Frame{
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
	//菜单构建与处理的成员方法
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
		file.add(file);
		setMenuBar(mb);
	}
	//构造方法
	public TextEditor(String title){
		super(title);
		//设置窗体大小
		this.setSize(400,400);
		menuinit();
		//设置窗体在屏幕居中显示
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new TextEditor("简易文本编辑器");
	}

}
