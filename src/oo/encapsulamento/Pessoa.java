package oo.encapsulamento;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private Integer idade;

    public Pessoa(String nome, String sobrenome, Integer idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNomeCompleto() {
        return getNome() + " " + getSobrenome();
    }

    @Override
    public String toString() {
        return "Ola, eu sou o " + this.getNomeCompleto() + " e tenho " + this.getIdade() + " anos";
    }
}
