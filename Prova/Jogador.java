
class Jogador  {
    private String nome;
    private int votos;

    public Jogador(String nome) {
        this.nome = nome;
        this.votos = 1; 
        return;
    }

    public String getNome() {
        return this.nome;
    }

    public int getVotos() {
        return this.votos;
    }

    public void incrementarVotos() {
        this.votos++;
    }
}

