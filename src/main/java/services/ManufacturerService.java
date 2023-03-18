package services;

import entities.Manufacturer;

import repositories.ManufacturerRepository;


import java.util.List;

public class ManufacturerService {

    private ManufacturerRepository repo;

    public ManufacturerService(ManufacturerRepository repo) {
        this.repo = repo;
    }

    public Manufacturer create (Manufacturer entity){
        return repo.create(entity);
    }

    public Manufacturer update (Manufacturer entity, Long aLong){
        return repo.update(entity,aLong);
    }

    public Manufacturer delete(Manufacturer entity, Long aLong){
        return repo.delete(entity, aLong);
    }

    public Manufacturer findByID(Manufacturer entity, Long aLong){
        return repo.findByID(entity, aLong);
    }

    public List<Manufacturer> findAll(){
        return repo.findAll();
    }
}
