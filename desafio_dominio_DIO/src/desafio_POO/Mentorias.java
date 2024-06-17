package desafio_POO;

import java.time.LocalDate;

public class Mentorias extends estrutura {

    private LocalDate DataMentoria;


    public LocalDate getDataMentoria() {
        return DataMentoria;
    }


    public void setDataMentoria(LocalDate dataMentoria) {
        DataMentoria = dataMentoria;
    }


    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    } 

}
