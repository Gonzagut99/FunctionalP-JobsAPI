package functionalp.jobsapi.dto;

import lombok.Data;

//     "info": {
//       "count": 826,
//       "pages": 42,
//       "next": "https://rickandmortyapi.com/api/character/?page=2",
//       "prev": null
//     },

@Data
public class Info {
    private int count;
    private int pages;
    private String next;
    private String prev;
}
