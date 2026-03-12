
package com.example.satellite.model;

import jakarta.persistence.*;

@Entity
public class Satellite {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String name;
 private String mission;
 private String launchDate;
 private String orbitType;

 public Long getId() { return id; }
 public void setId(Long id) { this.id = id; }

 public String getName() { return name; }
 public void setName(String name) { this.name = name; }

 public String getMission() { return mission; }
 public void setMission(String mission) { this.mission = mission; }

 public String getLaunchDate() { return launchDate; }
 public void setLaunchDate(String launchDate) { this.launchDate = launchDate; }

 public String getOrbitType() { return orbitType; }
 public void setOrbitType(String orbitType) { this.orbitType = orbitType; }
}
