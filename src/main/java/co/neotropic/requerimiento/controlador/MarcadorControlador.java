package co.neotropic.requerimiento.controlador;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import co.neotropic.requerimiento.modelo.Marcador;
import co.neotropic.requerimiento.servicio.MarcadorServicio;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("marcador")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:4200", "http://mapasrequerimiento.s3-website-us-east-1.amazonaws.com", "https://rpss573k-4200.use2.devtunnels.ms"})
public class MarcadorControlador {

	@NonNull
	private MarcadorServicio servicioMarcador;

	@GetMapping
	private ResponseEntity<List<Marcador>> obtenerMarcadores() {
		return new ResponseEntity<List<Marcador>>(this.servicioMarcador.obtenerMarcadores(), HttpStatus.OK);
	}

	@PostMapping
	private ResponseEntity<Marcador> crearMarcador(@RequestBody Marcador marcador) {
		return new ResponseEntity<Marcador>(this.servicioMarcador.crearMarcador(marcador), HttpStatus.CREATED);
	}

	@PutMapping
	private ResponseEntity<Marcador> editarMarcador(@RequestBody Marcador marcador, @RequestParam Integer id) {
		return new ResponseEntity<Marcador>(this.servicioMarcador.editarMarcador(marcador, id), HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	private ResponseEntity<Boolean> eliminarMarcador(@PathVariable(value = "id") Integer id) {
		return new ResponseEntity<Boolean>(this.servicioMarcador.eliminarMarcador(id), HttpStatus.OK);
	}
}
