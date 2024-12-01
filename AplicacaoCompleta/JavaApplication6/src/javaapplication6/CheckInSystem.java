package javaapplication6;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

// Classe principal com métodos CRUD
public class CheckInSystem {
    private final ObjectContainer db;

    public CheckInSystem() {
        // Abre o banco de dados
        db = Db4o.openFile("clientes.db");
    }

    // Método para adicionar um cliente
    public void adicionarCliente(Cliente cliente) {
        db.store(cliente);
        db.commit();
    }

    // Método para selecionar todos os clientes
    public void selecionarClientes() {
        ObjectSet<Cliente> result = db.queryByExample(Cliente.class);
        while (result.hasNext()) {
            Cliente cliente = result.next();
            System.out.println("ID: " + cliente.getId() + ", Nome: " + cliente.getNome() + ", Checked-in: " + cliente.isCheckedIn());
        }
    }

    // Método para atualizar o status de check-in de um cliente
    public void atualizarCheckIn(int id, boolean checkedIn) {
        ObjectSet<Cliente> result = db.queryByExample(new Cliente(id, ""));
        if (result.hasNext()) {
            Cliente cliente = result.next();
            cliente.setCheckedIn(checkedIn);
            db.store(cliente);
            db.commit();
        } else {
            System.out.println("Cliente com ID " + id + " não encontrado.");
        }
    }

    // Método para deletar um cliente
    public void deletarCliente(int id) {
        ObjectSet<Cliente> result = db.queryByExample(new Cliente(id, ""));
        if (result.hasNext()) {
            Cliente cliente = result.next();
            db.delete(cliente);
            db.commit();
            System.out.println("Cliente com ID " + id + " deletado com sucesso.");
        } else {
            System.out.println("Cliente com ID " + id + " não encontrado.");
        }
    }
}