public class IdadePessoa {
    private String nome;
    private int idade;
    ///  getters
    ///
    public String getName() {
        return nome;
    }

    public int getAge() {
        return idade;
    }

    ///  setters
    public void setName(String nome) {
        this.nome = nome;
    }

    public void setAge(int idade) {
        this.idade = idade;
    }

    public void verificarIdade(){
        if (idade <= 18) {
            System.out.println("Você é menor de idade");
        } else {
            System.out.println("Você é maior de idade");
        }
    }



}
