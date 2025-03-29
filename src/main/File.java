package main;
import java.util.Scanner;
import java.io.*;



public class File {
	
	public static void showMenu() {
		
		System.out.println("1. Cadastrar um novo pet\r\n"
				+ "2. Alterar os dados do pet cadastrado\r\n"
				+ "3. Deletar um pet cadastrado\r\n"
				+ "4. Listar todos os pets cadastrados\r\n"
				+ "5. Listar pets por algum critério (idade, nome, raça)\r\n"
				+ "6. Sair");
	}
	
	public static int getOption() {
		int option=-70;
		Scanner scan = new Scanner(System.in);
		showMenu();
		
		
			try {
			option = scan.nextInt();
			
				while( option<= 0 || option >6) {
					System.out.println("Insira um número entre 1 e 6");
					showMenu();
					option = scan.nextInt();
					
				}
				
		
			}
			catch(Exception e){
				System.out.println("Insira uma opção válida");
				getOption(); // testar com essa parte deletada
				
				
			}
		return option;
		
	}

	public static void getNewPet() {
		// setting a new pet object
		Pet newPet= new Pet();
		
		String filePath = "C:\\Users\\laris\\Documents\\sistema-de-cadastro\\src\\main\\formulario.txt";
		// showing questions to user
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linha;
		            while ((linha = br.readLine()) != null) {
		            	
		                System.out.println(linha);
		                newPet.setName();
		            }
		            System.out.println("nome inserido "+ newPet.getName());
        } 
        catch (IOException e) {
        		e.printStackTrace();
        				}
        
        
    }
			
		
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option;
		Scanner scan = new Scanner(System.in);
		showMenu();
		
		
			try {
			option = scan.nextInt();
			
				while( option<= 0 || option >6) {
					System.out.println("Insira um número entre 1 e 6");
					showMenu();
					option = scan.nextInt();
					
				}
				
		
			}
			catch(Exception e){
				System.out.println("Insira uma opção válida");
				option = getOption();
				
			}
			
		System.out.println("valor escolhido: " + option);	
		
		switch(option) {
		case 1: 
			getNewPet();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
	}

}
	}
