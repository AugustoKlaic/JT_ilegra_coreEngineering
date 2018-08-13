package com.java.augusto.business;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.java.augusto.persistence.EmprestimosDao;

public class GerenciaEmprestimo {
	private EmprestimosDao emprestimodao = new EmprestimosDao();
	private List<Emprestimo> todosemprestimos;

	public GerenciaEmprestimo() {
		todosemprestimos = new ArrayList<Emprestimo>();
	}

	public List<Emprestimo> listarEmprestimos() {
		return todosemprestimos;
	}

	public void novoEmprestimo(Pessoa pessoa, Livro livro) {
		if (pessoa.getNumeroAlugados() < 5) {
			System.out.println("O livro " + livro.getTitulo() + " foi retirado.\n");
			todosemprestimos.add(new Emprestimo(pessoa, livro));
			pessoa.retira();
			livro.setEmprestado(true);
			livro.getHistorico().add(pessoa);
			pessoa.addLivroQueJaRetirou();
		} else
			System.out.println("Você não pode retirar mais livro pois ja atingiu a cota maxima.\n");
	}
	
	public Emprestimo buscarEmprestimo(String livro) {
		for(Emprestimo emprestimo : todosemprestimos) {
			if(emprestimo.getLivro().getTitulo().equals(livro)) {
				return emprestimo;
			}
		}
		return null;
	}

	public void renovarEmprestimo(String titulo) {
		for (Emprestimo emprestimo : todosemprestimos) {
			if (emprestimo.getLivro().getTitulo().equals(titulo)) {
				emprestimo.setRenovacaoEmprestimo(emprestimo.getDiaEmprestimo().plusDays(7));
			}
		}
	}

	public void devolverLivro(Livro livro) {
		Emprestimo emprestimoaux = null;
		for (Emprestimo emprestimo : todosemprestimos) {
			if (emprestimo.getLivro().equals(livro)) {
				int diaaux = emprestimo.getPrazoEntrega().getDayOfYear() - emprestimo.getDiaEmprestimo().getDayOfYear();
				if (diaaux > 7) {
					System.out.println("Você atrasou a entrega do livro em " + diaaux + " dias e esta devendo R$: "
							+ (diaaux * 5) + " Reais.\n");
					emprestimo.getEmprestimosAtrasados().put(emprestimo.getPessoa().getNome(),
							emprestimo.getEmprestimosAtrasados().get(emprestimo.getPessoa().getNome() + diaaux));
				} else {
					emprestimoaux = emprestimo;
					emprestimo.getPessoa().devolve();
					emprestimo.getLivro().setEmprestado(false);
					System.out.println("Livro devolvido");
				}
			}
			todosemprestimos.remove(emprestimoaux);
		}
	}

	public List<Emprestimo> getEmprestimos() {
		return todosemprestimos;
	}

	public String livrosEmprestados() {
		for (Emprestimo emprestimo : todosemprestimos)
			return "O livro: " + emprestimo.getLivro().getTitulo() + " esta emprestado para: "
					+ emprestimo.getPessoa().getNome() + "\n";
		return "\n";
	}

	public void carregarDadosEmprestimo() {

		todosemprestimos = emprestimodao.carregarDadosEmprestimo();
	}

	public void gravarDadosEmprestimo() {

		emprestimodao.gravarDadosEmprestimo(todosemprestimos);
	}
}