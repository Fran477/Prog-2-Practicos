package practico1;

import java.time.LocalDate;
import java.time.Month;

//Atributos: nombre, edad, fecha de nacimiento, 
//DNI, sexo, peso y altura

public class Persona {
	
	String name;
	String gender;
	LocalDate dateOfBirth;
	int age;
	int dni;
	double weight;
	double height;
	
	public Persona(int dni) {
		this(dni,"N");
	
	}
	


	public Persona(int dni, String name) {
		this(dni,name,"Femenino");
		
	}
	public Persona(int dni, String name, String gender) {
		
		this(dni,name,gender, 1);
		
	}

	public Persona(int dni, String name, String gender, double weight) {
		
		this(dni,name,gender,weight,1);
		
	}
		
	public Persona(int dni, String name, String gender, double weight, double height) {
		
		this(dni,name,gender,weight,height, LocalDate.of(2000,1,1));
				
		}
			
	
	public Persona(int dni, String name, String gender, double weight, double height, LocalDate dateOfBirth) {
		
		this.dateOfBirth = setdateOfBirth(dateOfBirth);
		this.height = setHeight(height);
		this.weight = setWeight(weight);	
		this.gender = setGender(gender);
		this.name = setName(name);
		this.dni = dni;
			
	}
	
	
	//SETS
	public LocalDate setdateOfBirth(LocalDate dateOfBirth) { 
		return dateOfBirth;
	}
	
	public double setHeight(double height) {
		
		return height;
	}
	

	public double setWeight(double weight) {

		return weight;
		
	}
	
	public String setGender(String gender) {
		return gender;
		
		
	}
	
	public String setName(String name) {
		return name;
	}
	
	
	//GETERS
	public int getDni() {
		return dni;
	}

	public String getName() {
		return name;
	}



	public String getGender() {
		return gender;
	}



	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}



	public int getAge() {
		return age;
	}



	public double getWeight() {
		return weight;
	}



	public double getHeight() {
		return height;
	}

	//show this information  
	
	//METODOS
	public String desplegarInfo() {
		
		return  name + "-" + age + "-" + gender + "-" + dni + "-" + weight + "-" + height + "-" + dateOfBirth;
		
		
	}
	
	public double masaCorporal() {
		double indiceCorporal;
		
		indiceCorporal = getWeight() / (Math.pow(getHeight(), 2));
		
		return indiceCorporal;
		
	}
	
	public boolean estaEnForma() {
		
		return(masaCorporal() > 18.5 &&  masaCorporal() < 25); 
	
	}

	public boolean esMayorEdad() {
		return getAge() >= 18;
	}
	
	public boolean puedeVotar() {
		return getAge() > 16;
	}
	
	public boolean estaCumpliendoAños() {
		int dia = getDateOfBirth().getDayOfMonth();
		int mes = getDateOfBirth().getMonthValue();
		
		LocalDate hoy = LocalDate.now();
	
		int diaHoy = hoy.getDayOfMonth(); 
		int mesHoy = hoy.getMonthValue();

		return (dia == diaHoy && mes == mesHoy);
	}
	
}
