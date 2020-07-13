package casos_3;
import java.util.Scanner;
public class caso6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0,aptos=0,edad=0;
		String nombre ="", continuar="S",estado=" ";
		
		while (continuar.equals("S")|| continuar.equals("S")){
			c++;
			System.out.println("REGISTRO:"+c);
			System.out.println("------------------------");
			
			System.out.println("nombre: ");
			nombre= sc.nextLine();
			
			System.out.println("edad: ");
			edad=sc.nextInt();
		if (edad>=18){
			estado="Apto para votar";
			aptos++;
		}
		else {
			estado="Menor de edad";
		}
		System.out.println("Estado del participante:"+ estado);
		//reiniciar el objeto sc
		sc.nextLine();
		
		System.out.println("Desea continuar?<S/N>:");
		continuar=sc.nextLine();
		}
		 System.out.println("RESUMEN:");
		    System.out.println("--------------------------");
		    System.out.println("PARTICIPANTE REGISTRADOS: "+ c);
		    System.out.println("APTOS PARA VOTAR:  "+aptos);
	}

}
