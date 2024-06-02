# portaria-digital
Este projeto contém um mini sistema para gerenciar o cadastro de visitantes na portaria de um prédio.

Classe Visitante
A classe Visitante armazena o nome e a idade do visitante.

Classe CadastroPortaria
A classe CadastroPortaria realiza o cadastro de visitantes, definindo o tempo de expiração do cadastro. O tempo de expiração é definido em meses, e o sistema calcula automaticamente o equivalente em dias.

Uso
Para usar o sistema, você pode criar um objeto da classe Visitante e definir o nome e a idade do visitante. Em seguida, você pode criar um objeto da classe CadastroPortaria e usar o método cadastrar() para realizar o cadastro do visitante.

O método cadastrar() possui duas versões:

cadastrar(Visitante visitante): Cadastra o visitante com o tempo de expiração padrão de 1 mês.
cadastrar(Visitante visitante, int tempoExpiracaoEmMeses): Cadastra o visitante com o tempo de expiração especificado em meses.

Visitante visitante = new Visitante();
visitante.nome = "Lucas";
visitante.idade = 29;

CadastroPortaria cadastroPortaria = new CadastroPortaria();
cadastroPortaria.cadastrar(visitante, 2);

