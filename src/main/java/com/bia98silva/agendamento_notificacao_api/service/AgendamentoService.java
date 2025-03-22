package com.bia98silva.agendamento_notificacao_api.service;

import com.bia98silva.agendamento_notificacao_api.dto.in.AgendamentoRecord;
import com.bia98silva.agendamento_notificacao_api.dto.out.AgendamentoRecordOut;
import com.bia98silva.agendamento_notificacao_api.exception.NotFoundException;
import com.bia98silva.agendamento_notificacao_api.repositories.AgendamentoRepository;
import com.bia98silva.agendamento_notificacao_api.mapper.IAgendamentoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AgendamentoService {

    private final AgendamentoRepository repository;
    private final IAgendamentoMapper agendamentoMapper;

    public AgendamentoRecordOut gravarAgendamento(AgendamentoRecord agendamento){
       return agendamentoMapper.paraOut(
               repository.save(
                       agendamentoMapper.paraEntity(agendamento)));
    }

    public AgendamentoRecordOut buscarAgendamentosPorid(Long id){
        return agendamentoMapper.paraOut(repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Id não encontrado")));
    }



}
