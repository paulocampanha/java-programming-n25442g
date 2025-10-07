package aula19.array1;

public class Vetor1 {
    public static void main(String args[]){

        double[] notas = new double[4];

        notas[0] = 10.0;
        notas[1] = 5.0;
        notas[2] = 8.5;
        notas[3] = 7.5;
        double somaNotas = 0;

        for (double nota : notas){
            System.out.println("Nota: " + nota);
            somaNotas += nota;
        }
        double media = somaNotas / 4;
        System.out.println("A média foi: " + media);
        
    }
}
