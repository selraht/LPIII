import java.util.ArrayList;
import java.util.Scanner;
public class Academico {
	
	ArrayList<Aluno> alunos = new ArrayList<Aluno>(); 
	
	public void CadastrarAluno(){
		
		Scanner eMatricula = new Scanner(System.in);
		Scanner bNome= new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Informe a matricula do Aluno: ");
		aluno.setMatricula(eMatricula.next());
		
		System.out.println("Informe o nome do Aluno: ");
		aluno.setNome(bNome.nextLine());
		
		alunos.add(aluno);                              
		
	}
	
	public void listarAlunos(){
		Scanner f = new Scanner(System.in);
		int i=0;
		//Aluno a=alunos.get(i);listar somente um elemento
		alunos.size();
		
		for(i=0; i<alunos.size(); i++){
			System.out.println(i+"-"+ alunos.get(i));
			//System.out.print(i+" - Matricula: " +alunos.get(i).getMatricula() + " ");
			//System.out.println("Nome: " +alunos.get(i).getNome());
		}
		
		
	}
	
	public void removerAluno(){
		Scanner e = new Scanner(System.in);
		listarAlunos();
		
		System.out.println("Informe o Indice que deseja remover: ");
		//int i= e.nextInt();
		alunos.remove(e.nextInt());
		
		
	
	}
	
	public void alterarAluno(){
		//TODO
	}
	
}
