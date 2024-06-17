package desafio_POO;

public class Cursos extends estrutura {


    private double CargaHoraria;



    public double getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP() {
       return XP_PADRAO * CargaHoraria;
    }
    

   







    

}
