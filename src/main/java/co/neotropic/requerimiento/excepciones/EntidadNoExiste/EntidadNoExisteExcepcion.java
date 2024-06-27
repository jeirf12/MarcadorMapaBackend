package co.neotropic.requerimiento.excepciones.EntidadNoExiste;

public class EntidadNoExisteExcepcion extends RuntimeException {

	public EntidadNoExisteExcepcion(String mensaje) {
		super(mensaje);
	}
}
