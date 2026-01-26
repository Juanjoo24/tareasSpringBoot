package com.optativa.thymeleaf.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.optativa.thymeleaf.entidad.Zapatilla;
import com.optativa.thymeleaf.repositorio.ZapatillaRepositorio;

@Service
public class ZapatillaServicioImpl implements ZapatillaServicio {

    private final ZapatillaRepositorio zapatillaRepositorio;

    public ZapatillaServicioImpl(ZapatillaRepositorio zapatillaRepositorio) {
        this.zapatillaRepositorio = zapatillaRepositorio;
    }

    @Override
    public List<Zapatilla> obtenerZapatillas() {
        return zapatillaRepositorio.findAll();
    }

    @Override
    public Zapatilla obtenerZapatillaPorId(int id) {
        Optional<Zapatilla> zapatilla = zapatillaRepositorio.findById(id);
        return zapatilla.orElse(null); // devuelve null si no existe
    }

    @Override
    public void agregarZapatilla(Zapatilla zapatilla) {
        zapatillaRepositorio.save(zapatilla);
    }

    @Override
    public void actualizarZapatilla(Zapatilla zapatilla) {
        zapatillaRepositorio.save(zapatilla); // save actualiza si existe ID
    }

    @Override
    public void eliminarZapatilla(int id) {
        zapatillaRepositorio.deleteById(id);
    }
}
