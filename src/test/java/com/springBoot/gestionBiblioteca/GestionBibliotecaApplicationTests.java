package com.springBoot.gestionBiblioteca;


import static org.mockito.Mockito.*;

import com.springBoot.gestionBiblioteca.repository.*;
import com.springBoot.gestionBiblioteca.service.UsuarioService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class GestionBibliotecaApplicationTests {


	StatusRepository statusRepository;
	PrestamoRepository prestamoRepository;
	MultaRepository multaRepository;
	LibroRepository libroRepository;
	BaseRepository baseRepository;



	@Test
	void contextLoads() {
	}

}
