package co.neotropic.requerimiento.servicio.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import co.neotropic.requerimiento.excepciones.EntidadNoExiste.EntidadNoExisteExcepcion;
import co.neotropic.requerimiento.modelo.Marcador;
import co.neotropic.requerimiento.repositorio.MarcadorRepositorio;
import co.neotropic.requerimiento.servicio.MarcadorServicio;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MarcadorServicioImpl implements MarcadorServicio {

	@NonNull
	private MarcadorRepositorio repositorioMarcador;

	@Override
	public List<Marcador> obtenerMarcadores() {
		return this.repositorioMarcador.findAll();
	}

	@Override
	public Marcador crearMarcador(Marcador marcador) {
		return this.repositorioMarcador.save(marcador);
	}

	@Override
	public Marcador editarMarcador(Marcador marcador, Integer id) {
		Marcador objMarcadorEncontrado = this.repositorioMarcador.findById(id)
											.orElseThrow(() -> new EntidadNoExisteExcepcion("El marcador no existe para editarlo"));
		if(marcador.getNombre() != null) objMarcadorEncontrado.setNombre(marcador.getNombre());
		if(marcador.getLatitud() != null) objMarcadorEncontrado.setLatitud(marcador.getLatitud());
		if(marcador.getLongitud() != null) objMarcadorEncontrado.setLongitud(marcador.getLongitud());
		if(marcador.getDescripcion() != null) objMarcadorEncontrado.setDescripcion(marcador.getDescripcion());
		
		return this.repositorioMarcador.save(objMarcadorEncontrado);
	}

	@Override
	public Boolean eliminarMarcador(Integer id) {
		Marcador objMarcadorEncontrado = this.repositorioMarcador.findById(id)
											.orElseThrow(() -> new EntidadNoExisteExcepcion("El marcador no existe para eliminarlo"));
		this.repositorioMarcador.delete(objMarcadorEncontrado);
		return true;
	}
}
