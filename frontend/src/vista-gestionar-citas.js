import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-vercitas.js';
import './vista-dar-de-alta.js';

class VistaGestionarCitas extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
 <vista-vercitas id="vistaVercitas" style="flex-grow: 1;"></vista-vercitas>
 <vista-dar-de-alta id="vistaDarDeAlta" style="flex-grow: 1;"></vista-dar-de-alta>
 <vista-vercitas id="vistaVercitas1" style="flex-grow: 1;"></vista-vercitas>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-gestionar-citas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaGestionarCitas.is, VistaGestionarCitas);
