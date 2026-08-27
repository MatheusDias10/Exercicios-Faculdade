var x = 10;
let y = 20;
const w = 50;

if (true){
    var x = 30; // Escopo global da função;
    let y = 40; // Escopo do bloco
    const w = 100;
    console.log("Dentro do if: ", x,y)
}

console.log("Fora do IF:", x,y,w)