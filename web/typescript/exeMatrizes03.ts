type Person = {
    nome: string,
    idade: number,
    cidade: string,
    imprimirDetalhes: () => string;
}

let pessoas: Person[][] = [];

for (let i = 0; i < 2; i++) {
    pessoas[i] = [];
    for (let j = 0; j < 2; j++) {
        pessoas[i][j] = {
            nome: 'Pessoa ' + i + ' - ' + j,
            idade: (i + j) * 10,
            cidade: (i + j) % 2 == 0 ? 'Ibirama' : 'Rio do Sul',
            imprimirDetalhes() {
                return `${this.nome}, ${this.idade} anos, de ${this.cidade}`;
            }
        };
    }
}

console.log(pessoas);
