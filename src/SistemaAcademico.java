import java.util.Scanner;

public class SistemaAcademico {

	public static void main(String[] args) {
		
		int op��o;
		Academico academico= new Academico();
		Scanner e = new Scanner(System.in);
		do{
			System.out.println("\nSistema de Alunos de uma Instui��o:\n");
			System.out.println("1-Cadastrar aluno \n2-Listar Aluno \n3-Remover Alno \n4-Altarar Aluno");
			System.out.print("\nDigite sua Op��o:");
			op��o =e.nextInt();
			switch( op��o )
			{
			    case 1:
			    	academico.cadastrarAluno();  
			            break;
			    
			    case 2:
			    	academico.listarAlunos();
			            break;
			    
			    case 3:
			    	academico.removerAluno();
			            break;
			    case 4:
			    	academico.alterarAluno();
		            	break;
		            	
			    default:
			           
			}
		
		}while(op��o<5);
	}

	

}
