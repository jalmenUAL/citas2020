package interfazdeusuario;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import vistas.VistaVerInformacionCliente;

public class Ver_Informacion_de_Cliente extends VistaVerInformacionCliente {

	public Ver_Informacion_de_Cliente() {
		Inicializar();
		this.getVaadinButton().addClickListener(new ComponentEventListener() {
			 

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				 cerrar();
			}
		});
		
	}

	void Inicializar() {
		setVisible(false);
	}

	void cerrar() {
		setVisible(false);
	}
}