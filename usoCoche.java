package poo;

import javax.swing.JOptionPane;

public class usoCoche{
   public static void main(String[] args){
      coche renault = new coche();//Esto es un ejemplar de clase coche
      
      System.out.println(renault.dimeDatosGene()); // Por medio del metodo getter ".dimeDatosGene" puedo obtener los atributos de la clase coche para mostrarlos en pantalla
      
      renault.estableceColor(JOptionPane.showInputDialog("Introduce color\n\n")); //En este ejemlpo solicitamos datos al usuario el cual los introduce por medio de una ventana flotante
      System.out.println(renault.dimeColor()); //Y guardamos ese valor en nuestro metodo getter ".dimeColor" 
      
      renault.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?\n\n" + "Escriba si o no por favor")); //Para esta línea es la misma dinamica
      System.out.println(renault.dimeAsientos());
      
      renault.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?\n\n" + "Escriba si o no por favor"));
      System.out.println(renault.dimeClimatizador());
      
      System.out.println(renault.dimePesoCoche());//Aquí imprimimos el peso del coche obteniendo el dato del mismo momdo con un getter
      
      System.out.println("El precio final del coche es: $" + renault.precioCoche()); //Pasa lo mismo con las demas líneas usamos los metodos correspondientes para traer o modificar datos
      
   }
}