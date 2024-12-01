package javaapplication6;

// Classe para representar um cliente
class Cliente {
    private int id;
    private String nome;
    private boolean checkedIn;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.checkedIn = false;
    }

    // getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }
}