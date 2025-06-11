/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepositorio {
    // cria minha lista de funcionarios
    private static List<Funcionario> funcionarios = new ArrayList<>();
    // adciona um novo funcionario
    public static void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }
    // apresenta minha lista
    public static List<Funcionario> getListaFuncionarios() {
        return funcionarios;
    }
    // atualiza dados da lista
    public static void atualizarFuncionario(int indice, Funcionario funcionarioAtualizado) {
        // verificação
        if (indice >= 0 && indice < funcionarios.size()) {
        funcionarios.set(indice, funcionarioAtualizado);
    } else {
        System.out.println("Índice inválido para atualização.");
    }
}
    // remove funcionario
    public static void removerFuncionario(Funcionario f) {
        funcionarios.remove(f);
    }
}
