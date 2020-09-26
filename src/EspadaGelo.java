public class EspadaGelo extends DecoratorEspada {
    private Personagem personagem;

    public EspadaGelo(Personagem personagem){
        this.personagem = personagem;
    }

    public double poder(){
        return this.personagem.poder() + 300;
    }

    public double agilidade(){
        return this.personagem.agilidade() + 20;
    }

    public double defesa(){
        return this.personagem.defesa() + 50;
    }

    public double magia(){
        return this.personagem.magia() + 50;
    }

    public String getNome(){
        return this.personagem.getNome() + "  Arma: Espada de Gelo \n";
    }

}
