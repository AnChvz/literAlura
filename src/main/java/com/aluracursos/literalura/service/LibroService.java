//package com.aluracursos.literalura.service;
//
//import com.aluracursos.literalura.model.Autor;
//import com.aluracursos.literalura.model.DatosLibro;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class LibroService {
//
//    private final List<DatosLibro> libros = new ArrayList<>();
//    private final List<Autor> autores = new ArrayList<>();
//    private final RestTemplate restTemplate = new RestTemplate();
//
//    public DatosLibro buscarLibroPorTitulo(String titulo) {
//        String url = "https://gutendex.com/books/?search=" + titulo;
//        DatosLibro[] resultados = restTemplate.getForObject(url, DatosLibro[].class);
//
//        if (resultados != null && resultados.length > 0) {
//            DatosLibro libro = resultados[0];
//            libros.add(libro);
//
//            if (libro.autores().size() > 0) {
//                Autor autor = libro.autores().get(0);
//                autores.add(autor);
//            }
//
//            return libro;
//        }
//        return null;
//    }
//
//    public List<DatosLibro> listarLibros() {
//        return libros;
//    }
//
//    public List<Autor> listarAutores() {
//        return autores;
//    }
//
//    public List<Autor> listarAutoresVivosEnAnio(int anio) {
//        List<Autor> autoresVivos = new ArrayList<>();
//        for (Autor autor : autores) {
//            if (autor.nacimiento() <= anio && (autor.muerte() == 0 || autor.muerte() > anio)) {
//                autoresVivos.add(autor);
//            }
//        }
//        return autoresVivos;
//    }
//}
