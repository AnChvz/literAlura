//package com.aluracursos.literalura.controller;
//
//import com.aluracursos.literalura.model.Autor;
//import com.aluracursos.literalura.model.DatosLibro;
//import com.aluracursos.literalura.service.LibroService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//public class LibroController {
//
//    @Autowired
//    private LibroService libroService;
//
//    @GetMapping("/buscar")
//    public DatosLibro buscarLibroPorTitulo(@RequestParam String titulo) {
//        return libroService.buscarLibroPorTitulo(titulo);
//    }
//
//    @GetMapping("/libros")
//    public List<DatosLibro> listarLibros() {
//        return libroService.listarLibros();
//    }
//
//    @GetMapping("/autores")
//    public List<Autor> listarAutores() {
//        return libroService.listarAutores();
//    }
//
//    @GetMapping("/autores/vivos")
//    public List<Autor> listarAutoresVivosEnAnio(@RequestParam int anio) {
//        return libroService.listarAutoresVivosEnAnio(anio);
//    }
//
//    @GetMapping("/libros/idioma/{idioma}")
//    public List<DatosLibro> listarLibrosPorIdioma(@PathVariable String idioma) {
//        return libroService.listarLibros().stream()
//                .filter(libro -> libro.idiomas().size()> 0 && libro.idiomas().get(0).equalsIgnoreCase(idioma))
//                .collect(Collectors.toList());
//    }
//}
