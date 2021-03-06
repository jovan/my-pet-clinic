package jovan.jakimovski.mypetclinic.services;

import java.util.Set;

//TYPE(OwnerService, PetService, VetService) ID (Long, Integer)
public interface CrudService<T, ID> {

    public Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
