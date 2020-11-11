package interfazdeusuario;

import java.util.Optional;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;

import basededatos.Cita_Activa;
import bds.Bd_Principal;
import bds.iAdministrador;
 

 

public class Dar_de_Baja_Cita extends Ver_Citas {
	
	iAdministrador adm = new Bd_Principal();

	public Dar_de_Baja_Cita() {
		 
		Inicializar();
		this.getDarBajaACita().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				darDeBajaCita();
				
			}
		});
		
		
	}

	void Inicializar() {
		Cargar_Citas();
		this.getPosponer().setVisible(false);
		this.getRealizar().setVisible(false);
		this.getCambiarFecha().setVisible(false);
		this.getNuevaFecha().setVisible(false);
		this.getDarBajaACita().setVisible(true);
		
	}

	void darDeBajaCita() {
		if (this.getTablapendientes().getSelectedItems().size() > 0) {

			Cita_Activa cita = (Cita_Activa) this.getTablapendientes().asSingleSelect().getValue();
			 
				Integer id = cita.getID();

				adm.Baja_Cita_Activa(id);
			 

		} else {
			Notification.show("Seleccione una cita" );
		}
	}

	 
}