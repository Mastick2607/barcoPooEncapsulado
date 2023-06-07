package paqueteBarco.Modelo;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;


public class procesoBarco {
	   HashMap<Integer,Barco> mapBarco;
	    ArrayList<Barco> listaBarco;
	public  procesoBarco() {
		mapBarco = new    HashMap<Integer,Barco>();
		listaBarco = new ArrayList<Barco>();
		iniciar();
	}
	
	public void iniciar() {
		
		opciones();
		
	
		
	}
	private void opciones() {
		  int opcion;
	        do {
	            opcion = mostrarMenu();

	            switch (opcion) {
	                case 1:
	                    crearBarco();
	                    break;
	                case 2:
	                    consultarBarco();
	                    break;
	                case 3:
	                    consultarListaBarcos();
	                    break;
	                case 4:
	                    modificarBarco();
	                    break;
	                case 5:
	                    JOptionPane.showMessageDialog(null, "*************Saliendo del sistema***********\n");
	                    break;
	                default:
	                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente nuevamente.");
	            }
	        } while (opcion != 5);
		
	}

	private void modificarBarco() {
	    int codigo = Integer.parseInt( JOptionPane.showInputDialog("Ingrese el codigo del barco a modificar: ")); 
	        if (mapBarco.containsKey(codigo)) {
	        	Barco barcoModificar = mapBarco.get(codigo);
	            barcoModificar.ingresarDatos();
	        } else {
	            JOptionPane.showMessageDialog(null, "No se encontró ningun bARCO  con el codigo ingresado.");
	        }
		
	}

	private void consultarListaBarcos() {
	
		for(Integer codigo : mapBarco.keySet()) {
			  String lista = "Lista de Barcos:\n";
		        for (Barco BarcoLista : listaBarco) {
		            lista += "Codigo: " + BarcoLista.getCodigo() + ", Nombre: " + BarcoLista.getNombre() + "\n";
		            lista +="Tipo: "+BarcoLista.getTipo()+ "Capacidad de carga:"+BarcoLista.getCapacidadCarga()+" Numero de pasajeros: "+BarcoLista.getNumPasajeros();
		        }
		        JOptionPane.showMessageDialog(null, lista);
		}
		
	}

	private void consultarBarco() {
	
	       int codigo = Integer.parseInt( JOptionPane.showInputDialog("Ingrese el codigo del barco a modificar: ")); 
	        if (mapBarco.containsKey(codigo)) {
	        	Barco BarcoConsultado = mapBarco.get(codigo);
	        	BarcoConsultado.imprimirInformacion();
	        } else {
	            JOptionPane.showMessageDialog(null, "No se encontró ningun barco con el codigo ingresado.");
	        }
	}

	private void crearBarco() {
        Barco  barco1 ;
		
    
        
            barco1 = new Barco();
            barco1.ingresarDatos();
            
        	if(mapBarco.containsKey(barco1.getCodigo())) {
        		
        		System.out.print("El Barco ya existe");
        		
        	}
        	
        	else {
				mapBarco.put(barco1.getCodigo(), barco1);
			     listaBarco.add(barco1);				
			}
        	
        	System.out.print(mapBarco);
        
		
	}

	private int mostrarMenu() {
		 String menu = "";
	        menu += "MENU\n";
	        menu += "1. Crear Barco\n";
	        menu += "2. Consultar Barco individual\n";
	        menu += "3. Consultar lista de Barcos\n";
	        menu += "4. Modificar un Barco en especifico\n";
	        menu += "5. Salir\n";
	        menu += "Ingrese una opción:\n ";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

	

	
	

}
