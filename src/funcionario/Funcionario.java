/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

/**
 *
 * @author LENOVO
 */
public class Funcionario {
    // encapsulamento protege os dados.
    private String nome;
    private String cargo;
    private String cpf;
    private String telefone;
    private String endereco;
    private String bairro;
    private String cidade;
    private String dataNascimento;
    // constructor usado para criar um novo funcionario
    public Funcionario(String nome, String cargo, String cpf, String telefone,
            String endereco, String bairro, String cidade, String dataNascimento) {
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.dataNascimento = dataNascimento;
    }

    // usado para mostrar a lista completa de funcionarios
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    
    // usado para alterar dados dos funcionarios
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
