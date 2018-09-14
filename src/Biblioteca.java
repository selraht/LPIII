import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	ArrayList<Aluno> alunos = new ArrayList<Aluno>(); 
	ArrayList<Livro> livros = new ArrayList<Livro>(); 
		public void CadastrarAluno(){
			
			Aluno aluno = new Aluno();
			
			Scanner eMatricula = new Scanner(System.in);
			Scanner bNome= new Scanner(System.in);
			Scanner cTelefone = new Scanner(System.in);
			Scanner dEndereco= new Scanner(System.in);
			
			
			System.out.println("Informde a matricula do Aluno: ");
			aluno.setMatricula(eMatricula.next());
			
			System.out.println("Informe o nome do Aluno: ");
			aluno.setNome(bNome.nextLine());
			
			System.out.println("Informe o numero do Telefone: ");
			aluno.setNome(cTelefone.next());
			
			System.out.println("Informe o Seu Endereço: ");
			aluno.setNome(dEndereco.nextLine());
			
			alunos.add(aluno);   
		}
	public void CadastrarLivro(){
		Livro livro = new Livro();
		
		Scanner etitulo = new Scanner(System.in);
		Scanner bautor= new Scanner(System.in);
		Scanner cISBN = new Scanner(System.in);
		Scanner deditora= new Scanner(System.in);
		
		
		System.out.println("Digite o nome do titulo: ");
		livro.setTitulo(etitulo.next());
		
		System.out.println("Informe o Nome do Autor do Livro: ");
		livro.setAutor(bautor.nextLine());
		
		System.out.println("Informe o numero do ISBN: ");
		livro.setISBN(cISBN.next());
		
		System.out.println("Informe o nome da Editora: ");
		livro.setEditora(deditora.nextLine());
		
		livros.add(livro);                           
			
	}
	
	public void ListarAlunos(){
		
		int i=0;
		alunos.size();
        
		System.out.println("Lista de Alunos");
		for(i=0; i<alunos.size(); i++){
			                       
			System.out.println(alunos);
		}
	}
	public void emprestarLivro(){
		
		Aluno a = new Aluno();
		Livro l = new Livro();
		Emprestimo e = new Emprestimo();
		
		a.setMatricula("12345");
		a.setNome("Tharles Silva");
		a.setTelefone("9999-99999");
		
		l.setTitulo("Banco de Dados");
		l.setAutor("Aguiar");
		
		e.setAluno(a);
		e.setLivro(l);
		e.setDataEmprestimo("11/09/2018");
		e.setStatus(Emprestimo.EMPRESTADO);
		
		
		System.out.println(a);
		System.out.println(l);
		System.out.println(e);
		
	}
	
	
	

}
