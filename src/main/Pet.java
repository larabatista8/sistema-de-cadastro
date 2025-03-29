package main;
import java.util.Scanner;

public class Pet {
	private String name;
	private String type;
	private String sexo;
	private String adress;
	private int houseNumber;
	private String street;
	private String neighborhood;
	private String city;
	private int age;
	private float weight;
	private String raca;
	private int code;
	
	

	public Pet() {
		super();
		this.name = name;
		this.type = type;
		this.sexo = sexo;
		this.adress = adress;
		this.houseNumber = houseNumber;
		this.street = street;
		this.neighborhood = neighborhood;
		this.age = age;
		this.weight = weight;
		this.raca = raca;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName() {
		Scanner scan = new Scanner(System.in); 
		
		try {
			String name = scan.nextLine();
			//checking if there are only letters and space in the name
			if( name != null && name.matches("^\\p{L}+(\\s+\\p{L}+)+$")) {
				
			this.name = name;
				}
			else {
				System.out.println("Insira um nome válido,com sobrenome e sem números e caractéres especiais");
				setName();
			}
		}
		catch(Exception e){
			System.out.println("Insira um nome válido,com sobrenome e sem números e caractéres especiais");
			setName();
			
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	
	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Pet name=" + name + "\n, type=" + type + "\n, sexo=" + sexo + "\\n, adress=" + adress + ", age=" + age
				+ ", weight=" + weight + ", raca=" + raca + ", code=" + code + "]";
	}
	
	
	

}
