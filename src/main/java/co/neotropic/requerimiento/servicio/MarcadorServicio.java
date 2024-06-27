package co.neotropic.requerimiento.servicio;

import java.util.List;
import co.neotropic.requerimiento.modelo.Marcador;

public interface MarcadorServicio {

	List<Marcador> obtenerMarcadores();

	Marcador crearMarcador(Marcador marcador);

	Marcador editarMarcador(Marcador marcador, Integer id);

	Boolean eliminarMarcador(Integer id);
}
