package br.com.uniguacu.SpringRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.uniguacu.SpringRestApi.model.Alum;

public interface IAlumRepository extends JpaRepository <Alum, Long> {
    
}
