package com.example.TareaRA3.repositorio;

import com.example.TareaRA3.modelo.Zapatilla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZapatillaRepositorio extends JpaRepository<Zapatilla, Integer> {
	
}