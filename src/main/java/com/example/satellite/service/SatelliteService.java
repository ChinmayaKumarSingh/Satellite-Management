
package com.example.satellite.service;

import com.example.satellite.model.Satellite;
import com.example.satellite.repository.SatelliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SatelliteService {

 @Autowired
 private SatelliteRepository repository;

 public List<Satellite> getAllSatellites(){
  return repository.findAll();
 }

 public Satellite addSatellite(Satellite satellite){
  return repository.save(satellite);
 }

 public void deleteSatellite(Long id){
  repository.deleteById(id);
 }
}
