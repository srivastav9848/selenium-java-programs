package arrays;

public class smalletinarray {
public static void main(String[] args) {
	int num[]= {20,10,5,50,48,9};
	int temp=0;
	for(int i=0;i<num.length;i++)
	{
		for(int j=i+1;j<num.length;j++) {
			if(num[i]>num[j]) {
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
				
			}
		}
	}
	System.out.println("smallest is :"+num[0]);
	System.out.println("highest val is :"+num[num.length-1]);
	for(int jk:num) {
		System.out.print(jk+" 	");
	}
}

}
