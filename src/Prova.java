import java.util.Scanner;

public class Prova {
    private Aluno candidato;
    private Questao q1, q2, q3, q4, q5;
    private int resposta01, resposta02, resposta03, resposta04, resposta05;
    private int nota;


    public Prova(Aluno candidato, Questao q1, Questao q2,
                 Questao q3, Questao q4, Questao q5) {
        this.candidato = candidato;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
    }

    public int getNota() {
        return nota;
    }

    public void aplicarProva(){
        Scanner aux = new Scanner(System.in);
        q1.mostrar();
        resposta01 = aux.nextInt();
        q2.mostrar();
        resposta02 = aux.nextInt();
        q3.mostrar();
        resposta03 = aux.nextInt();
        q4.mostrar();
        resposta04 = aux.nextInt();
        q5.mostrar();
        resposta05 = aux.nextInt();
    }

    public void corrigirProva(){
        nota = 0;
        if (q1.estaCorreto(resposta01)){
            nota++;
        }
        if (q2.estaCorreto(resposta02)){
            nota++;
        }
        if (q3.estaCorreto(resposta03)){
            nota++;
        }
        if(q4.estaCorreto(resposta04)){
            nota++;
        }
        if (q5.estaCorreto(resposta05)){
            nota++;
        }
        nota *= 2;
    }

    public void mostrarNota(){
        System.out.println("Nota do aluno: "+nota);
    }


}
