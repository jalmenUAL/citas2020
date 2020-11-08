package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import vistas.VistaPonerAsunto;
import com.vaadin.flow.component.polymertemplate.Id;
import vistas.VistaPonerCliente;
import vistas.VistaPonerFecha;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-dar-de-alta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dar-de-alta")
@JsModule("./src/vista-dar-de-alta.js")
public class VistaDarDeAlta extends PolymerTemplate<VistaDarDeAlta.VistaDarDeAltaModel> {

    @Id("vistaPonerAsunto")
	private VistaPonerAsunto vistaPonerAsunto;
	@Id("vistaPonerCliente")
	private VistaPonerCliente vistaPonerCliente;
	@Id("vistaPonerFecha")
	private VistaPonerFecha vistaPonerFecha;
	@Id("darDeAta")
	private Button darDeAta;

	/**
     * Creates a new VistaDarDeAlta.
     */
    public VistaDarDeAlta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaDarDeAlta and vista-dar-de-alta
     */
    public interface VistaDarDeAltaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public VistaPonerAsunto getVistaPonerAsunto() {
		return vistaPonerAsunto;
	}

	public void setVistaPonerAsunto(VistaPonerAsunto vistaPonerAsunto) {
		this.vistaPonerAsunto = vistaPonerAsunto;
	}

	public VistaPonerCliente getVistaPonerCliente() {
		return vistaPonerCliente;
	}

	public void setVistaPonerCliente(VistaPonerCliente vistaPonerCliente) {
		this.vistaPonerCliente = vistaPonerCliente;
	}

	public VistaPonerFecha getVistaPonerFecha() {
		return vistaPonerFecha;
	}

	public void setVistaPonerFecha(VistaPonerFecha vistaPonerFecha) {
		this.vistaPonerFecha = vistaPonerFecha;
	}

	public Button getDarDeAta() {
		return darDeAta;
	}

	public void setDarDeAta(Button darDeAta) {
		this.darDeAta = darDeAta;
	}
}
