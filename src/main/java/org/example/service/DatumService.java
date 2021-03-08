package org.example.service;

import org.example.data.Datum;
import org.example.data.UsersList;
import org.example.repository.DatumRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class DatumService implements DatumRepository {

    private final RestTemplate restTemplate;

    @Value("${taskUrl}")
    private String url;

    public DatumService(){
        restTemplate = new RestTemplate();
    }

    @Override
    public List<Datum> getAllUsers() {
        ResponseEntity<UsersList> forEntity = restTemplate.getForEntity(url,UsersList.class);
        return forEntity.getBody().getData();
    }
}
