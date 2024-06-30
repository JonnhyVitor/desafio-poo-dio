public class Curso {
    private  String Titulo;
    private  String Descricao;
    private  int CargaHoraria;
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
    public String getDescricao() {
        return Descricao;
    }
    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }
    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public String toString() {
        return " Curso:  " + Titulo + "\nDescrição: " + Descricao + "\nCarga Horária: " + CargaHoraria;
    }


}
