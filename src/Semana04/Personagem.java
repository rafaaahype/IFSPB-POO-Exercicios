abstract class Personagem {
    private String nome;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void atacar();
}

class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " desfere um golpe poderoso com sua espada!");
    }
}

class Mago extends Personagem {
    public Mago(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " lança uma bola de fogo mágica!");
    }
}

class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " dispara uma flecha precisa à distância!");
    }
}

