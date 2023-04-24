public class Administrativo extends Funcionario{
    private int horasTrab;
    private int horasEx;
    private double valorHoras;

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    public int getHorasEx() {
        return horasEx;
    }

    public void setHorasEx(int horasEx) {
        this.horasEx = horasEx;
    }

    public double getValorHoras() {
        return valorHoras;
    }
    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras;
    }
    // Método do Cálculo de Administrativo
    public double calculoSalarioAdm (){
        double salarioFinal;
        salarioFinal = (horasTrab + horasEx) * valorHoras;
        return salarioFinal;
    }







}
