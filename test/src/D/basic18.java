package D;

import java.util.Scanner;

public class basic18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        String user=null,user1=null,psw=null,psw1=null;
        int i=1;
        int castNo=0;
        while(true){
        	System.out.println("******欢迎进入奖客富翁系统******");
        	System.out.println("\t1.注册");
        	System.out.println("\t2.注册");
        	System.out.println("\t3.抽奖");
        	System.out.println("****************");
        	System.out.println("请选择菜单：");
        	int num=input.nextInt();
        	switch(num){
        	case 1:
        		System.out.println("[奖客富翁系统>注册]");
        	    System.out.println("请填写个人信息");
        	    System.out.println("用户名：");
        	    user=input.next();
        	    System.out.println("密码：");
        	    psw=input.next();
        	    castNo=(int)(Math.random()*10000);
        	    System.out.println("注册成功，请记好用户名和密码");
        	    System.out.println("用户名\t密码\t会员号");
        	    System.out.println(user+"\t"+psw+"\t"+castNo);
        	    break;
        	    case 2:System.out.println("[奖客富翁系统>登录]");
        	    int i1=1;
    			if(user!=null&&psw!=null){
    				while(true){
    					System.out.print("用户名：");
    					user1 = input.next();
    					System.out.print("密码：");
    					psw1 = input.next();
    					if(user1.equals(user)&&psw1.equals(psw)){
    						System.out.println("欢迎您："+user1);
    						break;
    					}else{
    						
    						System.out.println("用户名或密码有误");
    					}
    					
    					i1++;
    					if(i1==3){
    						break;
    					}
    				}
    			}else{
    				System.out.println("请先注册！");
    			}
        	    break;
			case 3:System.out.println();
        	    int xy[]=new int[5];
        	    for(int j=0;j<xy.length;j++){
        	    	xy[j]=(int)(Math.random()*10000);
        	    }
        	    System.out.println("今日幸运数：");
        	    for(int n:xy){
        	    	System.out.println(n+" ");
        	    }
        	    System.out.println();
        	    for(int j=0;j<xy.length;j++){
        	    	if(castNo!=0){
        	    		if(xy[j]==castNo){
        	    			System.out.println("你是本日幸运会员！");
        	    			break;
        	    		}
        	    	}
        	    	if(j==4){
        	    		System.out.println("你不是今日幸运会员！");
        	    	}
        	    }
        	    break;
        	    default: System.out.println("输入有误！");
        	}
        	System.out.println("继续吗？(y/n)");
        	String a=input.next();
        	if(a.equals("n")){
        		System.out.println("系统退出！");
        		break;
        	}
        }
	}

}
