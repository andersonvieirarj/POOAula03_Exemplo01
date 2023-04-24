import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int opcao = 0;
        while (opcao != 4){
            System.out.println ("Informe a opção desejada: ");
            System.out.println ("1 - Gerente");
            System.out.println ("2 - Administrativo");
            System.out.println ("3 - Estagiário");
            System.out.println ("4 - Sair");
            opcao = Integer.parseInt(entrada.nextLine());
            if (opcao==1){
                Gerente g = new Gerente();
                g.setNome("Flavia");
                g.setBairro("Pinheiros");
                g.setIdade(20);
                g.setHorasTrab(40);
                g.setHorasMais(5);
                g.calcularSalarioGerente();
            }
            else if (opcao == 2) {
                Administrativo a = new Administrativo();
                a.setNome("David");
                a.setBairro("Vila Madalena");
                a.setIdade(20);
                a.setHorasTrab(40);
                a.setHorasEx(10);
                a.setValorHoras(65);
                System.out.println("Salário Calculado: " + a.calculoSalarioAdm());
            }
            else if (opcao==3) {
                Estagiario e = new Estagiario();
                System.out.println("Digite o seu nome:");
                e.setNome(entrada.nextLine());
                System.out.println("Digite o seu bairro: ");
                e.setBairro(entrada.nextLine());
                System.out.println("Digite o seu idade: ");
                e.setIdade(Integer.parseInt(entrada.nextLine()));
                System.out.println("Digite quantos meses você estagiou? ");
                e.setMesesEst(Integer.parseInt(entrada.nextLine()));
                System.out.println("Digite quantas horas mensais de estágio? ");
                e.setHorasEst(Integer.parseInt(entrada.nextLine()));

                System.out.println("Total de Estágio:" + e.quantHorasEstagio());








            }
        }

    }
}