package utilities;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import exceptions.ExceptionsProyecto;
import org.openqa.selenium.By;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.util.EnvironmentVariables;


public class AccionesWeb extends PageObject{
	
	private Logger logger =  LoggerFactory.getLogger(AccionesWeb.class);
	private static final String WEBDRIVERTIMEOUT = "webdriver.timeouts.implicitlywait";
	private EnvironmentVariables environmentVariables;
	private static final int ESPERA_TIEMPO_FIJADO = 120;



	/** Metodo para abrir navegador
	 * @author idiazc
	 * @since 31/01/2022
	 */
	
	public void abrirNavegador(String strUrl) {
		openAt(strUrl);
		getDriver().manage().deleteAllCookies();
		getDriver().navigate().refresh();
	}
	/**
	 * Metodo para escribir Texto
	 * @param element  elemento tipo by donde se va a escribir
	 * @param strTexto elemeto tipo String el cual es
	 * el texto que se va a escribir 
	 * @author idiazc
	 * @since 31/01/2022
	 */
	public void escribirTexto(By element, String strTexto) {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), obtenerTiempoSerenity());
			wait.until(ExpectedConditions.visibilityOfElementLocated(element));
			WebElementFacade input = element(element);
			waitFor(input).isEnabled();
			input.type(strTexto);
		}catch (Exception e) {
			logger.error("en la clase AccionesWeb en el metodo escribirTexto" + e);
			excepcionAccionesWeb(e);
		}
	}
	/**
	 * Metodo para pasar el mensaje a la clases ExceptionsProyecto
	 * Solo recibe el mensaje de error
	 * @author idiazc
	 * @since 31/01/2022
	 */
	private void excepcionAccionesWeb(Exception e) {
		String[] strExcepcion = e.getClass().getCanonicalName()
				.replace(".", "-").split("-");
		ExceptionsProyecto.validaExcepcion(strExcepcion[strExcepcion.length-1]);
	}
	/**
	* Metodo para calcular el tiempo del serenity properties
	* @return retorna el tiempo en segundos del serenity.properties
	 * @author idiazc
	 * @since 31/01/2022
	*/
	public int obtenerTiempoSerenity() {
		return (Integer.parseInt(EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(WEBDRIVERTIMEOUT)))/1000;
	}
	
	/** Metodo para dar click a un elemento
	 *  @param strBoton elemento tipo by con el cual se va a interactuar
	 * @author idiazc
	 *@since 
	 */
	public void clickBoton(By strBoton ) {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), ESPERA_TIEMPO_FIJADO);
			wait.until(ExpectedConditions.visibilityOfElementLocated(strBoton));
			WebElementFacade btn = element(strBoton);
			waitFor(btn).isEnabled();
			element(strBoton).click();
		}catch(Exception e) {
			logger.error("en la clase AccionesWeb en el metodo clickBoton " + e);
			excepcionAccionesWeb(e);
		}
	}
	
	/** Metodo para esperar a que carguen los elementos de una pagina 
	 * 
	 * @author idiazc
	 * @since 31/01/2022
	 */
	public void esperaCargarPagina() {
		int intTimer = 60;
		try {
			new WebDriverWait(getDriver(), intTimer).until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd)
					.executeScript("return document.readyState").equals("complete"));			
		}catch (Exception e) {
			logger.error("en la clase AccionesWeb en el metodo esperaCargarPagina " + e);
			excepcionAccionesWeb(e);
		}
	}
	
	/** Metodo para dar click a un boton y realizar una espera 
	 * devuelve true o false
	 * 
	 * @param strBoton
	 * @param blnRealizarEspera
	 */
	
	public void clickBoton(By strBoton, boolean blnRealizarEspera) {
		try {
			if(blnRealizarEspera) {
				esperoElementoVisible(strBoton);
				esperoElementoHabilitado(strBoton);
			}
			WebElementFacade btn = element(strBoton);
			waitFor(btn).isEnabled();
			element(strBoton).click();
		}catch(Exception e) {
			logger.error("en la clase AccionesWeb en el metodo clickBoton " + e);
			excepcionAccionesWeb(e);
		}
	}
	
	/** Metodo para esperar a que un elemento este visible
	 * 
	 * @param xpath
	 * @return
	 * @author idiazc
	 * @since 1/02/2022
	 */
	public boolean esperoElementoVisible(By xpath) {
		esperaCargarPagina();
		try {			
			WebDriverWait espera = new WebDriverWait(getDriver(), obtenerTiempoSerenity());
			espera.until(ExpectedConditions.visibilityOfElementLocated(xpath));
			if (element(xpath).isVisible()) {
				return true;
			}
		} catch (Exception e) {
			logger.info("en la clase AccionesWeb en el metodo esperoElementoVisible" + e);
		}
		return false;
	}
	/** Metodo para esperar a que un elemento este habilitado 
	 * 
	 * @param xpath
	 * @return
	 * @author idiazc
	 * @since 1/02/2022
	 */
	public boolean esperoElementoHabilitado(By xpath) {
		esperaCargarPagina();
		try {
			WebDriverWait espera = new WebDriverWait(getDriver(), obtenerTiempoSerenity());
			espera.until(ExpectedConditions.elementToBeClickable(xpath));
			if (element(xpath).isEnabled()) {
				return true;
			}
		} catch (Exception e) {
			logger.error("en la clase AccionesWeb en el metodo esperoElementoHabilitado " + e);
		}
		return false;
	}
	
	/** Metodo para cerrar el navegador
	 * @author idiazc
	 * @since 1/02/2022
	 */
	
	
	
	/** Metodo para tomar pantallazo de la pantalla
	 * 
	 * @author idiazc
	 * @since 2/02/2022
	 */
	
	public void tomarEvidencia() {
		try {
			Serenity.takeScreenshot();
		}catch(Exception e) {
			logger.error("en la clase AccionesWeb en el metodo tomarEvidencia " + e);
			excepcionAccionesWeb(e);
		}
	}
	/** Metodo para border elemento 
	 * 
	 * @author idiazc
	 * @since 2/02/2022
	 */
	public void bordearElemento(By webLocalizador) {
		try {
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.border='2px dashed red'",
					element(webLocalizador));
		}catch(Exception e) {
			logger.error("en la clase AccionesWeb en el metodo bordearElemento " + e);
			excepcionAccionesWeb(e);
		}
	}
	
}
