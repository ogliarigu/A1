package imc.prova.controller;


import imc.prova.service.service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/imc")
    public ResponseEntity<?> calculadora(@RequestParam Double peso, Double altura) {

        return ResponseEntity.ok(service.calculadora(peso,altura));
    }
}
