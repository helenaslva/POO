using System.Globalization;

namespace ProjetoQuatroUdemy
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Digite o valor em dolar: ");
            double valorEmReal = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
            Console.WriteLine("Digite a cotação atual do dolar: ");
            double cotacao = double.Parse(Console.ReadLine(),CultureInfo.InvariantCulture);

            double valorEmDolar = ConversosDolar.Convert(cotacao, valorEmReal);
            Console.WriteLine("O valor a ser pago é R$:" + valorEmDolar.ToString("F2", CultureInfo.InvariantCulture));
        }
    }
}