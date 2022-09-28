package br.com.fetchreceita.repository;

import br.com.fetchreceita.models.InfoReceitaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface InfoReceitaRepository extends JpaRepository<InfoReceitaModel, Long> {
    Optional<InfoReceitaModel> findByCnpj(String cnpj);
    Optional<InfoReceitaModel> findInfoReceitaById(Long id);
}
