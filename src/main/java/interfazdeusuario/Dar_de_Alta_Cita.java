package interfazdeusuario;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Asunto;
import basededatos.Cliente;
import bds.Bd_Principal;
import bds.iAdministrador;
import vistas.VistaDarDeAlta;

public class Dar_de_Alta_Cita extends VistaDarDeAlta {
	 
	iAdministrador adm = new Bd_Principal();
	Poner_Asunto pa = new Poner_Asunto();
	Poner_Cliente pcl = new Poner_Cliente();
	Poner_Fecha pf = new Poner_Fecha();
	

	public Dar_de_Alta_Cita() {
		
		Inicializar();

		this.getDarDeAta().addClickListener(new ComponentEventListener() {
			 

			@Override
			public void onComponentEvent(ComponentEvent event) {
				darDeAltaCita();
				pcl.getSeleccionCliente().setItems(adm.Cargar_Clientes());
				pa.getSeleccionAsunto().setItems(adm.Cargar_Asuntos());
				
			}

		});
		
		
		 
		 
	}

	void darDeAltaCita() {
		if (pcl._cliente) {
			if (pa._asunto) {

				
				
				adm.Crear_Cita_Asunto_Cliente_Nuevos(pf.getFechaCita().getValue(), pa.getIntroduzcaElAsunto().getValue(),
						pcl.getNuevoCliente().getValue(), pcl.getNuevaDireccion().getValue(),
						pcl.getNuevoTelefono().getValue());
				pa.getNuevioAsunto().setVisible(false);
				pa._asunto = false;
				pcl._cliente = false;

			} else {
		
				if (pa.getSeleccionAsunto().getValue()==null) {Notification.show("Por favor, selecciona un asunto");}
				else {
					if (pf.getFechaCita().getValue()==null) {Notification.show("Por favor, selecciona una fecha");}
					else {
				Asunto asunto = pa.getSeleccionAsunto().getValue();
				adm.Crear_Cita_Nuevo_Cliente(pf.getFechaCita().getValue(), pcl.getNuevoCliente().getValue(),
						pcl.getNuevaDireccion().getValue(), pcl.getNuevoTelefono().getValue(), asunto.getORMID());

				
				pcl._cliente = false;
				}
				}
			}
		} else {
			if (pa._asunto) {
				if (pcl.getSeleccionCliente().getValue()==null) {Notification.show("Por favor, selecciona un cliente");}
				
					else {
						if (pf.getFechaCita().getValue()==null) {Notification.show("Por favor, selecciona una fecha");}
						else {
				Cliente cliente = pcl.getSeleccionCliente().getValue();
				adm.Crear_Cita_Nuevo_Asunto(pf.getFechaCita().getValue(), pa.getIntroduzcaElAsunto().getValue(),
						cliente.getORMID());
				pa._asunto = false;
				}
					}
			} 
			else {
				if (pcl.getSeleccionCliente().getValue()==null) {Notification.show("Por favor, selecciona un cliente");}
				else 
					if (pa.getSeleccionAsunto().getValue()==null) {Notification.show("Por favor, selecciona un asunto");}
					else 
						if (pf.getFechaCita().getValue()==null) {Notification.show("Por favor, selecciona una fecha");}
						else {
				Asunto asunto = pa.getSeleccionAsunto().getValue();
				Cliente cliente = pcl.getSeleccionCliente().getValue();
				adm.Crear_Cita(pf.getFechaCita().getValue(), cliente.getORMID(), asunto.getORMID());
					}

			}
		}
	}

	void Inicializar() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		 vl.addComponentAsFirst(pa);
		 vl.addComponentAsFirst(pcl);
		 vl.addComponentAsFirst(pf);
	}

	 
}