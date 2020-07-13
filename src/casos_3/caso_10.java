package casos_3;
import java.util.Scanner;
public class caso_10{
public static void main(String[] args) {
	/* -hrs= horas trabajas
	 * -th =  tarifa horaria
	 * -bnf= bonificacion
	 * */
	Scanner sc=new Scanner(System.in);
	int c=0,hrs=0, th=0,mt,cantidadalcanzados=0,mayormt=0;
 float sb=0,bnf=0,desc=0,sneto=0,alcanzado=0,suelmayor=0,suelmenor=999999999;
	String emple="",cont="SI",nomenor="",nomayor="",nbmayortandanza="";
	
	while(cont.equals("SI")|| cont.equals("si")){c++;
		System.out.println("REGISTRO DE EMPLEADOS:"+ c);
		System.out.println("------------------------");
		System.out.println("EMPLEADO: ");
		emple= sc.nextLine();
		System.out.println("HORAS TRABAJADAS: ");
		hrs=sc.nextInt();
		System.out.println("TARIFA POR HORA : ");
		th=sc.nextInt();
		System.out.println("MINUTOS DE TADANZA : ");
		mt=sc.nextInt();
		
		System.out.println("------------------------");
		System.out.println("-----RESULTADOS----------");
		System.out.println("------------------------");
		
	    sb=hrs*th;
		
		if (hrs>61){bnf=0;}
		if (hrs<61 && hrs>50) {bnf=(float)0.02*sb;}
		if(hrs>60 && hrs<71)  {bnf=(float)0.08*sb;}
		if (hrs>70 && hrs<81) {bnf=(float)0.13*sb;} 
		if (hrs>80)           {bnf=(float)0.15*hrs; }
		
		System.out.println("SUELDO BRUTO: "+sb);
		
		System.out.println("BONIFICACION : "+bnf);
		if (mt<16)           { desc=0;}
		if (mt>15 && mt<31)  {desc=(float)0.003*sb*mt;}
		if(mt>30)            {desc=(float)0.005*sb*mt;}
		
		System.out.println("DESCUENTO: "+desc);
		
	sneto=(sb+bnf)-desc  ;
	if (suelmayor<sneto)     {suelmayor=sneto ; nomayor=emple; } 
	if (suelmenor>sneto)     {suelmenor=sneto; nomenor=emple;} 
	
	alcanzado = hrs*100/80;
	if(alcanzado>90){cantidadalcanzados++;}
	System.out.println("SUELDO NETO: "+sneto);
	System.out.println("% Alcanzado: "+alcanzado+"%");
	if (mayormt<mt){mayormt=mt ; nbmayortandanza=emple;}
	
	
		
		sc.nextLine();
		System.out.println("NUEVO EMPLEADO?<S/N>:");
		cont=sc.nextLine(); }
	
		System.out.println("RESUMEN:");
	   System.out.println("--------------------------");
	    System.out.println("NUMEROS DE EMPLEADOS: "+c);
	    System.out.println("SUELDO NETO MAYOR: "+suelmayor+", PERTENECE A: "+nomayor);
	    System.out.println("SUELDO NETO MENOR: "+suelmenor+", PERTENECE A: "+nomenor);
	    System.out.println("EMPLEADO CON LA MAYOR CANTIDAD MINUTO DE TARDANZA: "+nbmayortandanza+"("+mayormt+"')");
	    System.out.println("CANTIDAD DE EMPLEADOS CON MAS DEL 90% DE LA META: "+cantidadalcanzados);
	}

}
