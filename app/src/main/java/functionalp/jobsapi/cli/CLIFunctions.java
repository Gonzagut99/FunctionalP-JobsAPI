package functionalp.jobsapi.cli;

import java.util.HashMap;
import java.util.Map;


public class CLIFunctions {
    public static Map<String, Object> toMap(CLIArguments cliArguments) {
        Map<String, Object> params = new HashMap<>();
        params.put("name", cliArguments.getName());
        params.put("status", cliArguments.getStatus());
        params.put("species", cliArguments.getSpecies());
        params.put("type", cliArguments.getType());
        params.put("gender", cliArguments.getGender());
        params.put("page", cliArguments.getPage());
        params.put("description", cliArguments.getKeyword());

        if (cliArguments.isMarkdown()) {
            params.put("markdown", cliArguments.isMarkdown());
        }

        return params;
    
    }

}
