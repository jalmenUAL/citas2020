package interfazdeusuario;

import java.util.List;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Asunto;
import bds.Bd_Principal;
import bds.iAdministrador;
import vistas.VistaPonerAsunto;

public class Poner_Asunto extends VistaPonerAsunto {
	Boolean _asunto = false;
	iAdministrador adm = new Bd_Principal();
	List<Asunto> as = adm.Cargar_Asuntos();
	Nuevo_Asunto na = new Nuevo_Asunto();

	public Poner_Asunto() {
		Inicializar();
		this.getBotonNuevoAsunto().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				nuevoAsunto();
			}
		});
	}
		
		 
	

	void Inicializar() {
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(na);
		na.setVisible(false);	 
		this.getSeleccionAsunto().setItems(as);
		this.getSeleccionAsunto().setItemLabelGenerator(Asunto::getNombre);
		
	}

	void nuevoAsunto() {
		na.setVisible(true);
		_asunto = true;
	}

	 
}