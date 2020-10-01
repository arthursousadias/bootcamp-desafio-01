package com.arthurdias.desafio01.desafio01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arthurdias.desafio01.desafio01.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
