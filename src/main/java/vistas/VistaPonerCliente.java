package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;

import basededatos.Cliente;

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
	@Id("nuevo")
	private Button nuevo;
	@Id("nuevoCliente")
	private TextField nuevoCliente;
	@Id("nuevaDireccion")
	private TextField nuevaDireccion;
	@Id("nuevoTelefono")
	private TextField nuevoTelefono;
	@Id("seleccionCliente")
	private ComboBox<Cliente> seleccionCliente;
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

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public ComboBox<Cliente> getSeleccionCliente() {
		return seleccionCliente;
	}

	public void setSeleccionCliente(ComboBox<Cliente> seleccionCliente) {
		this.seleccionCliente = seleccionCliente;
	}

	public Button getNuevo() {
		return nuevo;
	}

	public void setNuevo(Button nuevo) {
		this.nuevo = nuevo;
	}

	public TextField getNuevoCliente() {
		return nuevoCliente;
	}

	public void setNuevoCliente(TextField nuevoCliente) {
		this.nuevoCliente = nuevoCliente;
	}

	public TextField getNuevaDireccion() {
		return nuevaDireccion;
	}

	public void setNuevaDireccion(TextField nuevaDireccion) {
		this.nuevaDireccion = nuevaDireccion;
	}

	public TextField getNuevoTelefono() {
		return nuevoTelefono;
	}

	public void setNuevoTelefono(TextField nuevoTelefono) {
		this.nuevoTelefono = nuevoTelefono;
	}
}
