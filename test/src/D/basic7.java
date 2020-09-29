package D;

public class basic7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num[]={33,44,99,66};
       int temp;
     //一轮循环比出一个最大值
       for(int i=0;i<num.length-1;i++){
    	   if(num[i]>num[i+1]){
    		   temp=num[i];
    		   num[i]=num[i+1];
    		   num[i+1]=temp;
    	   }
       }
       //第二伦比出一个次大值
       for(int i=0;i<num.length-2;i++){
    	   if(num[i]>num[i+1]){
    		   temp=num[i];
    		   num[i]=num[i+1];
    		   num[i+1]=temp;
    	   }
       }
       for(int i=0;i<num.length-3;i++){
    	   if(num[i]>num[i+1]){
    		   temp=num[i];
    		   num[i]=num[i+1];
    		   num[i+1]=temp;
    	   }
       }
       for(int i=0;i<num.length-4;i++){
    	   if(num[i]>num[i+1]){
    		   temp=num[i];
    		   num[i]=num[i+1];
    		   num[i+1]=temp;
    	   }
       }
       for(int i:num){
    	   System.out.println(i);
       }
	}

}
