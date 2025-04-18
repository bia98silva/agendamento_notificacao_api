package com.bia98silva.agendamento_notificacao_api.controller;

import com.bia98silva.agendamento_notificacao_api.dto.in.AgendamentoRecord;
import com.bia98silva.agendamento_notificacao_api.dto.out.AgendamentoRecordOut;
import com.bia98silva.agendamento_notificacao_api.service.AgendamentoService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agendamento")
public class AgendamentoController{

private final AgendamentoService agendamentoService;

    public AgendamentoController(AgendamentoService agendamentoService) {
        this.agendamentoService = agendamentoService;
    }

    @PostMapping
    public ResponseEntity<AgendamentoRecordOut> gravarAgendamentos(@RequestBody AgendamentoRecord agendamento){
        return ResponseEntity.ok(agendamentoService.gravarAgendamento(agendamento));}


    @GetMapping("/{id}")
    public ResponseEntity<AgendamentoRecordOut> buscarAgendamentoPorId(@PathVariable("id")Long id){
                return ResponseEntity.ok(agendamentoService.buscarAgendamentosPorid(id));}

}


