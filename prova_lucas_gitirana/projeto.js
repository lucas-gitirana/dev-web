const JSON_PATH = 'http://localhost:8080/projeto';

function _onResponse(response) {
    return response.json();
}

function _onJsonReady(projeto) {
    console.log('Dados do Projeto:');
    console.log(`ID: ${projeto.id}`);
    console.log(`Título: ${projeto.titulo}`);
    console.log(`Coordenador: ${projeto.coordenador}`);
}

fetch(JSON_PATH)
.then(_onResponse)
.then(_onJsonReady);