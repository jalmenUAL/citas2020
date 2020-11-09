package interfazdeusuario;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;

import vistas.VistaGenerico;
import vistas.VistaGestionarCitas;
import vistas.VistaVercitas;

public class Generico  extends VistaGenerico {

	
	public Login ln = new Login();
	
	
	public Generico() {
		
		 VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		 vl.add(ln);
		  
	}
	
	
}