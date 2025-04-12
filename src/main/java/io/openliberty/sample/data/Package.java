package io.openliberty.sample.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Package {
    
    @Id
    public Integer id;

    public String destination;

    public Package() {

    }

    public Package(Integer id, String destination) {
        this.id = id;
        this.destination = destination;
    }
}
