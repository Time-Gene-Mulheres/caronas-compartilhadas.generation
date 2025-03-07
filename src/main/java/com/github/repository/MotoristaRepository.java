package com.github.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.github.model.Motorista;

public interface MotoristaRepository extends JpaRepository<Motorista, Long>{
	
	public List<Motorista> findAllByVeiculoContainingIgnoreCase(@Param("veiculo") String veiculo);

}
