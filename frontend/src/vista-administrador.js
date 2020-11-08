import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-gestionar-citas.js';

class VistaAdministrador extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vista-gestionar-citas id="vistaGestionarCitas"></vista-gestionar-citas>
`;
    }

    static get is() {
        return 'vista-administrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrador.is, VistaAdministrador);
