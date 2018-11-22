using System;

namespace CSUma
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            decimal primernumero = readDecimal("Primer numero: ");
            decimal segundonumero = readDecimal("Segundo numero: ");
            decimal suma = primernumero + segundonumero;
            Console.WriteLine("Suma es ");


            Console.Write("Primer numero: ");
            string stringPrimerNumero = Console.ReadLine();
            int primernumero = int.Parse(stringPrimerNumero);

            Console.Write("Segundo numero: ");
            string stringSegundoNumero = Console.ReadLine();
            Decimal segundonumero = Decimal.Parse(stringSegundoNumero);

            Console.WriteLine(primernumero + segundonumero);

        }
    }
}
