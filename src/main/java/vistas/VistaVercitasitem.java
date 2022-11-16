package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.checkbox.Checkbox;

/**
 * A Designer generated component for the vista-vercitasitem template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vercitasitem")
@JsModule("./vista-vercitasitem.js")
public class VistaVercitasitem extends PolymerTemplate<VistaVercitasitem.VistaVercitasitemModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("cliente")
	private TextField cliente;
	@Id("día")
	private TextField día;
	@Id("mes")
	private TextField mes;
	@Id("año")
	private TextField año;
	@Id("asunto")
	private TextField asunto;
	@Id("vaadinCheckbox")
	private Checkbox vaadinCheckbox;

	/**
     * Creates a new VistaVercitasitem.
     */
    public VistaVercitasitem() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVercitasitem and vista-vercitasitem
     */
    public interface VistaVercitasitemModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
