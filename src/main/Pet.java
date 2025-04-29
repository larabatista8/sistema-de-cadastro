package main;
import java.util.Scanner;

// https://medium.com/@AlexanderObregon/beginners-quick-guide-to-java-enums-b39f5d30a731 
// https://www.w3schools.com/java/java_enums.asp#gsc.tab=0

// inserir funçao pra ler sexo e tipo

public class Pet {
	private String name;
	private String adress;
	private int houseNumber;
	private String street;
	private String neighborhood;
	private String city;
	private float age;
	private float weight;
	private String raca;
	private int code;
	
	private enum sexo {
		FEMEA,
		MACHO;
	}
	
	private enum type{
		GATO, 
		CACHORRO;
	}

	

	public Pet() {
		super();
		this.name = name;
		this.adress = adress;
		this.houseNumber = houseNumber;
		this.street = street;
		this.neighborhood = neighborhood;
		this.city = city;
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

	

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public float getAge() {
		return age;
	}

	public void setAge() {
		Scanner scan = new Scanner(System.in);
		try {
				float age = scan.nextFloat();
				if(age < 0 || age > 20) {
					System.out.println("Idade inválida. Digite novamente");
					setAge();
					
					}
				else {
					this.age = age;
					}
				}
		catch(Exception e) {
			System.out.println("Idade inválida. Digite novamente");
			setAge();
			}
		}
		
	

	public float getWeight() {
		return weight;
	}

	public void setWeight() {
		Scanner scan = new Scanner(System.in); 
		try {
					float weight = scan.nextFloat();
					
					if(weight >= 0.5 ||  weight <=60.0) {
						this.weight = weight;
						
									}
					else {
						System.out.println("Insira um peso válido");
						setWeight();
					}
		}
		
		catch(Exception e) {
			System.out.println("Insira um peso válido");
			setWeight();
		}
		
		
		
		
		
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

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Pet name=" + name + "\n, type=" + type + "\n, sexo=" + sexo + "\\n, adress=" + adress + ", age=" + age
				+ ", weight=" + weight + ", raca=" + raca + ", code=" + code + "]";
	}
	
	
	

}
