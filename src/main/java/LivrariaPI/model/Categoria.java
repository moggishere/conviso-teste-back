package LivrariaPI.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // create table
@Table(name = "tb_post") // tabela categoria
public class Categoria{

	@Id // primary key (id)
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
	private Long id;

	@NotBlank(message = "Por favor insira um título válido")
	@Size(min = 1, max = 50, message = "O atributo titulo deve ter no minimo 1 e no maximo 30 caractéres")
	private String categoria;

	@NotBlank(message = "Por favor adicionar descrição da vulnerabilidade")
	@Size(min = 5, max = 800, message = "Deve ter entre o mínimo de 10 caractéres e o máximo de 800")
	private String descricaoCategoria;

	@NotBlank(message = "Por favor adicionar nivel da vulnerabilidade")
	private String nivel;

	@NotBlank(message = "Por favor adicionar tipo da vulnerabilidade")
	private String tipo;

	private String evidencia;

	@NotBlank(message = "Por favor adicionar solução proposta para a vulnerabilidade")
	@Size(min = 5, max = 800, message = "Deve ter entre o mínimo de 10 caractéres e o máximo de 800")
	private String solucao;

	// Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricaoCategoria() {
		return this.descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}


	public String getNivel() {
		return this.nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEvidencia() {
		return this.evidencia;
	}

	public void setEvidencia(String evidencia) {
		this.evidencia = evidencia;
	}

	public String getSolucao() {
		return this.solucao;
	}

	public void setSolucao(String solucao) {
		this.solucao = solucao;
	}

	

}
// {}
	