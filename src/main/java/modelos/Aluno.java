package modelos;
public class Aluno {
    private String nome;
    private String curso;
    private String ra;

    public Aluno(){

    }

    public boolean buscarAluno(String ra){
        if (this.ra.equals(ra)){
            return true;
        }
        return false;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getRa(){
        return ra;
    }
    public void setRa(String ra){
        this.ra = ra;
    }

    @Override
    public String toString(){
        System.out.println("====== Dados de " + nome + " ======");
        return "RA: " + ra + "\nCurso: " + curso;
    }
}