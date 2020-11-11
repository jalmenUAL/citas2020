package interfazdeusuario;

import java.util.List;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.combobox.ComboBox;

import basededatos.Asunto;
import bds.Bd_Principal;
import bds.iAdministrador;
import vistas.VistaPonerAsunto;

public class Poner_Asunto extends VistaPonerAsunto {
	Boolean _asunto = false;
	iAdministrador adm = new Bd_Principal();
	List<Asunto> as = adm.Cargar_Asuntos();

	public Poner_Asunto() {
		Inicializar();
		this.getNuevioAsunto().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				nuevoAsunto();
			}
		});
	}
		
		 
	

	void Inicializar() {
		this.getIntroduzcaElAsunto().setVisible(false);	 
		this.getSeleccionAsunto().setItems(as);
		this.getSeleccionAsunto().setItemLabelGenerator(Asunto::getNombre);
		
	}

	void nuevoAsunto() {
		this.getIntroduzcaElAsunto().setVisible(true);
		_asunto = true;
	}

	 
}