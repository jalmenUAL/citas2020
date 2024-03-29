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
	/*CODE GENERATION private event _dar_de_Alta;*/
	public Gestionar_Citas _gestionar_Citas;
	public Poner_Fecha _poner_Fecha;
	public Poner_Asunto _poner_Asunto;
	public Poner_Cliente _poner_Cliente;
	

	public Dar_de_Alta_Cita() {
		
		Inicializar();

		this.getDarDeAta().addClickListener(new ComponentEventListener() {
			 

			@Override
			public void onComponentEvent(ComponentEvent event) {
				Dar_de_Alta();
				_poner_Cliente.getSeleccionCliente().setItems(adm.Cargar_Clientes());
				_poner_Asunto.getSeleccionAsunto().setItems(adm.Cargar_Asuntos());
				
			}

		});
		
		
		 
		 
	}

	

	void Inicializar() {
		Poner_Fecha();
		Poner_Asunto();
		Poner_Cliente();
	}
	
	public void Poner_Fecha() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		 vl.addComponentAsFirst(_poner_Fecha);
	}

	public void Poner_Asunto() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		 vl.addComponentAsFirst(_poner_Asunto);
	}

	public void Poner_Cliente() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);	  
		 vl.addComponentAsFirst(_poner_Cliente);
	}

	void Dar_de_Alta() {
		if (_poner_Cliente._cliente) {
			if (_poner_Asunto._asunto) {

				
				
				adm.Crear_Cita_Asunto_Cliente_Nuevos(_poner_Fecha.getFechaCita().getValue(), _poner_Asunto._nuevo_Asunto.getNuevoAsunto().getValue(),
						_poner_Cliente._nuevo_Cliente.getNuevoCliente().getValue(), _poner_Cliente._nuevo_Cliente.getDireccion().getValue(),
						_poner_Cliente._nuevo_Cliente.getTelefono().getValue());
				_poner_Asunto._nuevo_Asunto.getNuevoAsunto().setVisible(false);
				_poner_Asunto._asunto = false;
				_poner_Cliente._cliente = false;

			} else {
		
				if (_poner_Asunto.getSeleccionAsunto().getValue()==null) {Notification.show("Por favor, selecciona un asunto");}
				else {
					if (_poner_Fecha.getFechaCita().getValue()==null) {Notification.show("Por favor, selecciona una fecha");}
					else {
				Asunto asunto = _poner_Asunto.getSeleccionAsunto().getValue();
				adm.Crear_Cita_Nuevo_Cliente(_poner_Fecha.getFechaCita().getValue(), _poner_Cliente._nuevo_Cliente.getNuevoCliente().getValue(),
						_poner_Cliente._nuevo_Cliente.getDireccion().getValue(), _poner_Cliente._nuevo_Cliente.getTelefono().getValue(), asunto.getORMID());

				
				_poner_Cliente._cliente = false;
				}
				}
			}
		} else {
			if (_poner_Asunto._asunto) {
				if (_poner_Cliente.getSeleccionCliente().getValue()==null) {Notification.show("Por favor, selecciona un cliente");}
				
					else {
						if (_poner_Fecha.getFechaCita().getValue()==null) {Notification.show("Por favor, selecciona una fecha");}
						else {
				Cliente cliente = _poner_Cliente.getSeleccionCliente().getValue();
				adm.Crear_Cita_Nuevo_Asunto(_poner_Fecha.getFechaCita().getValue(),_poner_Asunto._nuevo_Asunto.getNuevoAsunto().getValue(),
						cliente.getORMID());
				_poner_Asunto._asunto = false;
				}
					}
			} 
			else {
				if (_poner_Cliente.getSeleccionCliente().getValue()==null) {Notification.show("Por favor, selecciona un cliente");}
				else 
					if (_poner_Asunto.getSeleccionAsunto().getValue()==null) {Notification.show("Por favor, selecciona un asunto");}
					else 
						if (_poner_Fecha.getFechaCita().getValue()==null) {Notification.show("Por favor, selecciona una fecha");}
						else {
				Asunto asunto = _poner_Asunto.getSeleccionAsunto().getValue();
				Cliente cliente = _poner_Cliente.getSeleccionCliente().getValue();
				adm.Crear_Cita(_poner_Fecha.getFechaCita().getValue(), cliente.getORMID(), asunto.getORMID());
					}

			}
		}
	}

	 
}