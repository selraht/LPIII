
public class Emprestimo {
	
	public final static int EMPRESTADO =1;
	public final static int DEVOLVIDO =2;
	
	private	 Aluno aluno;
	private	 ItemAcervo itemAcervo;
	private	String dataEmprestimo;
	private	String dataDevoluca;
	private	int status;
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public ItemAcervo getItemAcervo() {
		return itemAcervo;
	}

	public void setItemAcervo(ItemAcervo itemAcervo) {
		this.itemAcervo = itemAcervo;
	}

	public String getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public String getDataDevoluca() {
		return dataDevoluca;
	}

	public void setDataDevoluca(String dataDevoluca) {
		this.dataDevoluca = dataDevoluca;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Emprestimo [aluno=" + aluno + ", itemAcervo=" + itemAcervo + ", dataEmprestimo=" + dataEmprestimo
				+ ", dataDevoluca=" + dataDevoluca + ", status=" + status + "]";
	}	
}
