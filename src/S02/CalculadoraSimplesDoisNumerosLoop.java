//package S02;
//
//import java.util.Objects;
//import java.util.Scanner;
//
//public class CalculadoraSimplesDoisNumerosLoop {
//
//    public static void main(String args[]) {
//        // Using Scanner for Getting Input from User
//        Scanner in = new Scanner(System.in);
//
//        double resultado = 0;
//
//        System.out.println("Selecione a operação: 1 - Soma; 2 - Subtração; 3 - Multiplicação; 4 - Divisão.");
//        String operacaoEscolhida = in.nextLine();
//
//        while(!Objects.equals(operacaoEscolhida, "fim")) {
//            System.out.println("Digite o primeiro numero para operar:");
//            double x = Integer.parseInt(in.nextLine());
//
//            System.out.println("Digite o segundo numero para operar:");
//            double y = Integer.parseInt(in.nextLine());
//
//            switch (operacaoEscolhida) {
//                case "1":
//                    resultado = x + y;
//                    break;
//                case "2":
//                    resultado = x - y;
//                    break;
//                case "3":
//                    resultado = x * y;
//                    break;
//                case "4":
//                    resultado = x / y;
//                    break;
//                default:
//                    System.out.println("Operação Invalida, tente novamente...");
//            }
//            System.out.println("Seu resultado é " + resultado);
//            System.out.println("Selecione a operação: 1 - Soma; 2 - Subtração; 3 - Multiplicação; 4 - Divisão. Ou ainda digite 'fim' para finalizar");
//            operacaoEscolhida = in.nextLine();
//
//            resultado = 0;
//        }
//
//        System.out.println("Calculadora terminada");
//
//    }
//
//}