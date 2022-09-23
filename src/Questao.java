public class Questao {
    private String enunciado;
    private String alternativa01;
    private String alternativa02;
    private String alternativa03;
    private String alternativa04;
    private int gabarito;

    //criando o construtor

    public Questao(String enunciado, String alternativa01, String alternativa02,
                   String alternativa03, String alternativa04, int gabarito) {
        this.enunciado = enunciado;
        this.alternativa01 = alternativa01;
        this.alternativa02 = alternativa02;
        this.alternativa03 = alternativa03;
        this.alternativa04 = alternativa04;
        this.gabarito = gabarito;
    }

    public void mostrar(){ //Exibe o enunciado e mostra as alternativas
        System.out.println("Questão: "+this.enunciado);
        System.out.println("1) "+alternativa01);
        System.out.println("2) "+alternativa02);
        System.out.println("3) "+alternativa03);
        System.out.println("4) "+alternativa04);
    }

    public boolean estaCorreto(int resposta){
        if(gabarito==resposta){
            return true;
        } else{
            return false;
        }
    }
}
