const exibirConsole = function (evento) {
    console.log('Target: ' + evento.target)
    console.log('Current: ' + evento.currentTarget)
}

const detalhe = document.querySelector('.alerta');
detalhe.addEventListener('click', exibirConsole)