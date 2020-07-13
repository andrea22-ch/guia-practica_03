package casos_3;
import java.util.Scanner;
public class caso_09 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	/* myrprome = mayor promedio
	 * mnrprome = menor promedio 
	 * scert = sin certificado
	 * crt = con certificado*/
	int c=0, n1,n2,n3,crt=0,as,myrprome=0,mnrprome=100,promedio,scert=0;
	String nom="",cont="S",st="",nompromenor="",nompromayr="";
	
	while(cont.equals("S")|| cont.equals("s")){c++;
		System.out.println("REGISTRO:"+c);
		System.out.println("------------------------");
		System.out.println("Nombre del alumno: ");
		nom= sc.nextLine();
		System.out.println("Nota 1 : ");
		n1=sc.nextInt();
		System.out.println("Nota 2 : ");
		n2=sc.nextInt();
		System.out.println("Nota 3 : ");
		n3=sc.nextInt();
		System.out.println("Asistencia[1-12]: ");
		 as=sc.nextInt();
		System.out.println("------------------------");
		System.out.println("-----RESULTADOS----------");
		System.out.println("------------------------");
		promedio=(int)(0.2*n1+0.3*n2+0.5*n3);
	if(promedio>myrprome) {
		myrprome = promedio;
		nompromayr= nom;}		
	
	if(promedio<mnrprome) {
		mnrprome = promedio;
		nompromenor = nom;}
	
		float asis=(float)(as*100)/12;
		System.out.println("Promedio: "+promedio);
		System.out.println("Asistencia: "+asis+"%");
		if (promedio>12 && asis>69){
			st="Obtiene certificado";  crt++;
		}else{
			st="Sin certificado";     scert++;}
		System.out.println("Estado : "+st);
	
		sc.nextLine();
		System.out.println("Desea continuar?<S/N>:");
		cont=sc.nextLine();
	}
		System.out.println("RESUMEN:");
	   System.out.println("--------------------------");
	    System.out.println("Alumnos registrados: "+c);
		System.out.println("Mayor promedio: "+ myrprome+" ,pertenece a : "+nompromayr);
	  System.out.println("Menor promedio :  "+mnrprome+" ,pertenece a: "+nompromenor);
      System.out.println("Alumnos con certificado "+crt);
      System.out.println("Alumnos sin certificado "+scert);
	}
}


