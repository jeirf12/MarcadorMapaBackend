package co.neotropic.requerimiento.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "marcador")
public class Marcador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mar_id")
	private Integer id;

	@Column(name = "mar_nombre")
	private String nombre;

	@Column(name = "mar_latitud")
	private String latitud;

	@Column(name = "mar_longitud")
	private String longitud;

	@Column(name = "mar_descripcion")
	private String descripcion;
}
