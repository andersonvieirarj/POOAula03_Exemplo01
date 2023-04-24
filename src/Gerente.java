public class Gerente extends Funcionario{
    private int horasMais;
    private int horasTrab;

    public int getHorasMais() {
        return horasMais;
    }

    public void setHorasMais(int horasMais) {
        this.horasMais = horasMais;
    }

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }
    //Método de cálculo do salário do gerente:
    public void calcularSalarioGerente(){
        double salarioFinal;
        salarioFinal = (horasTrab + horasMais) * 85;
        System.out.println("Salário Final: " + salarioFinal);
    }

}
