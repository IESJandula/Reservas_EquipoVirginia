package ies.jandula.reservaCarritos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservaDto
{
	private String diaSemana;

	private String tramoHorario;

	private int nAlumnos;

	private String email;

	private String nombre;

	private String apellidos;

}
