
public class Jogador {
    private int id;
    private String nome;
    private String nickName;
    private String cpf;

    public void ligacao() {
        System.out.println("Alô?...");
    }

    public void saudacao(){
        System.out.println("Suave?");
    }

    private String hate(){
        String hate = "Ahhhhhhhhh... Aprende a jogaaar!!!!";
        return hate;
    }

    public void retHate(){
        System.out.print(hate());
    }

    public Jogador(int id, String nome, String nickName, String cpf) {
        this.id = id;
        this.nome = nome;
        this.nickName = nickName;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}
