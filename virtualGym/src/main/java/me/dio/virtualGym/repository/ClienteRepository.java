package me.dio.virtualGym.repository;

import me.dio.virtualGym.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByDataDeNascimento(LocalDate dataDeNascimento);
}
