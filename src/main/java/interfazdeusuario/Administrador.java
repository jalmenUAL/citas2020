package interfazdeusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAdministrador;

public class Administrador extends VistaAdministrador {
	 
     public Gestionar_Citas gc = new Gestionar_Citas();

	 public Administrador() {
		 VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		 vl.add(gc);
		 
	 }
	 
}