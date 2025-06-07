package com.example.boda_api.controller;

import com.example.boda_api.model.Invitacion;
import com.example.boda_api.service.InvitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invitaciones")
@CrossOrigin(origins = {"http://localhost:5173", "https://web-boda-xi.vercel.app", "https://boda-fatima-y-pepe.vercel.app/"})

public class InvitacionController {

    @Autowired
    private InvitacionService invitacionService;

    @PostMapping
    public ResponseEntity<Invitacion> createInvitacion(@RequestBody Invitacion invitacion) {
        Invitacion savedInvitacion = invitacionService.saveInvitacion(invitacion);
        return new ResponseEntity<>(savedInvitacion, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Invitacion> getAllInvitaciones() {
        return invitacionService.findAll();
    }
}
