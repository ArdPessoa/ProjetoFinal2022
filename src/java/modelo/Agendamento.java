package modelo;

import java.sql.Time;


public class Agendamento{
    
    private long id;
    private Time horainicio; 
    private Time horafim;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    private long idservico;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Time getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(Time horainicio) {
        this.horainicio = horainicio;
    }

    public Time getHorafim() {
        return horafim;
    }

    public void setHorafim(Time horafim) {
        this.horafim = horafim;
    }

    public long getIdservico() {
        return idservico;
    }

    public void setIdservico(long idservico) {
        this.idservico = idservico;
    }
    
    
    
}