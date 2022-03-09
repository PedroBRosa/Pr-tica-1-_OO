package Class;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Pedro", "11713829",0.0f,0.0f,0.0f,"ADS","terceiro");
        aluno.setNotaAv1(10.0f);
        aluno.setNotaAv2(40.0f);
        aluno.setNotaAE(60.0f);
        aluno.avaliarAluno();
        aluno.avaliarRecuperacao();
    }


}
