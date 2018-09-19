import java.util.Scanner;

public class SistemaBiblioteca {

	public static void main(String[] args) {
		
	
		
		int opção;
		Biblioteca biblioteca = new Biblioteca();
		Scanner e = new Scanner(System.in);
		do{
			System.out.println("\nSistema de Biblioteca:\n");
			System.out.println("1-Cadastrar aluno \n2-Listar Aluno \n3-Cadastrar Livro  \n4-Listar Livro \n5-Emprestar Livro \n6-Listar Emprestimo \n7-Devolver Livro");
			System.out.print("\nDigite sua Opção:");
			opção =e.nextInt();
			switch( opção )
			{
			    case 1:
			    	biblioteca.cadastrarAluno();  
			            break;
			    
			    case 2:
			    	biblioteca.listarAlunos();
			            break;
			    
			    case 3:
			    	biblioteca. cadastrarLivro();
			            break;
			    case 4:
			    	biblioteca.listarLivros();
		            	break;
			    case 5:
			    	biblioteca.emprestarLivro();
		            	break;
			    case 6:
			    	biblioteca.listaremprestimo();
		            	break;
			    case 7:
			    	biblioteca.devolverlivro();
		            	break;
		             
			    default:
			           
			}
		
		}while(opção<8);
	}

}


