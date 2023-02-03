package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.InicioPaginaStep;
import steps.PaginaPrincipalStep;

public class PrimeroDefinition {

	@Steps
	InicioPaginaStep inicioPaginaStep;
	@Steps
	PaginaPrincipalStep paginaPrincipalStep;
	

	@Given("abre el navegador")
	public void abreElNavegador() {
		inicioPaginaStep.abrirUrl();
		
	}



	
	@When("Selecciona la opcion texto enriquecido")
	public void selecciona_la_opcion_texto_enriquecido() {
		paginaPrincipalStep.seleccionarTextoEnriquecido();
	}
	
	
	@When("Selecciona la opcion negrilla y digita una palabra {string}")
	public void selecciona_la_opcion_negrilla_y_digita_una_palabra(String strPalabra) {
		paginaPrincipalStep.seleccionaOpcionNegrilla();
		paginaPrincipalStep.digitarPalabra(strPalabra);
	}
	
	@When("Selecciona la opcion lista de tareas")
	public void selecciona_la_opcion_lista_de_tareas() {
	    paginaPrincipalStep.seleccionarOpcionLista();
	}

	@When("Digita la primera letra {string} y lo agrega")
	public void digita_la_primera_letra_y_lo_agrega(String strPalabra1) {
		paginaPrincipalStep.digitarLetraUno(strPalabra1);
		paginaPrincipalStep.seleccionarAgregar();		
	  
	}
	
	@When("Digita la segunda letra {string} y lo agrega")
	public void digita_la_segunda_letra_y_lo_agrega(String strPalabra2) {
		paginaPrincipalStep.digitarLetraDos(strPalabra2);
		paginaPrincipalStep.seleccionarAgregar();	
	}

	@When("Digita la tercera letra {string} y lo agrega")
	public void digita_la_tercera_letra_y_lo_agrega(String strPalabra3) {
		paginaPrincipalStep.digitarLetraTres(strPalabra3);
		paginaPrincipalStep.seleccionarAgregar();	
	 
	}

	@When("Digita la cuarta letra {string} y lo agrega")
	public void digita_la_cuarta_letra_y_lo_agrega(String strPalabra4) {
		paginaPrincipalStep.digitarLetraCuatro(strPalabra4);
		paginaPrincipalStep.seleccionarAgregar();	
	   
	}

	@When("Digita la quinta letra {string} y lo agrega")
	public void digita_la_quinta_letra_y_lo_agrega(String strPalabra5) {
		paginaPrincipalStep.digitarLetraCinco(strPalabra5);
		paginaPrincipalStep.seleccionarAgregar();	
	    
	}

}




	
	

