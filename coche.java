package poo;
 
public class coche{ //Esto es una clase con el modificar de acceso public para que otra clase que no pertenezca a esta pueda accdeder a  la misma
   private int ruedas; //A partir de aquí le damos atributos a nuestra clase u objeto
   private int largo;
   private int ancho;
   private int pesoPlataforma; //Cada uno de ellos tiene el modificar de acceso private para que éste no se pueda modificar sino desde los metodos que vamos a construir
   private String color;
   private int pesoFinal;
   private boolean asientosCuero, climatizador;
   
   public coche(){//Esto es un metodo constructor y tiene el mismo nombre de la clase con el modificador public para que se pueda acceder desde cualquie
                  //clase a el, este metodo lo que hace es establecer un estado inicial para el objeto coche donde los parametros son por default y lo construimos dentro del mismo
      ruedas = 4;
      largo = 2000;
      ancho = 6000;
      pesoPlataforma = 500;
      
   }
   
   public String dimeDatosGene(){//Metodo Getter: asigna un valor 
      return "La plataforma del vehiculo tiene: " + ruedas + " ruedas" + 
      ". Mide " + largo/1000 + " metros con un ancho de " + ancho + 
      " cm y un peso de plataforma de " + pesoPlataforma + " kg";
   }
   
   public void estableceColor(String colorCoche){//Metodo Setter: modifica el valor
      color = colorCoche;
   }
   
   public String dimeColor(){//getter
      return "El color de tu coche es: " + color;
   }
   
   public void configuraAsientos(String asientosCuero){//Esto es un Setter
      //this.asientosCuero = asientosCuero;//El this hace referencia a la clase si el parametro coincide con la misma
      
      if(asientosCuero.equalsIgnoreCase("si")){
         this.asientosCuero = true;
      }else{
         this.asientosCuero = false;
      }
   }
   
   public String dimeAsientos(){//Esto es un getter
	   
      if(asientosCuero == true){
         return "El coche tiene asientos de cuero";
      }else{
         return "El coche tiene asientos de serie";
      }
   }
   
   public void configuraClimatizador(String climatizador){//Esto es un Setter
      
      if(climatizador.equalsIgnoreCase("si")){
         this.climatizador = true;
      }else{
         this.climatizador = false;
      }
   }
   
   public String dimeClimatizador(){//Esto es un Getter
      
      if(climatizador == true){
         return "El choche incorpora climatizador";
      }else{
         return "El coche lleva aire acondicionado";         
      }
   }
   
   public String dimePesoCoche(){//Esto es un Getter + Setter
      int pesoCarroceria = 500;
      pesoFinal = pesoPlataforma + pesoCarroceria;
      
      if(asientosCuero == true){
         pesoFinal = pesoFinal + 50;
      }
      if(climatizador == true){
         pesoFinal = pesoFinal + 20;
      }
      
      return "El peso del coche es " + pesoFinal + " kg";
   }
   
   public int precioCoche(){
      int precioFinal = 10000;
      
      if(asientosCuero == true){
         precioFinal += 2000;
      }
      if(climatizador == true){
         precioFinal += 1500;
      }
      
      return precioFinal;
   }
}