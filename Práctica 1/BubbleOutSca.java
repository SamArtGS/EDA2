import java.util.Scanner;
public class Ejemplo2{
	public static void main(String[] args) {
		int i=0,j=0,tmp=0;
		int arreglo[]={4,5,11,3,2,9,1,6,2};
		int n=arreglo.length;
		for(i=1;i<n-1;i++){
			for(j=0;j<n-1;j++){
				if(arreglo[j]>arreglo[j+1]){
					tmp=arreglo[j];
					arreglo[j]=arreglo[j+1];
					arreglo[j+1]=tmp;
				}
				}
			}
		for(int temp:arreglo){
			System.out.print(temp+" ");
		}
		System.out.println();
		}
}