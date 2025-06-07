package com.mercadinho.mercadinho_uniesp.controller;

import com.mercadinho.mercadinho_uniesp.feign.ViaCepClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cep")

public class CEPController {

    private final ViaCepClient viaCepClient;

    @GetMapping("/{cep}")
    public ResponseEntity<?> buscarEndereco(@PathVariable String cep) {
        return ResponseEntity.ok(viaCepClient.buscarEndereco(cep));
    }
}
