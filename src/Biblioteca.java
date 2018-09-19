import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	private	ArrayList<Aluno> alunos = new ArrayList<Aluno>(); 
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	private ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	
		public void cadastrarAluno(){
			
			Aluno aluno = new Aluno();
			
			Scanner eMatricula = new Scanner(System.in);
			Scanner bNome= new Scanner(System.in);
			Scanner cTelefone = new Scanner(System.in);
			Scanner dEndereco= new Scanner(System.in);
			
			
			System.out.println("Informe a matricula do Aluno: ");
			aluno.setMatricula(eMatricula.next());
			
			System.out.println("Informe o nome do Aluno: ");
			aluno.setNome(bNome.nextLine());
			
			System.out.println("Informe o numero do Telefone: ");
			aluno.setTelefone(cTelefone.next());
			
			System.out.println("Informe o Seu Endereço: ");
			aluno.setEndereco(dEndereco.nextLine());
			
			alunos.add(aluno);   
		}
	public void cadastrarLivro(){
		Livro livro = new Livro();
		
		Scanner etitulo = new Scanner(System.in);
		Scanner bautor= new Scanner(System.in);
		Scanner cISBN = new Scanner(System.in);
		Scanner deditora= new Scanner(System.in);
		
		
		System.out.println("Digite o nome do titulo: ");
		livro.setTitulo(etitulo.nextLine());
		
		System.out.println("Informe o Nome do Autor do Livro: ");
		livro.setAutor(bautor.nextLine());
		
		System.out.println("Informe o numero do ISBN: ");
		livro.setISBN(cISBN.next());
		
		System.out.println("Informe o nome da Editora: ");
		livro.setEditora(deditora.nextLine());
		
		livros.add(livro);                           
			
	}
	
	public void listarAlunos(){ 
		System.out.println("Lista de Alunos");
		for(int i=0; i<alunos.size(); i++){	                       
			System.out.println((i+1)+ "," + alunos.get(i));
		}
	}
	
	public void listarLivros(){ 
		System.out.println("Lista de Livros");
		for(int i=0; i<livros.size(); i++){	                       
			System.out.println((i+1)+ "," + livros.get(i));
		}
	}
	public void emprestarLivro(){	
		listarAlunos();
		listarLivros();
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Emprestimo emp = new Emprestimo();
		System.out.println("Informe o id do Aluno: ");
		emp.setAluno(alunos.get(a.nextInt()-1));
		System.out.println("Informe o id do Livro: ");
		emp.setLivro(livros.get(a.nextInt()-1));
		System.out.println("Informe a data de emprestimos: ");
		emp.setDataEmprestimo(b.next());
		emp.setStatus(1);
		emprestimos.add(emp);
		
	}
	
	public void listaremprestimo(){ 
		System.out.println("Lista de emprestimos");
		for(int i=0; i<emprestimos.size(); i++){	                       
			System.out.println((i+1)+ "," + emprestimos.get(i));
			
		}
	}
	
	public void devolverlivro(){ 
		listaremprestimo();
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		
		System.out.println("Digite a id do Livro que deseja devolver");
		Emprestimo emp = emprestimos.get(a.nextInt()-1);
		
		System.out.println("Informe a data de devolução");
		emp.setDataDevoluca(b.next());	
		}
	}
	
	
	
	


