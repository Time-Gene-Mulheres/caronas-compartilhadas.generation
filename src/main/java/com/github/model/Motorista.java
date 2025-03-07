package com.github.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name= "tb_motoristas")
public class Motorista {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message = "O atributo nome é obrigatorio")
		@Size(min = 3, message = "O nome tem que ser maior que 3 letras")
		private String nome;
		
		@NotBlank(message = "O atributo cnh é obrigatorio")
		@Size(min = 9 , max = 11, message = "A cnh tem que ser maior que 9 e menor que 11")
		private String cnh;
		
		@NotBlank(message = "O atributo placa é obrigatorio")
		@Size(min = 7 , max = 7, message = "A placa tem que ter somente 7 caracteres")
		private String placa;
		
		@NotBlank(message = "O atributo veiculo é obrigatorio")
		@Size(max = 1000, message = "O veículo pode ter até 1000 caracteres")
		private String veiculo;
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCnh() {
			return cnh;
		}
		public void setCnh(String cnh) {
			this.cnh = cnh;
		}
		public String getPlaca() {
			return placa;
		}
		public void setPlaca(String placa) {
			this.placa = placa;
		}
		public String getVeiculo() {
			return veiculo;
		}
		public void setVeiculo(String veiculo) {
			this.veiculo = veiculo;
		}
		
		
		
		
		
	

}
