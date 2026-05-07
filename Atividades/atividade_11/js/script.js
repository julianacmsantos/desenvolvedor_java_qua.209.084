// TODO - atividade 11
// Desenvolva uma página HTML onde o usuário pode calcular o seu IMC
// NOTE - use Bootstrap para fazer uma página bem bonita

function calcularIMC() {
      let peso = parseFloat(document.getElementById("peso").value);
      let altura = parseFloat(document.getElementById("altura").value);
      let resultado = document.getElementById("resultado");

      let imc = peso / (altura * altura);
      let classificacao = "";

      if (imc < 18.5) {
        classificacao = "Abaixo do peso";
      } else if (imc < 25) {
        classificacao = "Peso normal";
      } else if (imc < 30) {
        classificacao = "Sobrepeso";
      } else if (imc < 35) {
        classificacao = "Obesidade nível I";
      } else if (imc < 40) {
        classificacao = "Obesidade nível II";
      } else {
        classificacao = "Obesidade nível III";
      }

      resultado.innerHTML = `
        <div>
        Seu IMC é:
        <span class="valor-imc">
        ${imc.toFixed(2)}
        </span>
        <br>

        Classificação:
        <span class="classificacao">
        ${classificacao}
        </span>
        </div>
        `;}