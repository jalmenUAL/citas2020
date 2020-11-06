package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;

/**
 * A Designer generated component for the vista-vercitas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vercitas")
@JsModule("./src/vista-vercitas.js")
public class VistaVercitas extends PolymerTemplate<VistaVercitas.VistaVercitasModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("tabla")
	private Grid tabla;
	@Id("realizar")
	private Button realizar;
	@Id("posponer")
	private Button posponer;
	@Id("cambiarFecha")
	private Button cambiarFecha;
	@Id("nuevaFecha")
	private DatePicker nuevaFecha;
	@Id("darBajaACliente")
	private Button darBajaACliente;
	@Id("verInformacionCliente")
	private Button verInformacionCliente;
	/**
     * Creates a new VistaVercitas.
     */
    public VistaVercitas() {
        // You can initialise any data required for the connected UI components here.
      	
    }

    /**
     * This model binds properties between VistaVercitas and vista-vercitas
     */
   
    public interface VistaVercitasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	 
}
