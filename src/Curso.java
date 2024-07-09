import br.com.dio.desafio.dominio.Conteudo;

public class Curso extends Conteudo {
    private  int CargaHoraria;

    @Override
    public double CaucularXp() {
        return XP_PADRAO + CargaHoraria;
    }

      public Curso(){

      };

    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }
    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public String toString() {
        return " Curso:  " + getTitulo() + "\nDescrição: " + getDescricao() + "\nCarga Horária: " + CargaHoraria;
    }

}
