package casos_3;
import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=1,suma=0;
		
		System.out.print("ingrese numero");
		int n=sc.nextInt();
		while (c<=n){
		suma +=c;//suma=suma+1
	}
		
System.out.println("la sumatoria de "+n+"es: "+suma);
}
}