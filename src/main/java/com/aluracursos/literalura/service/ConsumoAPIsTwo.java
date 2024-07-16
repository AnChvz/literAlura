package com.aluracursos.literalura.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConsumoAPIsTwo {

    public static void main(String[] args) {
        System.out.println("Inicio del programa");
        try {
            HttpClient client = HttpClient.newBuilder()
                    .followRedirects(HttpClient.Redirect.ALWAYS)//Para seguir las redirecciones
                    .build();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://gutendex.com/books" ))
                    .build();

            System.out.println("Solicitud HTTP creada");
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Esperando la respuesta");
            if (response.statusCode() == 200) {
                System.out.println("Respuesta recibida");
                // Parsear la respuesta JSON
                ObjectMapper mapper = new ObjectMapper();
                JsonNode jsonResponse = mapper.readTree(response.body());

                // Mostrar la respuesta JSON en formato legible
                System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonResponse));
            } else {
                System.out.println("Error en la solicitud: " + response.statusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Fin del programa");
    }
}
