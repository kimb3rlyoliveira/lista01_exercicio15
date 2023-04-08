import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double renda;
        double horas;
        double renda_bruta;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira quanto você ganha por hora: ");
        renda = teclado.nextDouble();
        System.out.print("Insira as horas trabalhadas no mês: ");
        horas = teclado.nextDouble();
        teclado.close();

        renda_bruta = renda*horas;
        System.out.println(" ");
        System.out.println("+ Salário Bruto: R$" + renda_bruta);
        System.out.println("- IR (11%): R$" + renda_bruta*0.11);
        System.out.println("- INSS (8%): R$" + renda_bruta*0.08);
        System.out.println("- Sindicato (5%): R$" + renda_bruta*0.05);
        System.out.println("= Salário Liquido: R$" + ((renda_bruta)-(renda_bruta*0.24)));
    }
}