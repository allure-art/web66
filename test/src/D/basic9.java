package D;

public class basic9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* int a=170;
        //仅仅赋值
        int b=a;
        System.out.println(b);
        b=180;
        System.out.println(a);
        System.out.println(b);
        int infozhang[]={170,60};
        //把infozhang的地址给infoli 相当于一个地址空间有两个名字
        int infoli[]=infozhang;
        System.out.println("修改之前张浩的身高:"+infozhang[0]);
        infoli[0]=180;
        infoli[1]=70;
        System.out.println("修改之后张浩的身高："+infozhang[0]);
        System.out.println("李明的身高："+infoli[0]);*/
        int infozhang[]={170,60};
      //把infozhang的地址给infoli   相当于一个地址空间有两个名字
      		int infoli[]=new int[2];
      		
      		infoli[0]=infozhang[0];
      		infoli[1]=infozhang[1];
      		System.out.println("修改之前张浩的身高："+infozhang[0]);
      		System.out.println("修改之前李明的身高："+infoli[0]);
      		infoli[0]=180;
      		infoli[1]=70;
      		System.out.println("修改之后张浩的身高："+infozhang[0]);
      		System.out.println("修改之后李明的身高："+infoli[0]);
        
        
	}

}
