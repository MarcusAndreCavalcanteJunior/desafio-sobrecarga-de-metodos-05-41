public class Principal {

    public static void main(String[] args) {
        var resultadoDoisNumerosInteiros = NumeroUtil.descobrirMaior(10, 25);
        System.out.println("Maior entre 2 numeros : " + resultadoDoisNumerosInteiros);

        var resultaspTresNumerosInteiros = NumeroUtil.descobrirMaior(5, 5, 15);
        System.out.println("Maior entre 3: " + resultaspTresNumerosInteiros);

        var resultadoDoisNumerosFlutuantes = NumeroUtil.descobrirMaior(6.6, 44.8);
        System.out.println("Maior entre 2 numeros ponto flutuante : "
                + resultadoDoisNumerosFlutuantes);

        var resultadoTresNumerosFlutuantes = NumeroUtil.descobrirMaior(0.5, 57.3, 21.4);
        System.out.println("Maior entre 3 numeros ponto flutuante : "
                + resultadoTresNumerosFlutuantes);

        double resultado = NumeroUtil.descobrirMaior(10, 25.0);
        System.out.println("Resultado : " + resultado);
    }
}
/* Aprendi nesse desafio que var aplicado ao desafio de sobrecarga de
métodos
var só se aplica a variáveis locais (declaradas dentro de métodos), nunca
a atributos de classe, parâmetros de metodo (fora de casos específicos)
ou tipos de retorno.
A resolução de sobrecarga acontece antes da inferência do var: o compilador
primeiro decide qual metodo sobrecarregado será chamado (baseado nos tipos
dos argumentos passados), e só depois usa o tipo de retorno desse metodo
para inferir o tipo da variável var.
Isso significa que var não interfere em nada na escolha entre as versões
int e double de descobrirMaior — a escolha já estava definida antes do var
"entrar em cena".
Critério de quando usar var: vale a pena quando o tipo já está óbvio pelo
contexto — por exemplo, quando o próprio nome da variável já indica o tipo
 (resultadoDoisNumerosInteiros, resultadoDoisNumerosFlutuantes) ou quando
 o lado direito da atribuição deixa isso claro.
Quando evitar var: quando o tipo não é óbvio de outra forma e usar var
deixaria o código mais vago, prejudicando a legibilidade para quem lê
depois.
Caso à parte no código: a linha
double resultado = NumeroUtil.descobrirMaior(10, 25.0); foi mantida com o
tipo explícito (double) propositalmente, pois é o exemplo que demonstra a
conversão implícita (widening) de int para double quando os argumentos são
de tipos mistos — nesse caso, deixar o tipo explícito reforça o que está
sendo demonstrado.*/
