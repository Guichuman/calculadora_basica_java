import java.util.*;

public class Calc {
    static public void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Numero x = new Numero(0);
        Numero y = new Numero(0);
        Numero z = new Numero(0);

        Operacao op = new Operacao("");

        System.out.printf("%n------ CALCULADORA ------%n");
        System.out.printf(" ");
        x.setValor(scan.nextInt());

        System.out.printf(" ");
        op.setOp(scan.next());

        System.out.printf(" ");
        y.setValor(scan.nextInt());

        switch (op.getOp()) {
            case "+":
                z.setValor(x.getValor() + y.getValor());
                System.out.printf("%nRESULTADO: %d", z.getValor());
                break;
            case "-":
                z.setValor(x.getValor() - y.getValor());
                System.out.printf("%nRESULTADO: %d", z.getValor());
                break;
            case "*":
                z.setValor(x.getValor() * y.getValor());
                System.out.printf("%nRESULTADO: %d", z.getValor());
                break;
            case "/":
                z.setValor(x.getValor() / y.getValor());
                System.out.printf("%nRESULTADO: %d", z.getValor());
                break;
            default:
                System.out.printf("%nInsira umas das quatro operações basicas (+, -, *, /)");

        }
    }

}