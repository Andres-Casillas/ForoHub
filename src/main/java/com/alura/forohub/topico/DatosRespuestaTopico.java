package com.alura.forohub.topico;

public record DatosRespuestaTopico (Long id, String titulo, String mensaje, String fecha, String autor, String curso) {

    public DatosRespuestaTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha(), topico.getAutor(), topico.getCurso());
    }
}
