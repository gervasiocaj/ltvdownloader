package com.gervasiocaj.ltvdownloader.models;

public class SearchResult {

    Source _source;

    public Source get_source() {
        return _source;
    }

    public void set_source(Source _source) {
        this._source = _source;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "_source=" + _source +
                '}';
    }

    public static class Source {
        String id_filme;
        String id_imdb;
        String tipo;

        String dsc_imagen;
        String dsc_nome;
        String dsc_nome_br;
        String dsc_sinopse;
        String dsc_data_lancamento;
        String dsc_url_imdb;
        String temporada;

        public String getId_filme() {
            return id_filme;
        }

        public void setId_filme(String id_filme) {
            this.id_filme = id_filme;
        }

        public String getId_imdb() {
            return id_imdb;
        }

        public void setId_imdb(String id_imdb) {
            this.id_imdb = id_imdb;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getDsc_imagen() {
            return dsc_imagen;
        }

        public void setDsc_imagen(String dsc_imagen) {
            this.dsc_imagen = dsc_imagen;
        }

        public String getDsc_nome() {
            return dsc_nome;
        }

        public void setDsc_nome(String dsc_nome) {
            this.dsc_nome = dsc_nome;
        }

        public String getDsc_nome_br() {
            return dsc_nome_br;
        }

        public void setDsc_nome_br(String dsc_nome_br) {
            this.dsc_nome_br = dsc_nome_br;
        }

        public String getDsc_sinopse() {
            return dsc_sinopse;
        }

        public void setDsc_sinopse(String dsc_sinopse) {
            this.dsc_sinopse = dsc_sinopse;
        }

        public String getDsc_data_lancamento() {
            return dsc_data_lancamento;
        }

        public void setDsc_data_lancamento(String dsc_data_lancamento) {
            this.dsc_data_lancamento = dsc_data_lancamento;
        }

        public String getDsc_url_imdb() {
            return dsc_url_imdb;
        }

        public void setDsc_url_imdb(String dsc_url_imdb) {
            this.dsc_url_imdb = dsc_url_imdb;
        }

        public String getTemporada() {
            return temporada;
        }

        public void setTemporada(String temporada) {
            this.temporada = temporada;
        }

        @Override
        public String toString() {
            return "Source{" +
                    "dsc_nome='" + dsc_nome + '\'' +
                    '}';
        }
    }
}
