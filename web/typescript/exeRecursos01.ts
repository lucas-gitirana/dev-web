interface Shape {
    calcArea: () => number
}

class Retangulo implements Shape {

    height: number;
    width: number;

    constructor (height: number, width: number) {
        this.height = height;
        this.width = width;
    }

    calcArea(): number {return this.height * this.width};
}

class Circulo implements Shape {

    raio: number;

    constructor (raio: number) {
        this.raio = raio;
    }

    calcArea(): number {return Math.PI * this.raio * this.raio};
}

const ret = new Retangulo(11,5);
const circ = new Circulo(5.6);

console.log(ret.calcArea());
console.log(circ.calcArea());
