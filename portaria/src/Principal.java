public class Principal {

    public static void main(String[] args) {
        var novoVisitante = new Visitante();
        novoVisitante.nome = "Lucas";
        novoVisitante.idade = 29;

        var cadastroPortaria = new CadastroPortaria();
        cadastroPortaria.cadastrar(novoVisitante, 2);



    }




}
