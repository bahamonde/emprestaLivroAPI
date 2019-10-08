package com.djg.emprestalivro.emprestalivroapi.dominio;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity  // Cria a Tabela no BD
public class Usuario {

		@Id    // Cria a chave primaria
		@GeneratedValue  // Cria valor autoincremento
		private Long codigoUsuario;
		private String nomeCompleto;
		private LocalDate dataNascimento;
		private String endereco;

		
		
		public String getNomeCompleto() {
			return nomeCompleto;
		}



		public void setNomeCompleto(String nomeCompleto) {
			this.nomeCompleto = nomeCompleto;
		}



		public LocalDate getDataNascimento() {
			return dataNascimento;
		}



		public void setDataNascimento(LocalDate dataNascimento) {
			this.dataNascimento = dataNascimento;
		}



		public String getEndereco() {
			return endereco;
		}



		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}



		public Long getCodigoUsuario() {
			return codigoUsuario;
		}



		public void setCodigoUsuario(Long codigoUsuario) {
			this.codigoUsuario = codigoUsuario;
		}
	
}
