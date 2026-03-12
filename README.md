![Satellite Management System](project-banner.png.jpg)
# Satellite Management System

A Spring Boot backend project for managing satellites and missions.

## Features
- Add Satellite
- Get Satellites
- Delete Satellite
- REST APIs
- Layered Architecture

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## API Endpoints

GET /satellites  
POST /satellites  
DELETE /satellites/{id}

## Example Request

{
 "name": "Hubble",
 "mission": "Space Telescope",
 "launchDate": "1990",
 "orbitType": "Low Earth Orbit"
}
