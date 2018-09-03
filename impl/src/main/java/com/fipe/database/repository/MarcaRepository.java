package com.fipe.database.repository;

import com.fipe.database.model.Marca;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends PagingAndSortingRepository<Marca, Long> {
}
