package functionalp.jobsapi.dto;

import java.util.List;


public class PaginatedCharacters {
    private Info info;
    private List<CartoonCharacter> results;
    public Info getInfo() {
        return info;
    }
    public void setInfo(Info info) {
        this.info = info;
    }
    public List<CartoonCharacter> getResults() {
        return results;
    }
    public void setResults(List<CartoonCharacter> results) {
        this.results = results;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((info == null) ? 0 : info.hashCode());
        result = prime * result + ((results == null) ? 0 : results.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PaginatedCharacters other = (PaginatedCharacters) obj;
        if (info == null) {
            if (other.info != null)
                return false;
        } else if (!info.equals(other.info))
            return false;
        if (results == null) {
            if (other.results != null)
                return false;
        } else if (!results.equals(other.results))
            return false;
        return true;
    }
}
