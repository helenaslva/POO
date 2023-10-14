using System.Globalization;

namespace ProjetoTresUdemy
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Produto p = new Produto();

            string _nome;
            double _preco;
            int _quantidade;

            Console.WriteLine("Entre com os dados do produto: ");
            Console.WriteLine("Nome: ");
            p.Nome = Console.ReadLine();
            Console.WriteLine("Preço: ");
            p.Preco = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
            Console.WriteLine("Quantidade: ");
            p.Quantidade = int.Parse(Console.ReadLine());

            Console.WriteLine("Dados do produto: " + p.ToString());
            Console.WriteLine("Digite a quantiade de produtos a serem adicionados: ");
            int quantidade = int.Parse(Console.ReadLine());
            p.AdiconarProdutos(quantidade);
            Console.WriteLine("Dados atualizados: " + p.ToString());
            Console.WriteLine("Digite a quantiade de produtos a serem removidos: ");
            int quantiadeRemov = int.Parse(Console.ReadLine());
            p.RemoverProdutor(quantiadeRemov);
            Console.WriteLine("Dados atualizados: " + p.ToString());

        }
    }
}