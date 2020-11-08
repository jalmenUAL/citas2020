import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './vista-login.js';

class VistaGenerico extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vista-login id="vistaLogin"></vista-login>
`;
    }

    static get is() {
        return 'vista-generico';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaGenerico.is, VistaGenerico);
