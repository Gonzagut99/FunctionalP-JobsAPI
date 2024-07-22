package functionalp.jobsapi.dto;

// {

import java.util.List;
import java.util.Objects;

//     "id": 2,
//     "name": "Morty Smith",
//     "status": "Alive",
//     "species": "Human",
//     "type": "",
//     "gender": "Male",
//     "origin": {
//       "name": "Earth",
//       "url": "https://rickandmortyapi.com/api/location/1"
//     },
//     "location": {
//       "name": "Earth",
//       "url": "https://rickandmortyapi.com/api/location/20"
//     },
//     "image": "https://rickandmortyapi.com/api/character/avatar/2.jpeg",
//     "episode": [
//       "https://rickandmortyapi.com/api/episode/1",
//       "https://rickandmortyapi.com/api/episode/2",
//       // ...
//     ],
//     "url": "https://rickandmortyapi.com/api/character/2",
//     "created": "2017-11-04T18:50:21.651Z"
//   }

public class CartoonCharacter {
    private int id;

    private String name;

    private String status;

    private String species;

    private String type;

    private String gender;

    private Origin origin;

    private Location location;

    private String image;

    private List<String> episode;

    private String url;

    private String created;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<String> getEpisode() {
        return episode;
    }

    public void setEpisode(List<String> episode) {
        this.episode = episode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.status);
        hash = 53 * hash + Objects.hashCode(this.species);
        hash = 53 * hash + Objects.hashCode(this.type);
        hash = 53 * hash + Objects.hashCode(this.gender);
        hash = 53 * hash + Objects.hashCode(this.origin);
        hash = 53 * hash + Objects.hashCode(this.location);
        hash = 53 * hash + Objects.hashCode(this.image);
        hash = 53 * hash + Objects.hashCode(this.episode);
        hash = 53 * hash + Objects.hashCode(this.url);
        hash = 53 * hash + Objects.hashCode(this.created);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CartoonCharacter other = (CartoonCharacter) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.species, other.species)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        if (!Objects.equals(this.image, other.image)) {
            return false;
        }
        if (!Objects.equals(this.url, other.url)) {
            return false;
        }
        if (!Objects.equals(this.created, other.created)) {
            return false;
        }
        if (!Objects.equals(this.origin, other.origin)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return Objects.equals(this.episode, other.episode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CartoonCharacter{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", status=").append(status);
        sb.append(", species=").append(species);
        sb.append(", type=").append(type);
        sb.append(", gender=").append(gender);
        sb.append(", origin=").append(origin);
        sb.append(", location=").append(location);
        sb.append(", image=").append(image);
        sb.append(", episode=").append(episode);
        sb.append(", url=").append(url);
        sb.append(", created=").append(created);
        sb.append('}');
        return sb.toString();
    }


}