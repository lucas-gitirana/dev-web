let titulo = document.getElementById('esp')
titulo.className = 'destaque'

let item = document.querySelector('li')
item.className = 'destaque'

document.getElementById('btn1').addEventListener('click', function teste() {
    let elementos = [...document.getElementsByClassName('normal')];
    elementos.forEach(function (e) {
        e.className = 'destaque';
    })

    let tasgLi = [...document.getElementsByTagName('li')];
    tasgLi.forEach(function (e) {
        e.innerHTML = 'teste';
    })

    let els = [...document.querySelectorAll('li.destaque')];
    console.log(els[0]);
});

function criarElementos() {
    const h1 = document.createElement('h1');
    h1.textContent = 'Criando título';

    const p = document.createElement('p');
    p.textContent = 'Criando parágrafo';

    const div = document.createElement('div');
    div.appendChild(h1);
    div.appendChild(p);

    document.body.appendChild(div);
}