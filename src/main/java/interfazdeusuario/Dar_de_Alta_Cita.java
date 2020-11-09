package interfazdeusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaDarDeAlta;

public class Dar_de_Alta_Cita extends VistaDarDeAlta {
	 
	Poner_Asunto pa = new Poner_Asunto();
	Poner_Cliente pcl = new Poner_Cliente();
	Poner_Fecha pf = new Poner_Fecha();
	 

	public Dar_de_Alta_Cita() {
		 VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		 vl.addComponentAsFirst(pa);
		 vl.addComponentAsFirst(pcl);
		 vl.addComponentAsFirst(pf);
		 
	}

	void darDeAltaCita() {
		throw new UnsupportedOperationException();
	}

	void Inicializar() {
		throw new UnsupportedOperationException();
	}

	 
}