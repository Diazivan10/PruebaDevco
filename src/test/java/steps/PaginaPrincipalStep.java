package steps;

import net.thucydides.core.annotations.Step;
import ui.PaginaPrincipalUI;
import utilities.AccionesWeb;


public class PaginaPrincipalStep {
	

	private AccionesWeb accionesWeb;	

	@Step
	
	public void seleccionarTextoEnriquecido() {
		accionesWeb.bordearElemento(PaginaPrincipalUI.getBtnTextoEnriquecido());
		accionesWeb.tomarEvidencia();
		accionesWeb.clickBoton(PaginaPrincipalUI.getBtnTextoEnriquecido());
		
	}
	
	public void seleccionaOpcionNegrilla() {
		accionesWeb.bordearElemento(PaginaPrincipalUI.getBtnNegrilla());
		accionesWeb.tomarEvidencia();
		accionesWeb.clickBoton(PaginaPrincipalUI.getBtnNegrilla());
	
	}
	
	public void digitarPalabra(String strPalabra) {
		accionesWeb.clickBoton(PaginaPrincipalUI.getLblEsribir());
		accionesWeb.escribirTexto(PaginaPrincipalUI.getLblEsribir(), strPalabra);
		accionesWeb.bordearElemento(PaginaPrincipalUI.getLblEsribir());
		accionesWeb.tomarEvidencia();
	}

	public void seleccionarOpcionLista() {
		accionesWeb.bordearElemento(PaginaPrincipalUI.getBtnListaTareas());
		accionesWeb.tomarEvidencia();
		accionesWeb.clickBoton(PaginaPrincipalUI.getBtnListaTareas());
		
		
	}
	
	public void digitarLetraUno(String strPalabra1) {
		accionesWeb.clickBoton(PaginaPrincipalUI.getLblEscribirLista());
		accionesWeb.escribirTexto(PaginaPrincipalUI.getLblEscribirLista(), strPalabra1);
		accionesWeb.tomarEvidencia();
		
	}
	
	public void seleccionarAgregar() {
		accionesWeb.clickBoton(PaginaPrincipalUI.getBtnAgregar());
		accionesWeb.tomarEvidencia();
	}
	
	public void digitarLetraDos(String strPalabra2) {
		accionesWeb.clickBoton(PaginaPrincipalUI.getLblEscribirLista());
		accionesWeb.escribirTexto(PaginaPrincipalUI.getLblEscribirLista(), strPalabra2);
		accionesWeb.tomarEvidencia();
		
	}
	
	public void digitarLetraTres(String strPalabra3) {
		accionesWeb.clickBoton(PaginaPrincipalUI.getLblEscribirLista());
		accionesWeb.escribirTexto(PaginaPrincipalUI.getLblEscribirLista(), strPalabra3);
		accionesWeb.tomarEvidencia();
		
	}

	
	public void digitarLetraCuatro(String strPalabra4) {
		accionesWeb.clickBoton(PaginaPrincipalUI.getLblEscribirLista());
		accionesWeb.escribirTexto(PaginaPrincipalUI.getLblEscribirLista(), strPalabra4);
		accionesWeb.tomarEvidencia();
		
	}
	
	public void digitarLetraCinco(String strPalabra5) {
		accionesWeb.clickBoton(PaginaPrincipalUI.getLblEscribirLista());
		accionesWeb.escribirTexto(PaginaPrincipalUI.getLblEscribirLista(), strPalabra5);
		accionesWeb.tomarEvidencia();
		
	}

	



	
	
	
	
}	
