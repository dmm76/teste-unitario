//TESTES
const chai = require('chai');
const expect = chai.expect;

const somarNumeros = (num1, num2) =>{
    if(typeof num1 === "number" && typeof num2 === "number"){
        return num1 + num2
    }else return undefined
} 


describe('Somas', ()=>{
    it('Soma de dois numeros - 2 e 3', (done)=>{
        const resultado = somarNumeros(2,3);
        expect(resultado).be.equal(5);
        done();
    } )
})

describe('Somas', ()=>{
    it('Soma de dois numeros - -2 e 3', (done)=>{
        const resultado = somarNumeros(-2,3);
        expect(resultado).be.equal(1);
        done();
    } )
})

describe('Somas', ()=>{
    it('Soma de dois numeros - "teste" e 3', (done)=>{
        const resultado = somarNumeros("teste",3);
        expect(resultado).be.equal(undefined);
        done();
        console.log(resultado)
    } )
})