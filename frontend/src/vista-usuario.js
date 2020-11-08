import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-vercitas.js';

class VistaUsuario extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vista-vercitas id="vistaVercitas"></vista-vercitas>
`;
    }

    static get is() {
        return 'vista-usuario';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaUsuario.is, VistaUsuario);
