//TESTES
const chai = require('chai');
const expect = chai.expect;

const somarNumeros = (num1, num2) => num1 + num2;


describe('Somas', ()=>{
    it('Soma de dois numeros - 2 e 3', (done)=>{
        const resultado = somarNumeros(2,3);
        expect(resultado).be.equal(5);
        done();
    } )
})

describe('Somas', ()=>{
    it('Soma de dois numeros - -2 e 3', (done)=>{
        const resultado = somarNumeros(2,3);
        expect(resultado).be.equal(5);
        done();
    } )
})