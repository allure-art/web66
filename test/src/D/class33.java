package D;
//定义接口
interface Memory{
	//只能定义抽象方法。而且没有abstract修饰
	void getName();
	void getMemoryType();
}
//实现接口，通过类实现接口
class xxx implements Memory{

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("现代");
	}

	@Override
	public void getMemoryType() {
		// TODO Auto-generated method stub
		System.out.println("DDR2");
	}
	
}
public class class33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //声明接口对象，接口不能实例化，但是可以将接口实现类的对象赋值给接口对象
		Memory m=new xxx();
		m.getName();
		m.getMemoryType();
	}

}
