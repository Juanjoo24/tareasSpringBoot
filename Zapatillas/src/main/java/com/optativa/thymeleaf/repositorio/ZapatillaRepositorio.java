package com.optativa.thymeleaf.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.optativa.thymeleaf.entidad.Zapatilla;

@Repository
public interface ZapatillaRepositorio extends JpaRepository<Zapatilla, Integer> {

}
