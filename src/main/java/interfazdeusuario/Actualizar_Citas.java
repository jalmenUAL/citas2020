package interfazdeusuario;

import java.util.Optional;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;

import bds.Bd_Principal;
import bds.iUsuario;
import basededatos.Cita_Activa;

public class Actualizar_Citas extends Ver_Citas {
	 
	iUsuario usu = new Bd_Principal();
	
	public Actualizar_Citas() {
		
		
		Inicializar();

		this.getRealizar().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				RealizarCita();
				
			}
		});

		this.getPosponer().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				PosponerCita();
				
			}
		});

		this.getCambiarFecha().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				cambiarFecha();
				
			}
		});
		
	}

	void Inicializar() {
		this.getPosponer().setVisible(true);
		this.getRealizar().setVisible(true);
	}

	void RealizarCita() {

		if (this.getTablapendientes().getSelectedItems().size() > 0) {
			Optional<basededatos.Cita_Activa> item = this.getTablapendientes().getSelectionModel().getFirstSelectedItem();

			item.ifPresent(cita -> {
				Integer id;
				id = cita.getID();
				usu.Cita_Realizada(id);
				Cargar_Citas();
			});
		} else {
			Notification.show("Seleccione una cita");
		}
	};

	void PosponerCita() {
		
		if (this.getTablapendientes().getSelectedItems().size() > 0) {			
			this.getCambiarFecha().setVisible(true);
			this.getNuevaFecha().setVisible(true);
			
		} else {
			Notification.show("Seleccione una cita");
		}
	}

	void cambiarFecha() {

		Optional<Cita_Activa> item = this.getTablapendientes().getSelectionModel().getFirstSelectedItem();

		item.ifPresent(cita -> {
		
			Integer id;
			id = cita.getID();
			usu.Cita_Pospuesta(id, this.getNuevaFecha().getValue());
			Cargar_Citas();	
			this.getCambiarFecha().setVisible(false);
			this.getNuevaFecha().setVisible(false);
		});
	}

}