using System.Globalization;

namespace ProjetoTresUdemy
{
    internal class Produto
    {
        public string Nome { get; set; }
        public double Preco { get; set; }
        public int Quantidade { get; set; }

        public double ValorTotalEmEstoque()
        {
            double precoTotal = Quantidade * Preco;
            return precoTotal;
        }
         public void AdiconarProdutos(int quantidade)
        {
            Quantidade += quantidade;
        }

        public void RemoverProdutor(int quantidade)
        {
            Quantidade -= quantidade;
        }

        public override string? ToString()
        {
            return
                "Nome: " + Nome + "\n\r" +
                "Preço: R$ " + Preco + "\n\r" +
                "Quantiade " + Quantidade + "\n\r" +
                "Valor em estoque: R$ " + ValorTotalEmEstoque().ToString(CultureInfo.InvariantCulture);
;         }
    }
}
