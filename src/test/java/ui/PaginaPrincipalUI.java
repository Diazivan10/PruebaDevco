package ui;

import org.openqa.selenium.By;

public class PaginaPrincipalUI {

	private PaginaPrincipalUI() {}
	
	
	private static final By BTN_TEXTO_ENRIQUECIDO = By.xpath("//button[@id='richtextnote-tab']");
	private static final By BTN_NEGRILLA = By.xpath("//*[@id=\"richtextnote\"]/main/div/div/div[1]/div/div[1]/button[1]");
	private static final By LBL_ESRIBIR = By.xpath("//div[@id='editor']");
	private static final By BTN_LISTA_TAREAS =By.xpath("//button[@id='tasklist-tab']");
	private static final By LBL_ESCRIBIR_LISTA = By.xpath("//input[@id='my-list']");
	private static final By BTN_AGREGAR = By.xpath("//button[@id='addnewlist']");
	
	
	public static By getBtnTextoEnriquecido() {
		return BTN_TEXTO_ENRIQUECIDO;
	}


	public static By getBtnNegrilla() {
		return BTN_NEGRILLA;
	}


	public static By getLblEsribir() {
		return LBL_ESRIBIR;
	}


	public static By getBtnListaTareas() {
		return BTN_LISTA_TAREAS;
	}


	public static By getLblEscribirLista() {
		return LBL_ESCRIBIR_LISTA;
	}


	public static By getBtnAgregar() {
		return BTN_AGREGAR;
	}

}
