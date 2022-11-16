package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-nuevocliente template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-nuevocliente")
@JsModule("./vista-nuevocliente.js")
public class VistaNuevocliente extends PolymerTemplate<VistaNuevocliente.VistaNuevoclienteModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("nuevoCliente")
	private TextField nuevoCliente;

	/**
     * Creates a new VistaNuevocliente.
     */
    public VistaNuevocliente() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaNuevocliente and vista-nuevocliente
     */
    public interface VistaNuevoclienteModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
