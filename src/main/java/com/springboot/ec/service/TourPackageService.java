package com.springboot.ec.service;


import org.springframework.stereotype.Service;

import com.springboot.ec.domain.TourPackage;
import com.springboot.ec.repo.TourPackageRepository;

@Service
public class TourPackageService {
    private TourPackageRepository tourPackageRepository;

    public TourPackageService(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    /**
     * Create a Tour Package
     *
     * @param code code of the package
     * @param name name of the package
     *
     * @return new or existing tour package
     */
    public TourPackage createTourPackage(String code, String name) {    	
        return tourPackageRepository.findById(code)
        		.orElse(tourPackageRepository.save(new TourPackage(code, name)))  ;
    }

    /**
     * Lookup All Tour packages
     *
     * @return all tour packages
     */
    public Iterable<TourPackage> lookup(){
        return tourPackageRepository.findAll();
    }

    public long total() {
        return tourPackageRepository.count();
    }
}
