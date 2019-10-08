package com.djg.emprestalivro.emprestalivroapi.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.djg.emprestalivro.emprestalivroapi.dominio.Emprestimo;
import com.djg.emprestalivro.emprestalivroapi.repositorio.LivroRepositorio;
import com.djg.emprestalivro.emprestalivroapi.repositorio.UsuarioRepositorio;
import com.djg.emprestalivro.emprestalivroapi.servico.EmprestimoServico;
import com.djg.emprestalivro.emprestalivroapi.vo.EmprestimoVO;


@RestController
public class EmprestimoControlador {
	
	@Autowired
	private EmprestimoServico emprestimoServico;
		
	@PostMapping("/emprestimo")
	public void salvaEmprestimo(@RequestBody EmprestimoVO emprestimoVO) {
		emprestimoServico.salva(emprestimoVO);

   }

}