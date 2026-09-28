
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //  início
        int dI, hI, mI, sI;

        //  fim
        int dF, hF, mF, sF;

        // cálculos
        int inicio, fim, duracao;
        int dias, horas, minutos, segundos;

        scanner.next(); // ignora  "Dia"
        dI = scanner.nextInt();

        hI = scanner.nextInt();
        scanner.next(); // ignora o ":"

        mI = scanner.nextInt();
        scanner.next();

        sI = scanner.nextInt();

        scanner.next(); // ignora  "Dia"
        dF = scanner.nextInt();

        hF = scanner.nextInt();
        scanner.next(); // ignora o ":"

        mF = scanner.nextInt();
        scanner.next();

        sF = scanner.nextInt();

        inicio = dI * 86400 + hI * 3600 + mI * 60 + sI;
        fim = dF * 86400 + hF * 3600 + mF * 60 + sF;

        duracao = fim - inicio;

        dias = duracao / 86400;

        duracao = duracao % 86400;

        horas = duracao / 3600;

        duracao = duracao % 3600;

        minutos = duracao / 60;

        segundos = duracao % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
    }
}
