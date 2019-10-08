package com.djg.emprestalivro.emprestalivroapi.dominio;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Emprestimo {
	
	@Id
	@GeneratedValue
	private Long codigoSolicitacao;
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Livro livro;
	private LocalDate dataSolicitacao;
	private LocalDate dataDevolucao;
	
	
	
	

	public Long getCodigoSolicitacao() {
		return codigoSolicitacao;
	}

	public void setCodigoSolicitacao(Long codigoSolicitacao) {
		this.codigoSolicitacao = codigoSolicitacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public LocalDate getDataSolicitacao() {
		return dataSolicitacao;
	}

	public void setDataSolicitacao(LocalDate dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	
	
}
