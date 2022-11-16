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
	Ver_Informacion_de_Cliente vinfo = new Ver_Informacion_de_Cliente();
	 

	public Ver_Citas() {
		 
		Inicializar();
		this.getVerInformacionCliente().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
			    vinfo.setVisible(true);
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
			
			Optional<Cita_Activa> item = this.getTablapendientes().getSelectionModel().getFirstSelectedItem();
			
			item.ifPresent(cita -> {
				
				Integer id = cita.getID();
				Cliente cli = adm.Cargar_Informacion_Cliente(id);
				vinfo.getNombre().setValue(cli.getNombre());
				vinfo.getDireccion().setValue(cli.getDireccion());
				vinfo.getTelefono().setValue(cli.getTelefono());
				this.getTablapendientes().getSelectionModel().deselectAll();
			});
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(vinfo);

		} else if (this.getTablarealizadas().getSelectedItems().size() > 0)

		{
			
			Optional<Cita_Realizada> item = this.getTablarealizadas().getSelectionModel().getFirstSelectedItem();

			item.ifPresent(cita -> {
				Integer id;
				id = cita.getID();
				Cliente cli = adm.Cargar_Informacion_Cliente(id);
				vinfo.getNombre().setValue(cli.getNombre());
				vinfo.getDireccion().setValue(cli.getDireccion());
				vinfo.getTelefono().setValue(cli.getTelefono());
				this.getTablarealizadas().getSelectionModel().deselectAll();
			});
			this.getVaadinVerticalLayout().as(VerticalLayout.class).add(vinfo);

		} else {
			Notification.show("Seleccione una cita");
		}
	}

	public void Cargar_Citas() {
		
		List<Cita_Activa> ca = adm.Cargar_Citas_Pendientes();
		
		for (int i=0; i<ca.size();i++)
		{
			VistaVercitasitem vci = new VistaVercitasitem();
			vci.getCliente().setValue(ca.get(i).getCliente().getNombre());
			vci.getAsunto().setValue(ca.get(i).getEs_para().getNombre());
			vci.getDia().setValue(Integer.toString(ca.get(i).getFecha().getDia()));
			vci.getCliente().setValue(ca.get(i).getCliente().getNombre());
		}
		
		/*List<Cita_Activa> ca = adm.Cargar_Citas_Pendientes();
		this.getTablapendientes().removeAllColumns();
		 
		
		 
		
		this.getTablapendientes().addColumn(Cita_Activa -> Cita_Activa.getCliente().getNombre()).setHeader("Ciente");
		this.getTablapendientes().addColumn(Cita_Activa -> Cita_Activa.getFecha().getDia()).setHeader("Día");
		this.getTablapendientes().addColumn(Cita_Activa -> Cita_Activa.getFecha().getMes()).setHeader("Mes");
		this.getTablapendientes().addColumn(Cita_Activa -> Cita_Activa.getFecha().getAnyo()).setHeader("Año");
		this.getTablapendientes().addColumn(Cita_Activa -> Cita_Activa.getEs_para().getNombre()).setHeader("Asunto");
		this.getTablapendientes().setItems(ca);
		
		

		List<Cita_Realizada> cr = adm.Cargar_Citas_Realizadas();
		this.getTablarealizadas().removeAllColumns();
		
		this.getTablarealizadas().addColumn(Cita_Realizada -> Cita_Realizada.getCliente().getNombre()).setHeader("Cliente");
		this.getTablarealizadas().addColumn(Cita_Realizada -> Cita_Realizada.getFecha().getDia()).setHeader("Día");
		this.getTablarealizadas().addColumn(Cita_Realizada -> Cita_Realizada.getFecha().getMes()).setHeader("Mes");
		this.getTablarealizadas().addColumn(Cita_Realizada -> Cita_Realizada.getFecha().getAnyo()).setHeader("Año");
		this.getTablarealizadas().addColumn(Cita_Realizada -> Cita_Realizada.getEs_para().getNombre()).setHeader("Asunto");
		this.getTablarealizadas().setItems(cr);*/

		

		
	}
	
	
	 
}