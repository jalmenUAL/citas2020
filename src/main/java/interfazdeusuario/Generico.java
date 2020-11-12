package interfazdeusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGenerico;

public class Generico  extends VistaGenerico {

	
	public Login ln = new Login();
	
	
	public Generico() {
		
		 VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		 vl.add(ln);
		  
	}
	
	
}