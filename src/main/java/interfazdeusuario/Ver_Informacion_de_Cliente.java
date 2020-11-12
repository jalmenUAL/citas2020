package interfazdeusuario;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;

import vistas.VistaVerInformacionCliente;

public class Ver_Informacion_de_Cliente extends VistaVerInformacionCliente {

	public Ver_Informacion_de_Cliente() {
		 
		this.getVaadinButton().addClickListener(new ComponentEventListener() {
			 

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				 cerrar();
				  
			}
		});
		
	}

	 

	void cerrar() {
		setVisible(false);
	}
}