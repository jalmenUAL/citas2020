package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.dom.Element;
import vistas.VistaDarDeAlta;

/**
 * A Designer generated component for the vista-gestionar-citas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-gestionar-citas")
@JsModule("./src/vista-gestionar-citas.js")
public class VistaGestionarCitas extends PolymerTemplate<VistaGestionarCitas.VistaGestionarCitasModel> {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinTabs")
	private Tabs vaadinTabs;
	@Id("vistaVercitas")
	private Element vistaVercitas;
	@Id("vistaDarDeAlta")
	private VistaDarDeAlta vistaDarDeAlta;
	@Id("vistaVercitas1")
	private Element vistaVercitas1;

	/**
     * Creates a new VistaGestionarCitas.
     */
    public VistaGestionarCitas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaGestionarCitas and vista-gestionar-citas
     */
    public interface VistaGestionarCitasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
