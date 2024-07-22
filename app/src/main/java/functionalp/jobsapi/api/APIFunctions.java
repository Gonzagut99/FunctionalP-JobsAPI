package functionalp.jobsapi.api;

import feign.Feign;
import feign.gson.GsonDecoder;

public interface APIFunctions {
    static <T> T buildApi(Class<T> apiClass, String url) {
        return Feign.builder() //Construimos cliente web
                .decoder(new GsonDecoder()) //Decodificamos la respuesta en JSON
                .target(apiClass, url); //Indicamos la interfaz y la URL base de la API que queremos consumir
    }
}
