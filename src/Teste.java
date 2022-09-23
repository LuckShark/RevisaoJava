public class Teste {
    public static void main(String[] args) {
        Questao q1 = new Questao("Maque o primeiro item:", "1",
                "Um","Primeiro","1º item",3);
        Questao q2 = new Questao("Vermelho em inglês", "Red",
                "Redd", "Rojo", "Redy", 1);
        Questao q3 = new Questao("Opção correta", "a",
                "b", "c", "d", 2);
        Questao q4 = new Questao("Opção incorreta", "a",
                "b", "c", "d", 3);
        Questao q5 = new Questao("Final acabando", "11",
                "22", "33", "44", 4);


        Aluno aluno1 = new Aluno("Lucas","666",24);
        Prova prova1 = new Prova(aluno1, q1,q2,q3,q4,q5);
        prova1.aplicarProva();
        prova1.corrigirProva();
        prova1.mostrarNota();

    }
}
