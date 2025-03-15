package main;

public class Pet {
	private String name;
	private String type;
	private String sexo;
	private String adress;
	private int age;
	private float weight;
	private String raca;
	private int code;
	
	public Pet(String name, String type, String sexo, String adress, int age, float weight, String raca, int code) {
		super();
		this.name = name;
		this.type = type;
		this.sexo = sexo;
		this.adress = adress;
		this.age = age;
		this.weight = weight;
		this.raca = raca;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Pet name=" + name + "\n, type=" + type + "\n, sexo=" + sexo + "\\n, adress=" + adress + ", age=" + age
				+ ", weight=" + weight + ", raca=" + raca + ", code=" + code + "]";
	}
	
	
	

}
