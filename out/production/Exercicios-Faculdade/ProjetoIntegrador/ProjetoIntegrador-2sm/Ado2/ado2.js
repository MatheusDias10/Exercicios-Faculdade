/* Exercicio: 
Ado2 - Treinamento Node
O aluno joão da silva tirou 5.6 na P1, 3 na P2 e
7.7 na Ado. Para ser aprovado ele deve tirar
mais que 6, se tirar menos que 3 será reprovado
mas se tirar mais que 3 e menos que 6 ficara de
recuperação. Crie o script para mostrar a
situação deste aluno com base no calculo de sua
média usando a formula: media = p1 * 0.35 + p2
* 0.35 + Ado * 0.3; */

let p1 = 5.6;
let p2 = 3;
let ado = 7.7;

let notaFinal = p1 * 0.35 + p2 * 0.35 + ado * 0.3;

if(notaFinal > 6){ // Se nota maior que 6 aprovado
    console.log("Parabéns, João da Silva, você foi aprovado.")
} else if(notaFinal > 3){ // Se nota maior que três recuperação
    console.log("Hummm, você ficou de recuperação.")
} else{console.log("Você repetiu de ano.")} // Se nota igual ou menor que três reprovado.