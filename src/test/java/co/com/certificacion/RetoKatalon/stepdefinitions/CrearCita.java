package co.com.certificacion.RetoKatalon.stepdefinitions;

import co.com.certificacion.RetoKatalon.model.ConstructorVar;
import co.com.certificacion.pruebaKatalon.preguntas.Verificar;
import co.com.certificacion.RetoKatalon.tasks.AbrirPagina;
import co.com.certificacion.RetoKatalon.tasks.Make;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;



public class CrearCita
{



    @Given(" estoy en la pagina web de la clinica")
    public void queEstoyEnLaPaginaWebDeLaClinicaMedica()
    {
        theActorCalled("Santiago").wasAbleTo(AbrirPagina.katalonCitas());

    }
    @When("seleccionar la opcion de Agendar cita y el sistema debe mostrarme un formulario para ingresar la informacion ")
    public void seleccionoLaOpcionDeAgendarCitaYElSistemaDebeMostrarmeUnFormularioParaIngresarMiInformacionConveniente(List<ConstructorVar> constructorVars)
    {
        theActorInTheSpotlight().attemptsTo(Make.Appointment(constructorVars));
        //OnStage.theActorInTheSpotlight().attemptsTo(Make.Appointment(data));

    }
    @Then("la confirmacion de la cita se muestra en {string}")
    public void laConfirmacionDeLaCitaSeMostraraEnElSiguienteMensaje(String VerificarMensajePagina)
    {

        theActorInTheSpotlight().should(seeThat(Verificar.mensajeSitioWeb(VerificarMensajePagina)));
    }


}
