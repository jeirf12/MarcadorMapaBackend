package co.neotropic.requerimiento.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import co.neotropic.requerimiento.excepciones.EntidadNoExiste.EntidadNoExisteExcepcion;

@ControllerAdvice
public class ExcepcionesControlador {

	
	@ExceptionHandler(EntidadNoExisteExcepcion.class)
	private ResponseEntity<?> errorTiempoEjecucion(EntidadNoExisteExcepcion ex) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
}
