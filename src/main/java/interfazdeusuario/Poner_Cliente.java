package interfazdeusuario;

import java.util.List;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
 

import basededatos.Cliente;
import bds.Bd_Principal;
import bds.iAdministrador;
import vistas.VistaPonerCliente;

public class Poner_Cliente extends VistaPonerCliente {
	Boolean _cliente = false;
	iAdministrador adm = new Bd_Principal();
	List<Cliente> cl = adm.Cargar_Clientes();
	 

	public Poner_Cliente() {
		
		
		 
		Inicializar();
		this.getNuevo().addClickListener(new ComponentEventListener() {
			 

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				nuevoCliente();
			}
		});
	}

	void Inicializar() {
		this.getNuevoCliente().setVisible(false);
		com.vaadin.flow.component.combobox.ComboBox<Cliente> combo = getSeleccionCliente();
		this.getNuevoCliente().setVisible(false);
		combo.setItemLabelGenerator(Cliente::getNombre);
		combo.setItems(cl);
	}

	void nuevoCliente() {
		this.getNuevoCliente().setVisible(true);
		_cliente = true;
	}

	 
}