package D;

import java.util.Scanner;

public class demo28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("我行我素购物系统>商品查询");
        System.out.println("********");
        System.out.println("编号：\t1\t2\t3");
        System.out.println("商品名：\tT恤\t网球鞋\t3网球拍");
        System.out.println("********");
        System.out.println("根据商品编号查询商品价格");
        //死循环---通过break语句可以结束
        String pid;
        String aa;
        while(true){
        	System.out.println("请输入商品编号：");
        	pid=input.next();
        	if(pid.equals("1"))System.out.println("T恤：\t￥567元");
        	else if(pid.equals("2"))System.out.println("网球鞋：\t￥247元");
        	else if(pid.equals("3"))System.out.println("网球拍：\t￥345元");
        	else System.out.println("商品不存在");
        	System.out.println("是否继续查询");
        	aa=input.next();
        	//使用break 语句退出循环
        	if(aa.equals("n")){
        		break;
        	}
        }
        System.out.println("查询结束");
	}

}
