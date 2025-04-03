const PESSOAS_PATH = 'https://swapi.dev/api/people?search=';

class App () {
    constructor() {
        this._onJsonReady = this._onJsonReady.bind(this);
        this._onSubmit = this._onSubmit.bind(this);

        this.personagens = [];

        const btn = document.querySelector('button');
        btn.addEventListener('click', this._onSubmit);
        let container = document.querySelector('#container');
        container.innerHTML = '<table></table>';
    }

    _onSubmit(event) {
        event.preventDefault();
        const text = document.querySelector('#personagem');
        const query = encodeURIComponent(textInput.value);
        console.log(PESSOAS_PATH + query);

        this.personagens = [];

        fetch(PESSOAS_PATH + query)
            .then(this._onResponse)
            .then(this._onJsonReady);
    }

    _onJsonReady(json) {
        if (!json.results) {
            return;
        }

        for (const item of json.results) {
            this.personagens.push(item);
        }

        this._renderPersonsagens();
    }

    _onResponse (response) {
        return response.json();
    }
}