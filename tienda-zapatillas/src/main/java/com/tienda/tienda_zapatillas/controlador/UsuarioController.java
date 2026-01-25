package com.tienda.tienda_zapatillas.controlador;
import com.tienda.tienda_zapatillas.model.Usuario;
import com.tienda.tienda_zapatillas.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("usuarios", service.listar());
        return "usuarios/list";
    }

    @GetMapping("/nuevo")
    public String crearForm(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuarios/form";
    }

    @PostMapping
    public String guardar(@Valid @ModelAttribute Usuario usuario, BindingResult result) {
        if (result.hasErrors()) {
            return "usuarios/form";
        }
        service.guardar(usuario);
        return "redirect:/usuarios";
    }

    @GetMapping("/{id}/editar")
    public String editarForm(@PathVariable Long id, Model model) {
        Usuario u = service.obtener(id).orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado: " + id));
        model.addAttribute("usuario", u);
        return "usuarios/form";
    }

    @PostMapping("/{id}")
    public String actualizar(@PathVariable Long id, @Valid @ModelAttribute Usuario usuario, BindingResult result) {
        if (result.hasErrors()) {
            return "usuarios/form";
        }
        usuario.setId(id);
        service.guardar(usuario);
        return "redirect:/usuarios";
    }

    @PostMapping("/{id}/borrar")
    public String borrar(@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/usuarios";
    }
}
