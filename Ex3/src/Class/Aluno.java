package Class;

public class Aluno {

    private String nome;
    private String matricula;
    private float notaAv1;
    private float notaAv2;
    private float notaAE;
    private String curso;
    private String periodo;

    public Aluno(String nome, String matricula, float notaAv1, float notaAv2, float notaAE, String curso, String periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
        this.notaAE = notaAE;
        this.curso = curso;
        this.periodo = periodo;
    }

    public void setNotaAv1(float notaAv1) {
        this.notaAv1 = notaAv1;
    }

    public void setNotaAv2(float notaAv2) {
        this.notaAv2 = notaAv2;
    }

    public void setNotaAE(float notaAE) {
        this.notaAE = notaAE;
    }

    public void avaliarAluno(){
    if (notaAv1+notaAv2>=60){
        System.out.println("Aluno Aprovado");
    }else{
        System.out.println("Aluno Reprovado");
    }
    }

    public void avaliarRecuperacao(){
        float media = notaAv1+notaAv2+notaAE/3;
        if (media>=60){
            System.out.println("Aluno Aprovado");
        }else{
            System.out.println("Aluno Reprovado");
        }
    }



}



