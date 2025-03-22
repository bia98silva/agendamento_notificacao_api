package com.bia98silva.agendamento_notificacao_api.repositories;


import com.bia98silva.agendamento_notificacao_api.entities.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
