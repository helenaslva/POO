using System.Globalization;

namespace ProjetoDoisUdemy
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Funcionario f1 = new Funcionario();
            Funcionario f2 = new Funcionario();

            Console.WriteLine("Escreva o nome do primeiro funcionário: ");
            f1.Nome = Console.ReadLine();
            Console.WriteLine("Escreva o salario do primeiro funcionário: ");
            f1.Salario = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
            Console.WriteLine("Escreva o nome do Segundo funcionário: ");
            f2.Nome = Console.ReadLine();
            Console.WriteLine("Escreva o salario do segundo funcionário: ");
            f1.Salario = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);

            double media = (f1.Salario + f2.Salario) / 2.0;
            Console.WriteLine("A média dos salários é: " + media.ToString("F2"), CultureInfo.InvariantCulture);

        }
    }
}