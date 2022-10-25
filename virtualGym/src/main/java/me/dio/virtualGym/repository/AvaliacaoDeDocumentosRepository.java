package me.dio.virtualGym.repository;

import me.dio.virtualGym.entity.AvaliacaoDeDocumentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository;
public interface AvaliacaoDeDocumentosRepository extends JpaRepository<AvaliacaoDeDocumentos, Long> {
}
