package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-actualizarcitasitem template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-actualizarcitasitem")
@JsModule("./vista-actualizarcitasitem.js")
public class VistaActualizarcitasitem extends PolymerTemplate<VistaActualizarcitasitem.VistaActualizarcitasitemModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaActualizarcitasitem.
     */
    public VistaActualizarcitasitem() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaActualizarcitasitem and vista-actualizarcitasitem
     */
    public interface VistaActualizarcitasitemModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
