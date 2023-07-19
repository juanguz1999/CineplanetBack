package com.cineplanet.back.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cineplanet.back.models.mdl_censura;
import com.cineplanet.back.repository.itf_rpt_censura;

@Service
public class svc_censura {
    @Autowired
    itf_rpt_censura repository;

    public Boolean saveCensura(mdl_censura censura) {
        try {
            repository.save(censura);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public List<mdl_censura> getCensuraById(int id) {
        return repository.findById(id);
    }

    public List<mdl_censura> getCensuras() {
        return repository.findAll();
    }
}
