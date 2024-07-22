package functionalp.jobsapi.cli;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class CLIKeywordValidator implements IParameterValidator{
    @Override
    public void validate(String name, String value) throws ParameterException {
        if (!value.matches("^[a-zA-Z]+[0-9]*$")) {
            System.err.println("Search critiria is not valid");
            throw new ParameterException("Parameter " + name + " should be a valid keyword but is '" + value + "'"+ ". It should start with a letter and can have numbers");
        }
    }
}
