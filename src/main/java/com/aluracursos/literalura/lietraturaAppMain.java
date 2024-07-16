//package com.aluracursos.literalura;
//
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
////implements CommandLineRunnner
////Permite definir código que se ejecutará automáticamente cuando se inicie la aplicación.
//@SpringBootApplication
//public class lietraturaAppMain implements CommandLineRunner {
//
//    public static void main(String[] args) {
//        SpringApplication.run(LiteraluraApplication.class, args);
//
//    }
//    //Metodo para el CommandLine
//    @Override
//    public void run(String... args) throws Exception {
//        mostrarMenu();
//    }
//
//    private void mostrarMenu() {
//        Scanner scanner = new Scanner(System.in);
//        int opcion;
//
//        do {
//            System.out.println("""
//				Menu de Opciones:
//				1. Libro por título
//				2. Listar libros registrados
//				3. Listar autores registrados
//				4. Listar autores registrados que están vivos en un determinado año
//				5. Listar libros registrados por idioma
//				0. Salir
//				Seleccione una opción:
//				""");
//
//            try{
//                opcion = scanner.nextInt();
//                scanner.nextLine();  // Consume newline
//                System.out.println(opcion);
//
//                switch (opcion) {
//                    case 1:
//                        buscarLibroPorTitulo(scanner);
//                        break;
//                    case 2:
//                        listarLibrosRegistrados();
//                        break;
//                    case 3:
//                        listarAutoresRegistrados();
//                        break;
//                    case 4:
//                        listarAutoresVivosPorAno(scanner);
//                        break;
//                    case 5:
//                        listarLibrosPorIdioma(scanner);
//                        break;
//                    case 0:
//                        System.out.println("Saliendo del programa...");
//                        break;
//                    default:
//                        System.out.println("Opción no válida, por favor intente de nuevo.");
//                }
//
//            } catch (InputMismatchException e){
//                System.out.println("Opción no válida, por favor intente de nuevo.");
//                scanner.nextLine();  // Consume the invalid input
//                opcion = -1;  // Set to an invalid option to keep the loop running
//            }
//        } while (opcion != 0);
//
//        scanner.close();
//    }
//
//    private void buscarLibroPorTitulo(Scanner scanner) {
//        System.out.print("Ingrese el título del libro: ");
//        String titulo = scanner.nextLine();
//
//        System.out.println(titulo);
//    }
//
//    private void listarLibrosRegistrados() {
//        System.out.println("listarLibrosRegistrados");
//    }
//
//    private void listarAutoresRegistrados() {
//        System.out.println("listarAutoresRegistrados");
//    }
//
//    private void listarAutoresVivosPorAno(Scanner scanner) {
//        System.out.print("Ingrese el año: ");
//        int year = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println(year);
//    }
//
//    private void listarLibrosPorIdioma(Scanner scanner) {
//        System.out.print("Ingrese el idioma: ");
//        String idioma = scanner.nextLine();
//        System.out.println(idioma);
//    }
//}