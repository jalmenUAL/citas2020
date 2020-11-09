package interfazdeusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaUsuario;

public class Usuario extends VistaUsuario {

	public Actualizar_Citas gc = new Actualizar_Citas();
	public Usuario() {
		 
		 VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		 vl.add(gc);
	 }
}
