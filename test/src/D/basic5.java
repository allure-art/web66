package D;

public class basic5 {

	 /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[] pp={"aaa","bbb","ccc","eee","ddd"};
    //学习遍历数组--循环输出遍历数组元素
    System.out.println("本次活动的特价商品有：");
    for(int i=0;i<pp.length-1;i++){
    	System.out.println(pp[i]);
    }
    //遍历数组--方法2
    for(String ss:pp){
    	System.out.println(ss);
    }
	}

}
