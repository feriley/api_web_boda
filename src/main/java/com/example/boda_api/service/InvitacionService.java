package com.example.boda_api.service;

import com.example.boda_api.model.Invitacion;
import com.example.boda_api.repository.InvitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvitacionService {

    @Autowired
    private InvitacionRepository repository;

    public Invitacion saveInvitacion(Invitacion invitacion) {
        return repository.save(invitacion);
    }

    public List<Invitacion> findAll() {
        return repository.findAll();
    }
}
