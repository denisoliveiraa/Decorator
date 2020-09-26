public class EspadaRaio extends DecoratorEspada {
    private Personagem personagem;

    public EspadaRaio(Personagem personagem){
        this.personagem = personagem;
    }


    public double poder(){
        return this.personagem.poder() + 50;
    }

    public double defesa(){
        return this.personagem.defesa() + 5;
    }

    public double agilidade(){
        return this.personagem.agilidade() + 50;
    }

    public double magia(){
        return this.personagem.magia() + 75;
    }

    public String getNome(){
        return this.personagem.getNome() + "  Arma: Espada de Raio \n";
    }
}
