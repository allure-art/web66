package shujujiegou;

public class basic97 {
		    void merge(int[] a,int[] b) {
		        int  i,j,k;
		        i=0;j=0;k=0;
		        int alength=a.length;
		        int blength=b.length;
		        int clength=alength+blength;
		        int[] c=new int[clength];
		        while(i<alength && j<blength)
		        if(a[i]<b[j])
		            c[k++]=a[i++];
		        else
		            c[k++]=b[j++];
		        while(i<alength)
		            c[k++]=a[i++];
		        while(j<blength)
		            c[k++]=b[j++];
		        System.out.println();
		        System.out.print("排序好的是：");
		        for(int l=0;l<clength;l++)
		            System.out.print(" "+c[l]);
		    }
		    public static void main(String[] args) {
				// TODO Auto-generated method stub
		        basic97 a1=new basic97();
		        int[] a={2,5,7};
		        int[] b={3,4,8,9};
		        System.out.print("a数组：");
		        for(int i=0;i<a.length;i++)
		            System.out.print(" "+a[i]);
		        System.out.println();
		        System.out.print("b数组：");
		        for(int j=0;j<b.length;j++)
		            System.out.print(" "+b[j]);
		        a1.merge(a,b);
		    }

}
