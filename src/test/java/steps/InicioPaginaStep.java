package steps;

import utilities.AccionesWeb;

public class InicioPaginaStep {

	AccionesWeb accionesWeb;

	

	public void abrirUrl() {
		accionesWeb.abrirNavegador("https://www.online-notepad.net/es/bloc-de-notas-online");
	}
}
