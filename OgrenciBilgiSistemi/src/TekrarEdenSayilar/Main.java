package TekrarEdenSayilar;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	int[] list= {2,7,6,12,52,41,68,32,32,2,6};
	int[] duplicate=new int[list.length];
	int startIndex=0;
	for(int i=0;i<list.length;i++) {
		for(int j=0;j<list.length;j++) {
			if(i!=j && list[i]==list[j] && list[i]%2==0) {
				duplicate[startIndex++]=list[i];
			}
		}
		
	}
	System.out.println(Arrays.toString(duplicate));
	}

}
