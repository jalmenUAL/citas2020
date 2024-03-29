package citas;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import interfazdeusuario.Actualizar_Citas;
import interfazdeusuario.Administrador;
import interfazdeusuario.Generico;
import interfazdeusuario.Login;
import interfazdeusuario.Usuario;
import vistas.VistaGestionarCitas;
import vistas.VistaLogin;
import vistas.VistaVercitas;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@Route
@PWA(name = "Vaadin Application",
        shortName = "Vaadin App",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service The message service. Automatically injected Spring managed bean.
     */
	
	/* CHANGES */
	
    public MainView() {
    	
    	Generico gen = new Generico();
    	
        add(gen);
        
        LoginForm vl = gen._login.getVaadinLoginForm();
    	
        
    	vl.addLoginListener(e -> {
    	    
    	    if (e.getUsername().equals("admin")) {
    	    	
    	    	Administrador gc = new Administrador();
    	    	remove(gen);
    	    	add(gc);
    	    	
    	    }
    	    else if (e.getUsername().equals("usuario")) {
    	    	
    	    	Usuario gc = new Usuario();
    	    	remove(gen);
    	    	add(gc);
    	    	 
    	        
    	    } else {
    	    	vl.setError(true);
    	    }
    	});
    	 	
    }

}
