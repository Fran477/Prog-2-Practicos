package practico1;


import java.time.LocalDate;

public class main {
	public static void main(String [] args) {
		Persona francisco = new Persona(38);
		Persona Luiz = new Persona(3902, "luiz", "asdff");
		Persona Luiz2 = new Persona(3902, "luiz", "Masculino");
		Persona jose = new Persona(38952345, "Jose Perez", "MASCULINO", 15, 68 ,1.65, LocalDate.of(2005,8,23));
		jose.desplegarInfo();
		System.out.println(jose.esMayorEdad());;
		System.out.println(jose.estaCumpliendoAños());
		
	}
}
