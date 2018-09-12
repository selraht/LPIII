import java.util.Scanner;

public class SistemaAcademico {

	public static void main(String[] args) {
		
		int opção;
		Academico academico= new Academico();
		Scanner e = new Scanner(System.in);
		do{
			System.out.println("\nSistema de Alunos de uma Instuição\n");
			System.out.println("1-Cadastrar aluno \n2-Listar Aluno \n3-Remover Alno \n4-Altarar Aluno");
			opção =e.nextInt();
			switch( opção )
			{
			    case 1:
			    	academico.CadastrarAluno();  
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
		
		}while(opção<5);
	}

	

}
