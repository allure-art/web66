package D;

public class basic12 {
    static int[] max_min_avg(int b[]){
    	int res[]=new int[3];
    	int max=b[0];
    	int min=b[0];
    	int sum=0;
    	for(int i=0;i<b.length;i++){
    		if(max<b[i]){
    			max=b[i];
    		}
    		if(min>b[i]){
    			min=b[i];
    		}
    		sum+=b[i];
    		b[i]+=5;
    	}
    	res[0]=max;
    	res[1]=min;
    	res[2]=sum/b.length;
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int score[]={60,70,80,90,100};
       //��������Ϊ�����Ĳ������Ǵ���ַ
       int c1[]=max_min_avg(score);
       System.out.println("c1�����߷�Ϊ��"+c1[0]+"��c1�����ͷ�Ϊ��"+c1[1]+"��ƽ���֣�"+c1[2]);
    	  System.out.println("1��ĳɼ����£�");
    	  for(int n:score){
    		  System.out.println(n+" ");
       }
       
       
       
	
	}
}
