package io.openliberty.sample.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Package {
    
    @Id
    public int id;

    public String destination;

    public Package() {

    }

    public Package(int id, String destination) {
        this.id = id;
        this.destination = destination;
    }
}
