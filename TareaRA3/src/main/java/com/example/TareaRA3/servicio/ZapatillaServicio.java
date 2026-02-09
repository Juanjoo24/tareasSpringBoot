package com.example.TareaRA3.servicio;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import com.example.TareaRA3.modelo.Zapatilla;
import com.example.TareaRA3.repositorio.ZapatillaRepositorio;

public class ZapatillaServicio {

    @Autowired
    private ZapatillaRepositorio repositorio;

    public List<Zapatilla> listarTodas() {
        return repositorio.findAll();
    }

    public void guardar(Zapatilla zapatilla) {
        repositorio.save(zapatilla);
    }

    public Zapatilla obtenerPorId(Integer id) {
        return repositorio.findById(id).orElse(null);
    }

    public void eliminar(Integer id) {
        repositorio.deleteById(id);
    }
}