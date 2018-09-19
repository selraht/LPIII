import java.util.ArrayList;
import java.util.Scanner;
public class Academico {
	
	ArrayList<Aluno> alunos = new ArrayList<Aluno>(); 
	
	public void cadastrarAluno(){
		
		Scanner eMatricula = new Scanner(System.in);
		Scanner bNome= new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Informde a matricula do Aluno: ");
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
		System.out.println("\nAluno Removido: ");
		
		
		
	
	}
	
	public void alterarAluno(){
		Scanner ematricula = new Scanner(System.in);
		Scanner enome = new Scanner(System.in);
		
		listarAlunos();
		
		System.out.println("Informe o Indice do Aluno que desejar alterar:  ");
		int i = enome.nextInt();
		i--;
		
		Aluno a = alunos.get(i);
		
		System.out.println(a.getMatricula()+ ", modifica para:");
		a.setMatricula(ematricula.next());
		
		
		
		System.out.println(a.getMatricula()+ ", modifica para:");
		a.setNome(enome.nextLine());
		
		System.out.println("\nAluno foi Alterado: ");
		
		
		
		
	}
	
}
