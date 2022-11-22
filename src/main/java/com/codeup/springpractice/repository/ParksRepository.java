package com.codeup.springpractice.repository;

import com.codeup.springpractice.models.NationalPark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParksRepository extends JpaRepository<NationalPark, Long> {

}


