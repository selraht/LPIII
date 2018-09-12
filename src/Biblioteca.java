
public class Biblioteca {
	
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
