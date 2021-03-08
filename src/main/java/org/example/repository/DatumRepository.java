package org.example.repository;

import org.example.data.Datum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DatumRepository {
    List<Datum> getAllUsers();
}
