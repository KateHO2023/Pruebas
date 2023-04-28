package com.springBoot.gestionBiblioteca.service;

import com.springBoot.gestionBiblioteca.repository.UsuarioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest

class UsuarioServiceImpTest {

    UsuarioRepository usuarioRepository;
    UsuarioServiceImp usuarioServiceImp;


    @BeforeEach
    void setUp() {
        usuarioRepository = mock(UsuarioRepository.class);
        usuarioServiceImp = new UsuarioServiceImp(usuarioRepository);

    }

    @Test
    void prestarLibro() {
        when(usuarioRepository.findById(1)).thenReturn();
        when(UsuarioServiceImp.findById(1)).thenReturn();
    }

    @Test
    void buscarConDocumento() {
    }

    @Test
    void prestamos() {
    }

    @Test
    void devolverLibro() {
    }
}