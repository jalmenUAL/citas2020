package interfazdeusuario;

import basededatos.Cita;
import basededatos.Cliente;
import bds.Bd_Principal;
import bds.iAdministrador;
import vistas.VistaVercitasitem;

public class Ver_Citas_item extends VistaVercitasitem {
	 
	
	Ver_Informacion_de_Cliente vinfo = new Ver_Informacion_de_Cliente();
	iAdministrador adm = new Bd_Principal();
	Cita cita;
	
	public Ver_Citas_item(Cita c){
		cita = c;
	}
	
	public void Ver_Informacion_Cliente() {
		Integer id = cita.getID();
		Cliente cli = adm.Cargar_Informacion_Cliente(id);
		vinfo.getNombre().setValue(cli.getNombre());
		vinfo.getDireccion().setValue(cli.getDireccion());
		vinfo.getTelefono().setValue(cli.getTelefono());
	}
}