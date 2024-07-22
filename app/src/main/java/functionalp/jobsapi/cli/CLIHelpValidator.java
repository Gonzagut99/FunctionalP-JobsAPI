package functionalp.jobsapi.cli;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class CLIHelpValidator implements IParameterValidator {
    @Override
    public void validate(String name, String value) throws ParameterException {
        //boolean actualValue = Boolean.parseBoolean(value);
        if (!value.equalsIgnoreCase("help")) {
            throw new ParameterException("Parameter " + name + " should be 'help' but is '" + value + "'");
        }
    }
    
}
