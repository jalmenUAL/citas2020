package interfazdeusuario;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import vistas.VistaGestionarCitas;

public class Gestionar_Citas extends VistaGestionarCitas {
	
	 
	Ver_Todas_las_Citas _vc = new Ver_Todas_las_Citas();
	Dar_de_Alta_Cita _da = new Dar_de_Alta_Cita();
	Dar_de_Baja_Cita _db = new Dar_de_Baja_Cita();
	

	public Gestionar_Citas() {
		
		Inicializar();
		
	    _da.getDarDeAta().addClickListener(new ComponentEventListener() {
			 

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				darDeAltaCitas();
			}
		});
		 
	    _db.getDarBaja().addClickListener(new ComponentEventListener() {
			 

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				darDeBajaCitas();
			}
		});
		
	}

	void Inicializar() {
		this.getVaadinHorizontalLayout().add(_vc);
		this.getVaadinHorizontalLayout().add(_da);
		this.getVaadinHorizontalLayout().add(_db);
		 
	}

	void darDeAltaCitas() {
		 
	}

	void darDeBajaCitas() {
		 
	}
}