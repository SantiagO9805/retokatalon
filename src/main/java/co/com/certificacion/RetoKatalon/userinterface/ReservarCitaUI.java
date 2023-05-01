package co.com.certificacion.RetoKatalon.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReservarCitaUI
{
    public static final Target CLICKMAKEAPPOINTMENT = Target.the("click en el botón Make Appointments").located(By.id("btn-make-appointment"));
    public static final Target ENTERUSERNAME = Target.the("Click en  input y luego poner el username ").located(By.id("txt-username"));
    public static final Target ENTERPASSWORD = Target.the("Click en el input y luego ingreso del password ").located(By.id("txt-password"));
    public static final Target BOTONLOGIN = Target.the("Click en el boton login ").located(By.id("btn-login"));
    public static final Target INGRESARFECHA = Target.the("poner fecha").located(By.id("txt_visit_date"));
    public static final Target INGRESARCOMENTARIO = Target.the("Poner comentario").located(By.id("txt_comment"));
    public static final Target CLICKBOTONBOOKAPPOINMET = Target.the("Poner comentario").located(By.id("btn-book-appointment"));






}
