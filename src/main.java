public class main {
    public static void main(String[] args){
        Cavaleiro jose = new Cavaleiro();

        EspadaRaio joseEspada = new EspadaRaio(jose);
        EscudoPesado joseEscudo = new EscudoPesado(joseEspada);
        System.out.println(joseEscudo.getNome());
        System.out.println("Poder Total: "+ joseEscudo.poder());
        System.out.println("Agilidade: "+ joseEscudo.agilidade());
        System.out.println("Magia: " + joseEscudo.magia());
        System.out.println("Defesa: " + joseEscudo.defesa());
        System.out.println("---------------------- \n");

        Bruxo pedrao = new Bruxo();
        EspadaRaio pedraoEspada = new EspadaRaio(pedrao);
        SemEscudo pedraoEscudo = new SemEscudo(pedraoEspada);
        System.out.println(pedraoEscudo.getNome());
        System.out.println("Poder Total: " + pedraoEscudo.poder());
        System.out.println("Agilidade: "+ pedraoEscudo.agilidade());
        System.out.println("Magia: " + pedraoEscudo.magia());
        System.out.println("Defesa: " + pedraoEscudo.defesa());



    }
}
