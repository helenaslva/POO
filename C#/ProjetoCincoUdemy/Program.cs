using System.Security.Cryptography.X509Certificates;

namespace ProjetoCincoUdemy
{
    internal class Program
    {
        static void Main(string[] args)
        {
            ContaBancaria conta;
            Console.WriteLine("Entre com o número da conta: ");
            long numero = long.Parse(Console.ReadLine());
            Console.WriteLine("Entre com o titular da conta: ");
            string titular = Console.ReadLine();
            Console.WriteLine("Haverá depósito inicial? (s/n): ");
            char resposta = char.Parse(Console.ReadLine());

            if(resposta == 's')
            {
                Console.WriteLine("Digite o saldo inicial: ");
                double saldoInicial = double.Parse(Console.ReadLine()); 
                conta = new ContaBancaria(numero, titular, saldoInicial);
            }
            else
            {
                conta = new ContaBancaria(numero, titular);
            }
               

            Console.WriteLine(conta.ToString());
        }
    }
}