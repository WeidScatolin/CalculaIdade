🕒 Calculadora de Idade

Um mini-projeto simples e direto que calcula a idade de uma pessoa com base no ano de nascimento. Feito pra treinar lógica básica, entrada de dados e manipulação de atributos em Java.

❓ O que faz?

O programa recebe um nome e um ano de nascimento e retorna a idade atual da pessoa.
É perfeito para entender como criar métodos específicos dentro de uma classe e usá-los no Main.

⚙️ Como funciona

A classe IdadePessoa guarda o nome e o ano de nascimento.

Ela possui um método chamado calcularIdade(), que faz a conta usando o ano atual.

No Main, você cria um objeto dessa classe, define seus atributos e pede para calcular a idade.

O resultado aparece no terminal.

Simples, direto e ótimo pra treinar lógica.

🧩 Exemplo de código
IdadePessoa p1 = new IdadePessoa();

p1.setNome("Maria");
p1.setAnoNascimento(2000);

int idade = p1.calcularIdade();

System.out.println("Nome: " + p1.getNome());
System.out.println("Idade: " + idade);

🚀 Funcionalidades

Guardar nome e ano de nascimento

Calcular idade atual automaticamente

Exibir os dados no console

Treinar getters, setters e métodos úteis

🛠️ Tecnologias

Java 17+

Qualquer IDE (IntelliJ, VSCode, Eclipse…)

▶️ Como usar

Abra o projeto na sua IDE.

Compile os arquivos IdadePessoa.java e Main.java.

Rode a classe Main.

Veja a idade sendo calculada no terminal.

📚 O que aprendi

Como criar métodos com retorno (int calcularIdade())

Uso de atributos privados com getters/setters

Lógica simples de cálculo

Encapsulamento básico

Instanciar objetos e chamar métodos no Main

💡 Contribuições

Algumas ideias legais pra evoluir:

Calcular idade considerando mês e dia (mais preciso)

Criar um menu pra digitar valores pelo console

Permitir calcular a idade de várias pessoas

Validar ano de nascimento para não aceitar números absurdos

✍️ Autor

Weid

⭐ Curtiu?

Se esse repositório te ajudou, deixa aquela estrela — ajuda demais!
