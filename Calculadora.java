public class Calculadora {

    int numero1;
    int numero2;

    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int somar() {
        return numero1 + numero2;
    }

    public int subtrair() {
        return numero1 - numero2;
    }

    public int multiplicar() {
        return numero1 * numero2;
    }

    public double dividir() {
        return (double) numero1 / numero2;
    }

    public void mostrarResultados() {
        System.out.println("Adição: " + somar());
        System.out.println("Subtração: " + subtrair());
        System.out.println("Multiplicação: " + multiplicar());
        System.out.println("Divisão: " + dividir());
        
    }

    public static void main(String args[]) {
        int numero1 = Integer.parseInt(args[0]);
        int numero2 = Integer.parseInt(args[1]);

        Calculadora calc = new Calculadora(numero1, numero2);
        calc.mostrarResultados();
    }
}
