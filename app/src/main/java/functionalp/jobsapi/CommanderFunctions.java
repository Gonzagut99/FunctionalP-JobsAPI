package functionalp.jobsapi;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

public class CommanderFunctions {
    static JCommander buildCommander(Object object){
        return JCommander.newBuilder()
                .addObject(object)
                .build();
    }

    static <T> JCommander buildCommanderWithName(String cliName, Supplier<T> argumentSupplier){
        JCommander jCommander = buildCommander(argumentSupplier.get());
        jCommander.setProgramName(cliName);
        return jCommander;
    }

    static Optional<List<Object>> parseArguments(JCommander jCommander, String[] args, OnCommandError onCommandError){
        try{
            jCommander.parse(args);
            return Optional.of(jCommander.getObjects());
        }catch (ParameterException e){
            System.out.println(e.getMessage());
            onCommandError.onError(jCommander);
            //jCommander.usage();
        }
        return Optional.empty();
    }

    @FunctionalInterface
    interface OnCommandError{
        void onError(JCommander jCommander);
    }
}
