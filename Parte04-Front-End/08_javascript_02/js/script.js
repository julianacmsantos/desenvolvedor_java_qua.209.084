const form = document.querySelector('form');

form.addEventListener('submit', function(event) {
    // anula o submit
    event.preventDefault();

    // declaração de variável
    let nome = document.querySelector('#nome').value;

    // exibe a caixa de diálogo
    alert(nome);

    // resetar o formulário
    form.reset();
});