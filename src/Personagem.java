public abstract class Personagem {
    protected String nome;
    protected double poder;
    protected double defesa;
    protected double agilidade;
    protected double magia;

    public abstract double agilidade();
    public abstract double defesa();
    public abstract double poder();
    public abstract double magia();


    public String getNome(){
        return this.nome;
    }



}
