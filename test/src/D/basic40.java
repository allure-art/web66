package D;

public class basic40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="helloworld";
        int num=str.indexOf('h');
        System.out.println(num);
        num=str.indexOf('e');
        System.out.println(num);
        num=str.indexOf('o');
        System.out.println(num);
        num=str.lastIndexOf("o");
        System.out.println(num);
        String str2=str.substring(5,str.length()-1);
        System.out.println(str2);
        String str3="    hello";
        System.out.println(str3);
        String str4=str3.trim();
        System.out.println(str4);
        System.out.println(str.substring(5,8));
        System.out.println(str.indexOf('.'));
        String str5="abc,def,ghijkl";
        String str6[]=str5.split(".");
        for(String s:str6){
        	System.out.println(s);
        }
	}

}
