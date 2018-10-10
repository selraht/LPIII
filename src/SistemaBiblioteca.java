import java.util.Scanner;

public class SistemaBiblioteca {

	public static void main(String[] args) {
		
	
		
		int opção;
		Biblioteca biblioteca = new Biblioteca();
		Scanner e = new Scanner(System.in);
		do{
			System.out.println("\nSistema de Biblioteca:\n");
			System.out.println("1-Cadastrar aluno \n2-Listar Aluno \n3-Cadastrar Livro  \n4-Listar Itens Acervo \n5-Emprestar Itens \n6-Listar Emprestimo \n7-Devolver Item  \n8-Cadastrar Revista \n9-Cadastrar CD \n10-Cadastrar DVD \n11-Cadastrar Artigo");
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
			    	biblioteca.listarItensAcervo();
		            	break;
			    case 5:
			    	biblioteca.emprestarItens();
		            	break;
			    case 6:
			    	biblioteca.listaremprestimo();
		            	break;
			    case 7:
			    	biblioteca.devolveritem();
		            	break;
			    case 8:
			    	biblioteca.cadastrarRevista();
		            	break;
			    case 9:
			    	biblioteca.cadastrarCD();
		            	break;
			    case 10:
			    	biblioteca.cadastrarDVD();
		            	break;
			    case 11:
			    	biblioteca.cadastrarArtigo();
		            	break;
		             
			    default:
			    	           
			}
		
		}while(opção<12);
	}

}


