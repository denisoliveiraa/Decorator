public class EscudoPesado extends DecoratorEscudo {

    private Personagem personagem;


    public EscudoPesado( Personagem personagem){
        this.personagem = personagem;
    }

    public double poder(){
        return this.personagem.poder() + 200;
    }

    public double agilidade(){
        return this.personagem.agilidade() + 100;
    }

    public double defesa(){
        return this.personagem.defesa() + 100;
    }

    public double magia(){
        return this.personagem.magia() + 0;
    }

    public String getNome(){
        return this.personagem.getNome() + "  Escudo: Escudo Pesado \n";
    }
}
