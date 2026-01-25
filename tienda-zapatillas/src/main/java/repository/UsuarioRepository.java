package com.tienda.tienda_zapatillas.repository;
package com.tienda.tienda_zapatillas.controller;

import com.tienda.tienda_zapatillas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
