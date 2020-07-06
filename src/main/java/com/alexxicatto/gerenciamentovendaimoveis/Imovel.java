package com.alexxicatto.gerenciamentovendaimoveis;


public class Imovel {
    
    private String nomeCompleto;
    private String descricao;
    private String categoria;
    private String tipo;
    private String valorVenda;
    
    public Imovel() {
            
    }

    public Imovel(
            String nomeCompleto, 
            String descricao, 
            String categoria, 
            String tipo, 
            String valorVenda) {
        
        this.nomeCompleto = nomeCompleto;
        this.descricao = descricao;
        this.categoria = categoria;
        this.tipo = tipo;
        this.valorVenda = valorVenda;
    }
    
    

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(String valorVenda) {
        this.valorVenda = valorVenda;
    }
}
