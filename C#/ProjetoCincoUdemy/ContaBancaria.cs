using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProjetoCincoUdemy
{
    internal class ContaBancaria
    {
        public ContaBancaria(long numero, string nome)
        {
            Numero = numero;
            Nome = nome;
            Saldo = 0.0;
        }
        public ContaBancaria(long numero, string nome, double saldo) : this(numero, nome)
        {

            Saldo = saldo;
        }

        public long Numero { get; private set; }
        public string Nome { get; set;}
        public double Saldo { get; private set; }

        public void Depositar(double valor)
        {
            Saldo += valor;
        }
        public void Sacar(double valor)
        {
            Saldo -= (valor + 5.0);
        }
        public override string? ToString()
        {
            return "Conta: " + Numero + "\r\n" +
                "Titular: " + Nome + "\r\n" +
                "Saldo: R$" + Saldo.ToString("F2", CultureInfo.InvariantCulture);
        }
    }
}
