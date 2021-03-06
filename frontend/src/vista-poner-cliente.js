import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaPonerCliente extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-combo-box id="seleccionCliente" style="align-self: stretch;"></vaadin-combo-box>
 <vaadin-button theme="primary" id="nuevo" style="align-self: stretch;">
   Nuevo Cliente 
 </vaadin-button>
 <vaadin-text-field label="Introduzca el nombre del cliente" placeholder="escriba..." id="nuevoCliente" style="align-self: stretch;"></vaadin-text-field>
 <vaadin-text-field label="Introduzca la direccion del cliente" placeholder="escriba--" id="nuevaDireccion" style="align-self: stretch;"></vaadin-text-field>
 <vaadin-text-field label="Introduzca el telefono del cliente" placeholder="escriba..." id="nuevoTelefono" style="align-self: stretch;"></vaadin-text-field>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-poner-cliente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPonerCliente.is, VistaPonerCliente);
