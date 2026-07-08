public class Principal {

    public static void main(String[] args) {
        int resultadoDoisNumerosInteiros = NumeroUtil.descobrirMaior(10, 25);
        System.out.println("Maior entre 2 numeros : " + resultadoDoisNumerosInteiros);

        int resultaspTresNumerosInteiros = NumeroUtil.descobrirMaior(5, 5, 15);
        System.out.println("Maior entre 3: " + resultaspTresNumerosInteiros);

        double resultadoDoisNumerosFlutuantes = NumeroUtil.descobrirMaior(6.6, 44.8);
        System.out.println("Maior entre 2 numeros ponto flutuante : "
                + resultadoDoisNumerosFlutuantes);

        double resultadoTresNumerosFlutuantes = NumeroUtil.descobrirMaior(0.5, 57.3, 21.4);
        System.out.println("Maior entre 3 numeros ponto flutuante : "
                + resultadoTresNumerosFlutuantes);

        double resultado = NumeroUtil.descobrirMaior(10, 25.0);
        System.out.println("Resultado : " + resultado);
    }
}
/*No ultimo exemplo Resumo: Sobrecarga de métodos + conversão implícita de
tipos (widening)

Sobrecarga por tipo: o Java diferencia métodos com mesmo nome não só pela
quantidade de parâmetros, mas também pelo tipo deles
(descobrirMaior(int, int) vs descobrirMaior(double, double)
são assinaturas diferentes).
Quando os argumentos não batem com nenhuma assinatura exata, o Java tenta
uma conversão implícita (widening) para encaixar a chamada em uma versão
existente.
Regra do widening: só é permitido converter automaticamente de um tipo
"menor" para um "maior" quando isso não perde informação —
ex: int → double é seguro (10 vira 10.0).
O caminho inverso não é automático: double → int perde a parte decimal
(ex: 25.7 viraria 25), então o Java não faz isso sozinho. Seria necessário
 um cast explícito ((int) 25.7), avisando o compilador que a perda de dado
 é intencional.
Exemplo prático: descobrirMaior(10, 25.0) —
como não existe versão (int, double), o Java converteu 10 para 10.0 e
usou a versão (double, double), retornando 25.0. */
