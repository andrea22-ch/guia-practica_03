package casos_3;
import java.util.Scanner;
public class caso08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ingrese un numero:");
		int n=sc.nextInt();
		System.out.println("tabla de multiplicar hasta el 15"+n);

		for(int i=(int)1;i<=15;i++)
			System.out.println(n+" * "+i+" = "+(n*i));

	}

}
