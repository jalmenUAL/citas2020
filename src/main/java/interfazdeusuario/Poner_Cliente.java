package interfazdeusuario;

import java.util.List;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cliente;
import bds.Bd_Principal;
import bds.iAdministrador;
import vistas.VistaPonerCliente;

public class Poner_Cliente extends VistaPonerCliente {
	Boolean _cliente = false;
	iAdministrador adm = new Bd_Principal();
	List<Cliente> cl = adm.Cargar_Clientes();
	Nuevo_Cliente ncl = new Nuevo_Cliente();

	public Poner_Cliente() { 
		Inicializar();
		this.getBotonNuevoCliente().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				nuevoCliente();
			}
		});
	}

	void Inicializar() {
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(ncl);
		ncl.setVisible(false);
		this.getSeleccionCliente().setItems(cl);
		this.getSeleccionCliente().setItemLabelGenerator(Cliente::getNombre);
	}

	void nuevoCliente() {
		ncl.setVisible(false);
		_cliente = true;
	}

	 
}