public class CalculadoraFinanciamento{
    public static void main(String []args){
     
      int valorDoCarro = 10000;
      int duracaoDoEmprestimo = 3; //a duração do empréstimo é de 3 anos
      int taxaJuros = 5;
      int valorEntrada = 2000;
     
     if(duracaoDoEmprestimo <=0 || taxaJuros <=0){
         System.out.println("Erro! Você deve fazer um empréstimo de carro válido");
     } else if (valorEntrada >= valorDoCarro){
         System.out.println("O carro pode ser pago integralmente");
     }else{
         int saldoRestante = valorDoCarro - valorEntrada;
         int numeroDeMeses = duracaoDoEmprestimo * 12;
         int saldoMensal = saldoRestante / numeroDeMeses; //paamento mensal sem juros incluídos
         int juros = saldoMensal * taxaJuros / 100;
         int pagamentoMensal = saldoMensal + juros;
         System.out.println(pagamentoMensal);
     }
     
    }
} 
