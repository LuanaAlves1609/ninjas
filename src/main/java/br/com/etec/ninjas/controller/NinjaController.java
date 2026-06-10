package br.com.etec.ninjas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.etec.ninjas.model.Ninja;
import br.com.etec.ninjas.service.NinjaService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @PostMapping
    public Ninja cadastrarNinja(@Valid @RequestBody Ninja ninja){
        return ninjaService.cadastrarNinja(ninja);

    }

    @GetMapping
    public List<Ninja> listarNinjas(){
        return ninjaService.listarNinjas();
    }
    
}
