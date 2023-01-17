package poo;
import java.util.Date;
import java.util.GregorianCalendar;

public class usoEmpleado{
   public static void main(String[] args){
      /*empleado empleado1 = new empleado("Patrick Gonzalez", 85000, 2010, 12, 30); //Esto es un ejemplar de clase u objeto
                                                                                  //los parametros tienen relacion con los mismos del constructror respetando
                                                                                  //el orden y tipo de dato
      empleado empleado2 = new empleado("Ana Lopez", 105000, 2015, 4, 12);
      empleado empleado3 = new empleado("Maria Martin", 25000, 1999, 6, 4);
      empleado1.subeSueldo(5);
      empleado1.subeSueldo(5);
      empleado1.subeSueldo(5);
      
      System.out.println("Nombre: " + empleado1.dameNombre() + "\nSueldo: " + empleado1.dameSueldo() + "\nFecha de alta: " + empleado1.dameFechaAlta() + "\n");
      System.out.println("Nombre: " + empleado2.dameNombre() + "\nSueldo: " + empleado2.dameSueldo() + "\nFecha de alta: " + empleado2.dameFechaAlta() + "\n");
      System.out.println("Nombre: " + empleado3.dameNombre() + "\nSueldo: " + empleado3.dameSueldo() + "\nFecha de alta: " + empleado3.dameFechaAlta());*/
      
      /*Este comentario es una forma de construir el metodo pero como es mucho codigo vamos a hacerlo con arreglos y ciclos for para que no tengamos que escribir
      tanto codigo*/
      
      empleado[] misEmpleados = new empleado[4]; //
      misEmpleados[0] = new empleado("Paco Gomez", 85000, 1990, 12, 17);
      misEmpleados[1] = new empleado("Ana Lopez", 105000, 2015, 04, 12);
      misEmpleados[2] = new empleado("Maria Martin", 25000, 1999, 06, 04);
      misEmpleados[3] = new empleado("Anotnio Fernandez");
      
      /*for(int i=0; i<misEmpleados.length ;i++){ Esto es un bucle for tradicional 
         misEmpleados[i].subeSueldo(5);
         
      }*/
      
      for(empleado e: misEmpleados){ //Esto es un bucle llamado for each donde llamamos al objeto empleado y le asignamos una variable como la letra e colocamos
                                     //dos puntos y enseguido llamamos al ejemplar de nuestra clase que es misEmpleados
         e.subeSueldo(5);
         
      }
      
      /*for(int i=0; i<misEmpleados.length ;i++){
         System.out.println("Nombre: " + misEmpleados[i].dameNombre() + "\nSueldo: $" + misEmpleados[i].dameSueldo() + "\nFecha de alta: " + 
         misEmpleados[i].dameFechaAlta() + "\n");
         
      }*/
      
      for(empleado e: misEmpleados){
         System.out.println("Nombre: " + e.dameNombre() + "\nSueldo: $" + e.dameSueldo() + "\nFecha de alta: " + 
         e.dameFechaAlta() + "\n");
         
      }
      
   }
}

class empleado{ //Esto es un objeto 
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	   
	public empleado(String nom, double sue, int anio, int mes, int dia){//Esto es un constructor del objeto empleado
      nombre = nom;
      sueldo = sue;
      GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia); //Esto es un ejemplar de la clase Grgorian calendar la cual tenemos que importar la librería porque no pertenece a la clase .lang
      altaContrato = calendario.getTime(); //Aquí usamos el metodo getTime de la clase gregorian para poder indicar la fecha en un formato en especifico 
      
	}
   
	public empleado(String nom){//Esto es una sobrecarga de constructores y para este ejemplo solo usaremos un parametro y dentro del mismo llamamos a los atributos del la super clase o clase principal
      this(nom, 30000, 2000, 01, 01);
      
   
	}
   
	public String dameNombre(){ //Esto es un getter y solo asigna un valor
      return nombre;
      
   	}
   
   public double dameSueldo() {//getter
      return sueldo;
      
   	}
   
   	public Date dameFechaAlta(){ //getter
      return altaContrato;
   	}
   
   	public void subeSueldo(double porcentaje){ // Esto es un setter y este metodo se encarga de modificar los datos
      double aumento = sueldo*porcentaje/100;
      sueldo += aumento;
      
   	}
   
}