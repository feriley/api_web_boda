package com.example.boda_api.repository;

import com.example.boda_api.model.Invitacion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InvitacionRepository extends MongoRepository<Invitacion, String> {
}
