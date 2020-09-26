public class EscudoLeve extends DecoratorEscudo{
    private Personagem personagem;

    public EscudoLeve(Personagem personagem){

        this.personagem = personagem;
    }

    public double poder(){
        return this.personagem.poder() + 100;
    }

    public double agilidade(){
        return this.personagem.agilidade() + 200;
    }

    public double defesa(){
        return this.personagem.defesa() + 50;
    }

    public double magia(){
        return this.personagem.magia() + 0;
    }

    public String getNome(){
        return this.personagem.getNome() + "  Escudo: Escudo Leve \n";
    }

}
