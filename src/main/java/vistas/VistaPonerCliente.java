package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-poner-cliente template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-poner-cliente")
@JsModule("./src/vista-poner-cliente.js")
public class VistaPonerCliente extends PolymerTemplate<VistaPonerCliente.VistaPonerClienteModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("seleccionCliente")
	private ComboBox<String> seleccionCliente;
	@Id("nuevo")
	private Button nuevo;
	@Id("nuevoCliente")
	private TextField nuevoCliente;

	/**
     * Creates a new VistaPonerCliente.
     */
    public VistaPonerCliente() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPonerCliente and vista-poner-cliente
     */
    public interface VistaPonerClienteModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}