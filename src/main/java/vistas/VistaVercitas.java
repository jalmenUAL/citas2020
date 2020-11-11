package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;

import basededatos.Cita_Activa;
import basededatos.Cita_Realizada;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.grid.Grid.Column;

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
	@Id("tablapendientes")
	private Grid<Cita_Activa> tablapendientes;
	@Id("realizar")
	private Button realizar;
	@Id("posponer")
	private Button posponer;
	@Id("cambiarFecha")
	private Button cambiarFecha;
	@Id("nuevaFecha")
	private DatePicker nuevaFecha;
	@Id("verInformacionCliente")
	private Button verInformacionCliente;
	@Id("darBajaACita")
	private Button darBajaACita;
	@Id("tablarealizadas")
	private Grid<Cita_Realizada> tablarealizadas;
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

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	 
	public Button getRealizar() {
		return realizar;
	}

	public void setRealizar(Button realizar) {
		this.realizar = realizar;
	}

	public Button getPosponer() {
		return posponer;
	}

	public void setPosponer(Button posponer) {
		this.posponer = posponer;
	}

	public Button getCambiarFecha() {
		return cambiarFecha;
	}

	public void setCambiarFecha(Button cambiarFecha) {
		this.cambiarFecha = cambiarFecha;
	}

	public DatePicker getNuevaFecha() {
		return nuevaFecha;
	}

	public void setNuevaFecha(DatePicker nuevaFecha) {
		this.nuevaFecha = nuevaFecha;
	}

	 

	public Button getVerInformacionCliente() {
		return verInformacionCliente;
	}

	public void setVerInformacionCliente(Button verInformacionCliente) {
		this.verInformacionCliente = verInformacionCliente;
	}

	public Button getDarBajaACita() {
		return darBajaACita;
	}

	public void setDarBajaACita(Button darBajaACita) {
		this.darBajaACita = darBajaACita;
	}

	public Grid<Cita_Activa> getTablapendientes() {
		return tablapendientes;
	}

	public void setTablapendientes(Grid<Cita_Activa> tablapendientes) {
		this.tablapendientes = tablapendientes;
	}

	public Grid<Cita_Realizada> getTablarealizadas() {
		return tablarealizadas;
	}

	public void setTablarealizadas(Grid<Cita_Realizada> tablarealizadas) {
		this.tablarealizadas = tablarealizadas;
	}

	 
}
