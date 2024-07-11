package com.alura.forohub.topico;

public record DatosMostrarTopico(Long id, String titulo, String mensaje, String fecha) {

    public DatosMostrarTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha());
    }
}