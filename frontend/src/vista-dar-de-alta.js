import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-poner-asunto.js';
import './vista-poner-cliente.js';
import './vista-poner-fecha.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaDarDeAlta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vista-poner-asunto id="vistaPonerAsunto" style="align-self: stretch;"></vista-poner-asunto>
 <vista-poner-cliente id="vistaPonerCliente" style="align-self: stretch;"></vista-poner-cliente>
 <vista-poner-fecha id="vistaPonerFecha" style="align-self: stretch;"></vista-poner-fecha>
 <vaadin-button theme="primary" id="darDeAta" style="align-self: stretch;">
  Dar de Alta Cita
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-dar-de-alta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDarDeAlta.is, VistaDarDeAlta);
