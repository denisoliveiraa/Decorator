public class EspadaFogo extends DecoratorEspada{
    private Personagem personagem;

    public EspadaFogo( Personagem personagem){
        this.personagem = personagem;
    }

    public double poder() {
       return this.personagem.poder() + 100;
    }

    public double agilidade(){
        return this.personagem.agilidade() + 100;
    }

    public double defesa(){
        return this.personagem.defesa() + 10;
    }

    public double magia(){
        return this.personagem.magia() + 50;
    }

    public String getNome(){
        return this.personagem.getNome() + "  Arma: Espada de Fogo \n";
    }

}
