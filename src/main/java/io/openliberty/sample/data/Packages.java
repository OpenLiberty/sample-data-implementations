package io.openliberty.sample.data;

import jakarta.data.repository.Repository;
import jakarta.data.repository.BasicRepository;

@Repository
public interface Packages extends BasicRepository<Package, Integer> {

}
