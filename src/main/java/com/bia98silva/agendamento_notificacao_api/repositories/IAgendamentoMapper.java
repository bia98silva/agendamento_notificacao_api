package com.bia98silva.agendamento_notificacao_api.repositories;

import com.bia98silva.agendamento_notificacao_api.dto.in.AgendamentoRecord;
import com.bia98silva.agendamento_notificacao_api.dto.out.AgendamentoRecordOut;
import com.bia98silva.agendamento_notificacao_api.entities.Agendamento;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Repository
@Mapper(componentModel = SPRING)
public interface IAgendamentoMapper {

    Agendamento paraEntity(AgendamentoRecord agendamento);

    AgendamentoRecordOut paraOut(Agendamento agendamento);
}
