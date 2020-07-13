package casos_3;
import java.util.Scanner;
public class caso04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=0;
		int i=1;
		int mayor=0;
		while (i<=4){
			System.out.println("ingrese numero "+i+":");
			n =sc.nextInt();
			if (n>mayor)
				mayor=n;
			i++;
		
	}
System.out.println("el mayor de todos los numero es: "+mayor);
}
}