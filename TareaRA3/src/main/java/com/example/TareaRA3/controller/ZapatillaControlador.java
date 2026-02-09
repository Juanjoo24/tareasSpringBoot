package com.example.TareaRA3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.TareaRA3.modelo.Zapatilla;
import com.example.TareaRA3.servicio.ZapatillaServicio; 

@Controller
@RequestMapping("/zapatillas")
public class ZapatillaControlador {

    @Autowired
    private ZapatillaServicio service; 

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("listaZapatillas", service.listarTodas());
        return "zapatillas/lista"; 
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("zapatilla", new Zapatilla());
        return "zapatillas/formulario"; 
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("zapatilla") Zapatilla zapatilla) {
        service.guardar(zapatilla);
        return "redirect:/zapatillas";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable("id") Integer id, Model model) {
        Zapatilla zapa = service.obtenerPorId(id);
        model.addAttribute("zapatilla", zapa);
        return "zapatillas/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        service.eliminar(id);
        return "redirect:/zapatillas";
    }
}