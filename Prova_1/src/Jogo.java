
public class Jogo {
    private int id;
    private String nome;
    private String studio;
    private String descricao;
    
    public void ligar(){
        System.out.println("Ligando...");
    }

    public void desligar(){
        System.out.println("Desligando...");
    }

    private String mostrarStudio(){
        return studio;
    }
    
    public String retMostrarStudio(){
        return mostrarStudio();
    }

    public Jogo(int id, String nome, String studio, String descricao) {
        this.id = id;
        this.nome = nome;
        this.studio = studio;
        this.descricao = descricao;
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
    public String getStudio() {
        return studio;
    }
    public void setStudio(String studio) {
        this.studio = studio;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
