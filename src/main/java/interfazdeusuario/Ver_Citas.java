package interfazdeusuario;

 
 
import java.util.List;
import java.util.Optional;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cita_Activa;
import basededatos.Cita_Realizada;
import basededatos.Cliente;
import bds.Bd_Principal;
import bds.iAdministrador;
import vistas.VistaVercitas;
import vistas.VistaVercitasitem;

public class Ver_Citas extends VistaVercitas  {
	 
	
	iAdministrador adm = new Bd_Principal();
	 
	Ver_Citas_Realizadas  cr = new Ver_Citas_Realizadas();
	Ver_Citas_Activas ca = new Ver_Citas_Activas();

	public Ver_Citas() {
		 
		//Inicializar();
		/*this.getVerInformacionCliente().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
			    vinfo.setVisible(true);
			    verInformacionDeCliente();
				
			}
		});*/
	}

	/*void Inicializar() {
		Cargar_Citas();	 
	}
	public void Cargar_Citas() {
		cr.cargar_citas_realizadas();
		ca.cargar_citas_activas();
		
	}*/
	
	
	 
}