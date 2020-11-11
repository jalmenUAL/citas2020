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

public class Ver_Citas extends VistaVercitas  {
	 
	
	iAdministrador adm = new Bd_Principal();
	Ver_Informacion_de_Cliente vinfo = new Ver_Informacion_de_Cliente();

	public Ver_Citas() {
		 
		Inicializar();
		this.getVerInformacionCliente().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				verInformacionDeCliente();
			}
		});
	}

	void Inicializar() {
		
		Cargar_Citas();
		this.getPosponer().setVisible(false);
		this.getRealizar().setVisible(false);
		this.getCambiarFecha().setVisible(false);
		this.getNuevaFecha().setVisible(false);
		this.getDarBajaACita().setVisible(false);
		 
	}

	void verInformacionDeCliente() {
			
		if (this.getTablapendientes().getSelectedItems().size() > 0)

		{
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(vinfo);
			Optional<Cita_Activa> item = this.getTablapendientes().getSelectionModel().getFirstSelectedItem();
			item.ifPresent(cita -> {
				Integer id = cita.getID();
				Cliente cli = adm.Cargar_Informacion_Cliente(id);
				vinfo.getNombre().setValue(cli.getNombre());
				vinfo.getDireccion().setValue(cli.getDireccion());
				vinfo.getTelefono().setValue(cli.getTelefono());
				this.getTablapendientes().getSelectionModel().deselectAll();
			});

		} else if (this.getTablarealizadas().getSelectedItems().size() > 0)

		{
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(vinfo);
			Optional<Cita_Activa> item = this.getTablarealizadas().getSelectionModel().getFirstSelectedItem();

			item.ifPresent(cita -> {
				Integer id;
				id = cita.getID();
				Cliente cli = adm.Cargar_Informacion_Cliente(id);
				vinfo.getNombre().setValue(cli.getNombre());
				vinfo.getDireccion().setValue(cli.getDireccion());
				vinfo.getTelefono().setValue(cli.getTelefono());
				this.getTablarealizadas().getSelectionModel().deselectAll();
			});

		} else {
			Notification.show("Seleccione una cita");
		}
	}

	public void Cargar_Citas() {
		List<Cita_Activa> ca = adm.Cargar_Citas_Pendientes();
		this.getTablapendientes().removeAllColumns();
		this.getTablapendientes().setItems(ca);
		
		//this.getTablapendientes().addColumn(Cita_Activa -> Cita_Activa.getCliente().getNombre()).setCaption("Ciente");
		//this.getTablapendientes().addColumn(Cita_Activa -> Cita_Activa.getFecha().getDia()).setCaption("Día");
		;
		//this.getTablapendientes().addColumn(Cita_Activa -> Cita_Activa.getFecha().getMes()).setCaption("Mes");
		;
		//this.getTablapendientes().addColumn(Cita_Activa -> Cita_Activa.getFecha().getAnyo()).setCaption("Año");
		;
		//this.getTablapendientes().addColumn(Cita_Activa -> Cita_Activa.getEs_para().getNombre()).setCaption("Asunto");
		;

		List<Cita_Realizada> cr = adm.Cargar_Citas_Realizadas();
		this.getTablarealizadas().removeAllColumns();
		this.getTablarealizadas().setItems(cr);
		//this.getTablarealizadas().addColumn(Cita_Realizada -> Cita_Realizada.getCliente().getNombre()).setCaption("Cliente");
		;
		//this.getTablarealizadas().addColumn(Cita_Realizada -> Cita_Realizada.getFecha().getDia()).setCaption("Día");
		;
		//this.getTablarealizadas().addColumn(Cita_Realizada -> Cita_Realizada.getFecha().getMes()).setCaption("Mes");
		;
		//this.getTablarealizadas().addColumn(Cita_Realizada -> Cita_Realizada.getFecha().getAnyo()).setCaption("Añoo");
		;
		//this.getTablarealizadas().addColumn(Cita_Realizada -> Cita_Realizada.getEs_para().getNombre()).setCaption("Asunto");
		;
	}
	
	
	 
}