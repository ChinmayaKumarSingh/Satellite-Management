
package com.example.satellite.controller;

import com.example.satellite.model.Satellite;
import com.example.satellite.service.SatelliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/satellites")
public class SatelliteController {

 @Autowired
 private SatelliteService service;

 @GetMapping
 public List<Satellite> getSatellites(){
  return service.getAllSatellites();
 }

 @PostMapping
 public Satellite addSatellite(@RequestBody Satellite satellite){
  return service.addSatellite(satellite);
 }

 @DeleteMapping("/{id}")
 public void deleteSatellite(@PathVariable Long id){
  service.deleteSatellite(id);
 }
}
