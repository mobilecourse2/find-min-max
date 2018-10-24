public class minmax{
public static void main(String[] args){
	
	int array[]={1,2,3,4,5};
	int max=array[0];
	int min=array[0];
	for(int i=0;i<array.length;i++){
		
		if(max<array[i]){
			max=array[i];
		}
		if(min>array[i]){
			min=array[i];
		}
		
	
	}
	System.out.println("Max is = " +max);
	System.out.println("Min is = " +min);
	
	
}
}