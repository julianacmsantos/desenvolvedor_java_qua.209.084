function calcularIMC() {

  let peso = parseFloat(document.getElementById("peso").value);
  let altura = parseFloat(document.getElementById("altura").value);
  let resultado = document.getElementById("resultado");

  // Validação
  if (!peso || !altura || altura <= 0) {
    resultado.innerHTML = `
      <span style="color:red;">
        Preencha peso e altura corretamente.
      </span>
    `;
    return;
  }

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
  `;
}