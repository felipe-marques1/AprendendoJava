/* Programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (primeiro trimestre
vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o
aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para
ser aprovado (que é 60% da nota).
 */


package application;

import entities.Studant;

import java.util.Locale;
import java.util.Scanner;

public class _3Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Studant studant = new Studant();

        studant.name = sc.nextLine();
        studant.grade1 = sc.nextDouble();
        studant.grade2 = sc.nextDouble();
        studant.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n" , studant.finalGrade());

        if (studant.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n" , studant.missingPoints());
        }
        else {
            System.out.println("PASS");
        }
        sc.close();

    }
}
