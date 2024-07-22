package functionalp.jobsapi.cli;

import com.beust.jcommander.Parameter;

// @NoArgsConstructor
// @AllArgsConstructor
// @Data
public class CLIArguments {

    

    public CLIArguments() {
    }

    @Parameter(
        required = true,
        descriptionKey = "KEYWORD",
        validateWith=CLIKeywordValidator.class,
        description = "KEYWORD"
    )
    private String keyword;

    @Parameter(
        names={"--name", "-n"},
        description = "Name of the character"
    )
    private String name;

    @Parameter(
        names={"--status", "-s"},
        description = "Status of the character"
    )
    private String status;

    @Parameter(
        names={"--species", "-sp"},
        description = "Species of the character"
    )
    private String species;

    @Parameter(
        names={"--type", "-t"},
        description = "Type of the character"
    )
    private String type;

    @Parameter(
        names={"--gender", "-g"},
        description="Character gender"
    )
    private String gender;

    @Parameter(
        names={"--page", "-p"},
        description = "API returns some results per page, enter a number to get the page"
    )
    private int page = 0;

    @Parameter(
        names={"--markdown", "-md"},
        description = "Markdown output"
    )    
    private boolean isMarkdown = false;

    @Parameter(
        names={"--help", "-h"},
        help = true,
        validateWith=CLIHelpValidator.class,
        description = "Displays help"
    )
    private boolean isHelp;


    public String getKeyword() {
        return keyword;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getSpecies() {
        return species;
    }

    public String getType() {
        return type;
    }

    public String getGender() {
        return gender;
    }

    public int getPage() {
        return page;
    }

    public boolean isMarkdown() {
        return isMarkdown;
    }

    public boolean isHelp() {
        return isHelp;
    }

    public static CLIArguments newInstance() {
        return new CLIArguments();
    }  

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CLIArguments{");
        sb.append("keyword=").append(keyword);
        sb.append(", name=").append(name);
        sb.append(", status=").append(status);
        sb.append(", species=").append(species);
        sb.append(", type=").append(type);
        sb.append(", gender=").append(gender);
        sb.append(", page=").append(page);
        sb.append(", isMarkdown=").append(isMarkdown);
        sb.append(", isHelp=").append(isHelp);
        sb.append('}');
        return sb.toString();
    }

}
