package casos_3;
import java.util.Scanner;
public class caso02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
System.out.println("ingrese numero: ");
int n=sc.nextInt();
int c=1;
int s=0;
while (c<=n){
	s+=c;
	c++;
	}
System.out.println("sumatoria de "+n+" es "+s);
}
}