package co.neotropic.requerimiento.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import co.neotropic.requerimiento.modelo.Marcador;

public interface MarcadorRepositorio extends JpaRepository<Marcador, Integer> { }
