package jovan.jakimovski.mypetclinic.services.map;

import jovan.jakimovski.mypetclinic.model.Pet;
import jovan.jakimovski.mypetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

//implements CrudService - po default because that's where the crud methods definitions are... and we are just inheriting that methods from the AbstractMapService
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
