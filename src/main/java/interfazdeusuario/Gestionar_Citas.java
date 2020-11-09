package interfazdeusuario;

import vistas.VistaGestionarCitas;

public class Gestionar_Citas extends VistaGestionarCitas {
	
	 
	Ver_Citas _vc = new Ver_Citas();
	Dar_de_Alta_Cita _da = new Dar_de_Alta_Cita();
	Dar_de_Baja_Cita _db = new Dar_de_Baja_Cita();
	

	public Gestionar_Citas() {
		
		this.getVaadinHorizontalLayout().add(_vc);
		this.getVaadinHorizontalLayout().add(_da);
		this.getVaadinHorizontalLayout().add(_db);
		
	}

	void Inicializar() {
		throw new UnsupportedOperationException();
	}

	void darDeAltaCitas() {
		throw new UnsupportedOperationException();
	}

	void darDeBajaCitas() {
		throw new UnsupportedOperationException();
	}
}