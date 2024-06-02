public class CadastroPortaria {
    static final int TEMPO_EXPIRACAO_PADRAO_EM_MESES = 1;
    //Cadastro de visitantes para a portaria do prédio.



    void cadastrar(final Visitante visitante){
        this.cadastrar(visitante, TEMPO_EXPIRACAO_PADRAO_EM_MESES);
    }



    void cadastrar(final Visitante visitante,final int tempoExpiracaoEmMeses){

    final int tempoExpiracaoEmDias;
    tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

    System.out.printf("Visitante %s cadastrado para %d dias%n", visitante.nome, tempoExpiracaoEmDias);


}


}
