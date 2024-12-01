package javaapplication6;

public class Main {
      // Método principal
    public static void main(String[] args) {
        CheckInSystem sistema = new CheckInSystem();

        // Adiciona alguns clientes
        sistema.adicionarCliente(new Cliente(1, "João"));
        sistema.adicionarCliente(new Cliente(2, "Maria"));
        sistema.adicionarCliente(new Cliente(3, "Pedro"));
        

        // Seleciona e exibe todos os clientes
        System.out.println("Todos os clientes: ");
        sistema.selecionarClientes();

        // Atualiza o status de check-in do cliente com ID 1
        sistema.atualizarCheckIn(1, true);

        // Seleciona e exibe todos os clientes após a atualização
        System.out.println("\nClientes após a atualização: ");
        sistema.selecionarClientes();

        // Deleta o cliente com ID 2
        sistema.deletarCliente(2);

        // Seleciona e exibe todos os clientes após a exclusão
        System.out.println("\nClientes após a exclusão: ");
        sistema.selecionarClientes();
    }
}  