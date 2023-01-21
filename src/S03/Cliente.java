//package S03;
//
//public class Cliente {
//
//    static double pesoPaciente;
//    static double alturaPaciente;
//    static double idadePaciente;
//
//
//    public static void main(String[] args){
//        Cliente objetoCliente = new Cliente();
//        Cliente.pesoPaciente = 100;
//        Cliente.alturaPaciente = 1.800;
//        Cliente.idadePaciente = 100;
//
//        CalculoIMC(pesoPaciente, alturaPaciente);
//    }
//
//    public static void CalculoIMC(double peso, double altura){
//        double IMC = peso/(Math.pow(altura, 2));
//
//        if(IMC<= 18.5) {
//            System.out.println("Muito Magro");
//        } else if (IMC <  25) {
//            System.out.println("Normal");
//        } else if (IMC <  30) {
//            System.out.println("Sobrepeso");
//        } else if (IMC <  35) {
//            System.out.println("Obesidade Grau I");
//        } else if (IMC <  40) {
//            System.out.println("Obesidade Grau II");
//        } else{
//            System.out.println("Obesidade Grau I");
//        }
//    }
//}
