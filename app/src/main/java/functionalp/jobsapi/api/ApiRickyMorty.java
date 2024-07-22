package functionalp.jobsapi.api;

import java.util.Map;

import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;
import functionalp.jobsapi.dto.PaginatedCharacters;

@Headers("Accept: application/json")
public interface  ApiRickyMorty {
    
    @RequestLine("GET /character/")
    PaginatedCharacters characters(@QueryMap Map<String, Object> queryMap);
}
