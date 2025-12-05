public class Main {
    static void main(String[] args) {
        IdadePessoa idadePessoa = new IdadePessoa();

        idadePessoa.setName("Weid");
        idadePessoa.setAge(22);
        /// temos somente uma pessoa aqui , mas poderiamos ter  pessoa 1, 2 , 3 , 4 , 5, 6 e instanciar o objeto "IDADEPESSOA" para criar outra pessoa com os mesmo atributos.

        System.out.println("O seu nome é :" + idadePessoa.getName());
        System.out.println("A sua ídade é :" + idadePessoa.getAge());
        idadePessoa.verificarIdade();


    }
}