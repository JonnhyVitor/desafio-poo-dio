import br.com.dio.desafio.dominio.Conteudo;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public double CaucularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria:"
                +getTitulo()+
                "\n data: " + data +
                 "\n descriacao:" + getDescricao();
    }

    public Mentoria(){

    }


}



