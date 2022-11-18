package br.com.fiap.spring.dto;

import java.util.Date;

public class AgendamentoDTO {
    private int idAgendamento;
    private int idUsuario;
    private int idProfissionalEspecialidade;
    private Date dataHoraAgendamento;

    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdProfissionalEspecialidade() {
        return idProfissionalEspecialidade;
    }

    public void setIdProfissionalEspecialidade(int idProfissionalEspecialidade) {
        this.idProfissionalEspecialidade = idProfissionalEspecialidade;
    }

    public Date getDataHoraAgendamento() {
        return dataHoraAgendamento;
    }

    public void setDataHoraAgendamento(Date dataHoraAgendamento) {
        this.dataHoraAgendamento = dataHoraAgendamento;
    }
}
