import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	private	ArrayList<Aluno> alunos = new ArrayList<Aluno>(); 
	//private	ArrayList<Livro> livros = new ArrayList<Livro>(); 
	private ArrayList<ItemAcervo> itensAcervo = new ArrayList<ItemAcervo>();
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
		
		itensAcervo.add(livro);                           		
	}
	
	public void cadastrarRevista(){
		Revista revista = new Revista();
		
		Scanner anumero = new Scanner(System.in);
		Scanner bano= new Scanner(System.in);
		Scanner cpublicacao = new Scanner(System.in);
		Scanner dnome= new Scanner(System.in);
		Scanner etitulo= new Scanner(System.in);
		Scanner feditora= new Scanner(System.in);
		
		
		System.out.println("Digite um numero: ");
		revista.setNumero(anumero.next());
		
		System.out.println("Informe o Ano: ");
		revista.setAno(bano.next());
		
		System.out.println("Informe o ano da publicação: ");
		revista.setPublicacao(cpublicacao.nextLine());
		
		System.out.println("Informe o nome da Revista: ");
		revista.setEditora(dnome.nextLine());
		
		itensAcervo.add(revista);                           
			
	}
	public void cadastrarCD(){
		CD cd = new CD();
		
		Scanner titulo = new Scanner(System.in);
		Scanner artista= new Scanner(System.in);
		Scanner categoria = new Scanner(System.in);
				
		System.out.println("Digite o titulo do CD: ");
		cd.setTitulo(titulo.nextLine());
		
		System.out.println("Informe o Nome do Artista do CD: ");
		cd.setArtista(artista.nextLine());
		
		System.out.println("Informe a categoria deste CD: ");
		cd.setCategoria(categoria.nextLine());
			
		itensAcervo.add(cd);                           		
	}
	
	public void cadastrarDVD(){
		DVD dvd = new DVD();
		
		Scanner titulo = new Scanner(System.in);
		Scanner sinopse = new Scanner(System.in);
		Scanner atores= new Scanner(System.in);
		Scanner diretor = new Scanner(System.in);
				
		System.out.println("Digite o titulo do DVD: ");
		dvd.setTitulo(titulo.nextLine());
		
		System.out.println("Informe A Sinopese do DVD: ");
		dvd.setSinopse(sinopse.nextLine());
		
		System.out.println("Informe os Atores do DVD: ");
		dvd.setAtores(atores.nextLine());
		
		System.out.println("Informe o Diretor: ");
		dvd.setDiretor(diretor.nextLine());
			
		itensAcervo.add(dvd);                           		
	}
	public void cadastrarArtigo(){
		Artigo artigo = new Artigo();
		
		Scanner titulo = new Scanner(System.in);
		Scanner autor = new Scanner(System.in);
		Scanner ano= new Scanner(System.in);
		Scanner periodo = new Scanner(System.in);
				
		System.out.println("Digite o titulo do artigo: ");
		artigo.setTitulo(titulo.nextLine());
		
		System.out.println("Informe o nome do autor do artigo: ");
		artigo.setAutor(autor.nextLine());
		
		System.out.println("Informe o ano do artigo: ");
		artigo.setAno(ano.nextLine());
		
		System.out.println("Informe o Perido do artigo: ");
		artigo.setPeriodo(periodo.nextLine());
			
		itensAcervo.add(artigo);                           		
	}
	
	public void listarAlunos(){ 
		System.out.println("Lista de Alunos");
		for(int i=0; i<alunos.size(); i++){	                       
			System.out.println((i+1)+ "," + alunos.get(i));
		}
	}
	
	public void listarItensAcervo(){ 
		System.out.println("Lista de Itens Acervo");
		for(int i=0; i<itensAcervo.size(); i++){	                       
			System.out.println((i+1)+ "," + itensAcervo.get(i));
		}
	}
	public void emprestarItens(){	
		listarAlunos();
		listarItensAcervo();
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Emprestimo emp = new Emprestimo();
		System.out.println("Informe o id do Aluno: ");
		emp.setAluno(alunos.get(a.nextInt()-1));
		System.out.println("Informe o id do Item: ");
		emp.setItemAcervo(itensAcervo.get(a.nextInt()-1));
		System.out.println("Informe a data de emprestimos: ");
		emp.setDataEmprestimo(b.next());
		emp.setStatus(Emprestimo.EMPRESTADO);
		emprestimos.add(emp);
		
	}
	
	public void listaremprestimo(){ 
		System.out.println("Lista de emprestimos");
		for(int i=0; i<emprestimos.size(); i++){	                       
			System.out.println((i+1)+ "," + emprestimos.get(i));
			
		}
	}
	
	public void devolveritem(){ 
		listaremprestimo();
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		
		System.out.println("Digite a id do Item que deseja devolver");
		Emprestimo emp = emprestimos.get(a.nextInt()-1);
		
		System.out.println("Informe a data de devolução");
		emp.setDataDevoluca(b.next());
		emp.setStatus(Emprestimo.DEVOLVIDO);
		}
	}
	
	
	
	


