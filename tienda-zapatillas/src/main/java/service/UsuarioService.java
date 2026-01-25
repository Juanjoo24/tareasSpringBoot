package com.tienda.tienda_zapatillas.service;

import com.tienda.tienda_zapatillas.model.Usuario;
import com.tienda.tienda_zapatillas.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> listar() {
        return repository.findAll();
    }

    public void guardar(Usuario usuario) {
        repository.save(usuario);
    }

    public Optional<Usuario> obtener(Long id) {
        return repository.findById(id);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
