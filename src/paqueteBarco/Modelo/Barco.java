package paqueteBarco.Modelo;

import javax.swing.JOptionPane;

public class Barco {

    private int codigo ;
    private String nombre ;
    private String tipo ;
    private double capacidadCarga ;
    private int numPasajeros ;


    public Barco() {
    	
    	codigo= 0;
    	nombre="pepe";
    	tipo = "yate";
    	capacidadCarga=5000;
    	numPasajeros=3000;
    }   
      public Barco(int codigo,String nombre, String tipo, double capacidadCarga, int numPasajeros) {
          this.codigo = codigo;
         this.nombre=nombre;
          this.tipo =tipo;
          this.capacidadCarga= capacidadCarga;
          this.numPasajeros = numPasajeros;
      }


    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



 public double getCapacidadCarga() {
		return capacidadCarga;
	}
	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	public int getNumPasajeros() {
		return numPasajeros;
	}
	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
public void encenderMotor() {
    	
    	System.out.println("el barco "+nombre+" esta encendido");
    	
    }
 
 public void apagarMotor() {
 	
 	System.out.println("el barco "+nombre+" esta apagado");
 	
 }
    
    public void navegar() {
    	
    	System.out.println("el barco "+nombre+" esta navegando");
    	
    }
    
  public void anclar() {
    	
    	System.out.println("el barco "+nombre+" esta anclado");
    	
    }
    
  public void transportarPasajeros() {
  	
  	System.out.println("el barco "+nombre+" esta transportando pasajeros");
  	
  }
  
  
	public void imprimirInformacion() {
		 
		String datos="********DATOS "+nombre+"**********\n";
		datos+=" Codigo del barco: "+codigo+" Nombre: "+nombre+", Tipo: "+tipo+"\n";
		datos+="capacidad de carga: "+capacidadCarga+", Numero de pasajeros: "+numPasajeros+"\n";

		  JOptionPane.showMessageDialog(null,datos);
		 
		
	}
	
	public void ingresarDatos() {
		codigo =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo"));
	    nombre =JOptionPane.showInputDialog("Ingrese el nombre del barco");
	    tipo =JOptionPane.showInputDialog("Ingrese el tipo de barco");
	    capacidadCarga =Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga que tiene el barco")) ;
    	numPasajeros=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de pasajeros que puede admitir el barco"));
	}

}