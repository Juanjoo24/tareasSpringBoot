package com.optativa.thymeleaf.servicio;

import java.util.List;
import com.optativa.thymeleaf.entidad.Zapatilla;

public interface ZapatillaServicio {
    
    List<Zapatilla> obtenerZapatillas();

    Zapatilla obtenerZapatillaPorId(int id);

    void agregarZapatilla(Zapatilla zapatilla);

    void actualizarZapatilla(Zapatilla zapatilla);

    void eliminarZapatilla(int id);
}
