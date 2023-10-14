namespace ByteBankAtendimento
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] idades = new int[5];
            idades[0] = 30;
            idades[1] = 40;
            idades[2] = 20;
            idades[3] = 10;
            idades[4] = 40;


            int RetornaMediaIdades(int[] idades)
            {
                int somaIdades = 0;
                int media = 0;

                for (int i = 0; i<idades.Length; i++)
                {
                   somaIdades += idades[i];
                }

                media = somaIdades / idades.Length;

                return media;
            }

            void BuscarPalavras()
            {
                string[] palavras = new string[5];
                Boolean encontrou = false;

                for (int i = 0;i<palavras.Length;i++)
                {
                    Console.Write($"Digite a {i+1}ª palavra: ");
                    palavras[i] = Console.ReadLine();
                }

                Console.WriteLine("Digite palavra a ser encontrada: ");
                var busca = Console.ReadLine(); 

                foreach (string s in palavras)
                {
                    if (s.Equals(busca))
                    {
                        encontrou = true;
                    }
                    
                }
                if (encontrou)
                {
                    Console.WriteLine($"Palavra encontrada = {busca}");
                }
                else
                {
                    Console.WriteLine("Palavra não encontrada");
                }
                
            }

            Array amostra = Array.CreateInstance(typeof(double), 5);
            amostra.SetValue(5.9, 0);
            amostra.SetValue(6.5, 0);
            amostra.SetValue(3.2, 0);
            amostra.SetValue(8.1, 0);
            amostra.SetValue(10, 0);


            Console.WriteLine(RetornaMediaIdades(idades));
            BuscarPalavras();
        }
    }
}