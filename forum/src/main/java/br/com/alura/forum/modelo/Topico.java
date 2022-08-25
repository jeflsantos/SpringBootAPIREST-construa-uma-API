package br.com.alura.forum.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Topico {

	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private StatusTopico status = StatusTopico.NAO_RESPONDIDO;
	private Usuario autor;
	private List<Resposta> respostas = new ArrayList();
}
