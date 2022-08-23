package practico1;

import java.time.LocalDate;
import java.time.Month;

//Atributos: nombre, edad, fecha de nacimiento, 
//DNI, sexo, peso y altura

public class Persona {
	
	String name = "N";
	String gender = "femenino";
	LocalDate dateOfBirth = LocalDate.of(2000,1,1);
	int age = 22;
	int dni;
	double weight = 1;
	double height = 1;
	
	public Persona(int dni) {
		this.dni = dni;
	
	}
	


	public Persona(int dni, String name) {
		
		this.name = setName(name);
		this.dni = dni;	
		
	}
	public Persona(int dni, String name, String gender) {
		this.gender = setGender(gender);
		this.name = setName(name);
		this.dni = dni;	
		
	}
	public Persona(int dni, String name, String gender, int age) {
		this.age = setAge(age);
		this.gender = setGender(gender);
		this.name = setName(name);
		this.dni = dni;
			
	}
	public Persona(int dni, String name, String gender, int age, double weight) {
		
		this.weight = setWeight(weight);
		this.age = setAge(age);
		this.gender = setGender(gender);
		this.name = setName(name);
		this.dni = dni;
			
	}
	public Persona(int dni, String name, String gender, int age, double weight, double height, LocalDate dateOfBirth) {
		
		this.dateOfBirth = setdateOfBirth(dateOfBirth);
		this.height = setHeight(height);
		this.weight = setWeight(weight);
		this.age = setAge(age);
		this.gender = setGender(gender);
		this.name = setName(name);
		this.dni = dni;
			
	}
	
	public Persona(int dni, String name, String gender, int age, double weight, double height) {
		
		this.height = setHeight(height);
		this.weight = setWeight(weight);
		this.age = setAge(age);
		this.gender = setGender(gender);
		this.name = setName(name);
		this.dni = dni;
			
	}
	//SETS
	public LocalDate setdateOfBirth(LocalDate dateOfBirth) {
		int año = dateOfBirth.getYear();
		int dia = dateOfBirth.getDayOfMonth();
		int mes = dateOfBirth.getMonthValue();
		
		if(año<0 || (mes<= 0 || mes>12) || (dia<= 0 || dia>31)) {
			 dateOfBirth = LocalDate.of(2000,1,1);
		} 
		
		
		return dateOfBirth;
	}
	
	public double setHeight(double height) {
		return setWeight(height);
	}
	

	public double setWeight(double weight) {
		if(weight < 0) {
			weight = 1;
		}
		
		return weight;
		
	}
	
	public String setGender(String gender) {
		gender = gender.toLowerCase();
		
		if(gender.isEmpty() || (!gender.equals("femenino") && !gender.equals("masculino"))) {
			gender = "femenino";
		}
		
		return gender;
		
		
	}
	
	public String setName(String name) {
		
		if(name.isEmpty()) {
			name = "N";
		}
		return name;
	}
	
	public int setAge(int age){
		if(age < 0) {
			age = 22;
		}
		
		return age;
	}
	
	
	//show this information 
	public void desplegarInfo() {
		
		System.out.println("Nombre: " + name);
		System.out.println("Edad: " + age);
		System.out.println("Fecha de Nacimiento: " + dateOfBirth);
		System.out.println("Genero: " + gender);
		System.out.println("DNI: " + dni);
		System.out.println("Peso: " + weight);
		System.out.println("Altura: " + height);
		
	}
	
	public double masaCorporal() {
		double indiceCorporal;
		
		indiceCorporal = weight / (Math.pow(height, 2));
		
		return indiceCorporal;
		
	}
	
	public boolean estaEnForma() {
		
		return(masaCorporal() > 18.5 &&  masaCorporal() < 25); 
	
	}

	public boolean esMayorEdad() {
		return age >= 18;
	}
	
	public boolean puedeVotar() {
		return age > 16;
	}
	
	public boolean estaCumpliendoAños() {
		int dia = dateOfBirth.getDayOfMonth();
		int mes = dateOfBirth.getMonthValue();
		
		LocalDate hoy = LocalDate.now();
	
		int diaHoy = hoy.getDayOfMonth(); 
		int mesHoy = hoy.getMonthValue();

		return (dia == diaHoy && mes == mesHoy);
	}
	
}
