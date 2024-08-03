package com.example.identity.client.service;

import com.example.identity.client.exception.EntityDataSaveException;
import com.example.identity.persistence.entity.PhoneEntity;
import com.example.identity.persistence.repository.PhoneRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author Max.Jimenez
 */
@Service
public class PhoneService {

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    private PhoneRepository repository;

    public PhoneService(PhoneRepository repository) {
        this.repository = repository;
    }

    public PhoneEntity save(PhoneEntity instance) {
        try {
            return repository.save(instance);
        } catch (EntityDataSaveException e) {
            LOG.error("Error in create", e);
            throw new EntityDataSaveException(instance);
        }
    }
}
