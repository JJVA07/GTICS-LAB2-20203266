package com.example.lab220203266.controlador;

import com.example.lab220203266.entidad.Jugador;
import com.example.lab220203266.repositorio.JugadorRepository;
import com.example.lab220203266.repositorio.SeleccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jugador")
public class JugadorController {

    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private SeleccionRepository seleccionRepository;

    @GetMapping("/list")
    public String listar(Model model) {
        model.addAttribute("listaJugadores", jugadorRepository.findAll());
        return "jugador/list";
    }

    @GetMapping("/new")
    public String listar(Model model) {
        model.addAttribute("jugador", new Jugador());
        model.addAttribute("selecciones", seleccionRepository.findAll());
        return "jugador/newForm";
    }
    @PostMapping("/save")
    public String guardarJugador(@ModelAttribute("jugador") Jugador jugador) {
        jugadorRespository.save(jugador);
        return "redirect:/jugador/list";
    }
    }@GetMapping("/new")
    public String listar(Model model) {
        model.addAttribute("jugador", new Jugador());
        model.addAttribute("selecciones", seleccionRepository.findAll());
        return "jugador/newForm";
    }
}