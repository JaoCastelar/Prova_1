public class Campeonato {
    private int id;
    private String nome;
    private String staff;
    private String patrocinadores;
    private int premio;

    public void chamada() {
        System.out.println("Chamando todos os guerreiros, já fizeram sua inscrição??");
    }

    public void propaganda() {
        System.out.println("A seguir nossos patrocinadores: " + patrocinadores);
    }

    private int premiacao() {
        return premio;
    }

    public void retpremiacao() {
        System.out.println(premiacao());
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

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public String getPatrocinadores() {
        return patrocinadores;
    }

    public void setPatrocinadores(String patrocinadores) {
        this.patrocinadores = patrocinadores;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }
    
}
