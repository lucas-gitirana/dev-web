var Retangulo = /** @class */ (function () {
    function Retangulo(height, width) {
        this.height = height;
        this.width = width;
    }
    Retangulo.prototype.calcArea = function () { return this.height * this.width; };
    ;
    return Retangulo;
}());
var Circulo = /** @class */ (function () {
    function Circulo(raio) {
        this.raio = raio;
    }
    Circulo.prototype.calcArea = function () { return Math.PI * this.raio * this.raio; };
    ;
    return Circulo;
}());
var ret = new Retangulo(11, 5);
var circ = new Circulo(5.6);
console.log(ret.calcArea());
console.log(circ.calcArea());
