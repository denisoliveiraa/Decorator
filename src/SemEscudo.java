public class SemEscudo extends DecoratorEscudo {

    private Personagem personagem;

    public SemEscudo(Personagem personagem){

        this.personagem = personagem;
    }

    public double poder() {
        return this.personagem.poder() * 2;
    }

    public double agilidade(){
        return this.personagem.agilidade() + 300;
    }

    public double defesa(){
        return this.personagem.defesa();
    }

    public double magia(){
        return this.personagem.magia();
    }

    public String getNome(){
        return this.personagem.getNome() + "  Escudo: Sem escudo (Espadas duplicadas) \n";
    }
}
