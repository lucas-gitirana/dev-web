const JSON_PATH = 'https://swapi.dev/api/planets/1';

function _onJsonReady(json) {
    console.log(json);
}

function _onResponse(response) {
    return response.json();
}

fetch(JSON_PATH)
    .then(_onResponse)
    .then(_onJsonReady);