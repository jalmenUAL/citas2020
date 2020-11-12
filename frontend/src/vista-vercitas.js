import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-date-picker/src/vaadin-date-picker.js';
import '@vaadin/vaadin-grid/src/vaadin-grid.js';
import '@vaadin/vaadin-grid/src/vaadin-grid-column.js';

class VistaVercitas extends PolymerElement {

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
 <vaadin-grid items="[[items]]" id="tablapendientes" style="width: 100%;"></vaadin-grid>
 <vaadin-grid items="[[items]]" id="tablarealizadas" style="width: 100%;"></vaadin-grid>
 <vaadin-button id="verInformacionCliente" style="align-self: stretch;">
   Ver Informacion del Cliente 
 </vaadin-button>
 <vaadin-button theme="primary" id="realizar" style="flex-grow: 0; align-self: stretch;">
   Realizar 
 </vaadin-button>
 <vaadin-button theme="primary" id="posponer" style="align-self: stretch;">
   Posponer 
 </vaadin-button>
 <vaadin-button theme="primary" id="cambiarFecha" style="align-self: stretch;">
   Cambiar Fecha 
 </vaadin-button>
 <vaadin-date-picker id="nuevaFecha" style="align-self: stretch;"></vaadin-date-picker>
 <vaadin-button id="darBajaACita" style="align-self: stretch;">
   Dar de Baja a Cita 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-vercitas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVercitas.is, VistaVercitas);
