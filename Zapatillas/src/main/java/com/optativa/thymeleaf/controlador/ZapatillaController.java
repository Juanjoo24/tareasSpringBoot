package com.optativa.thymeleaf.controlador;

import com.optativa.thymeleaf.entidad.Zapatilla;
import com.optativa.thymeleaf.repositorio.ZapatillaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/zapatillas")
public class ZapatillaController {

    @Autowired
    private ZapatillaRepositorio zapatillaRepositorio;

    // Listado de zapatillas
    @GetMapping
    public String listarZapatillas(Model model) {
        model.addAttribute("listaZapatillas", zapatillaRepositorio.findAll());
        return "lista";
    }

    // Mostrar formulario para nueva zapatilla
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("zapatilla", new Zapatilla());
        return "formulario";
    }

    // Guardar nueva zapatilla o actualizar existente
    @PostMapping("/formulario")
    public String guardarZapatilla(@ModelAttribute Zapatilla zapatilla) {
        zapatillaRepositorio.save(zapatilla);
        return "redirect:/zapatillas";
    }

    // Mostrar detalle de una zapatilla
    @GetMapping("/{id}")
    public String verZapatilla(@PathVariable("id") Integer id, Model model) {
        Zapatilla z = zapatillaRepositorio.findById(id).orElse(null);
        model.addAttribute("zapatilla", z);
        return "detalle";
    }

    // Editar zapatilla (cargar formulario con datos existentes)
    @GetMapping("/{id}/editar")
    public String editarZapatilla(@PathVariable("id") Integer id, Model model) {
        Zapatilla z = zapatillaRepositorio.findById(id).orElse(new Zapatilla());
        model.addAttribute("zapatilla", z);
        return "formulario";
    }

    // Eliminar zapatilla
    @GetMapping("/{id}/eliminar")
    public String eliminarZapatilla(@PathVariable("id") Integer id) {
        zapatillaRepositorio.deleteById(id);
        return "redirect:/zapatillas";
    }
}
