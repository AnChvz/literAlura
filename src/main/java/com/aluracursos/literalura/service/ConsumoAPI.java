// Ubicación: src/main/java/com/aluracursos/literalura/service/ConsumoAPI.java
package com.aluracursos.literalura.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConsumoAPI {

    public String obtenerDatos(String url) {
        String resultado = "" ;
        try {
            HttpClient client = HttpClient.newBuilder()
                    .followRedirects(HttpClient.Redirect.ALWAYS)
                    .build();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                ObjectMapper mapper = new ObjectMapper();
                JsonNode jsonResponse = mapper.readTree(response.body());

               // resultado = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonResponse);

                // Obtener el array 'results'
                JsonNode resultsNode = jsonResponse.get("results");
                if (resultsNode.isArray() && resultsNode.size() > 0) {
                    // Tomar el primer elemento del array 'results'
                    JsonNode libroNode = resultsNode.get(0);
                    // Convertir el nodo del libro a JSON string
                    resultado = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(libroNode);
                } else {
                    resultado = "No se encontraron libros en la respuesta.";
                }
                } else {
                resultado = "Error en la solicitud: " + response.statusCode();
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultado = "Error al obtener los datos de la API: " + e.getMessage();
        }
        return resultado;
    }
}
