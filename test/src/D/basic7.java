package D;

public class basic7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num[]={33,44,99,66};
       int temp;
     //һ��ѭ���ȳ�һ�����ֵ
       for(int i=0;i<num.length-1;i++){
    	   if(num[i]>num[i+1]){
    		   temp=num[i];
    		   num[i]=num[i+1];
    		   num[i+1]=temp;
    	   }
       }
       //�ڶ��ױȳ�һ���δ�ֵ
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
