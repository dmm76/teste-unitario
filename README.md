<div style="text-align: center;">
  <img 
    src="https://www.meuuniversonerd.com.br/images/noticias-conteudo/cat-tecnologia/desenvolvimento/2024-08-26-melhores-praticas-testes-unitarios-java.jpg" 
    alt="Banner sobre melhores práticas para testes unitários em Java, com elementos de tecnologia e desenvolvimento" 
    style="max-width: 60%; height: auto;"
  />
</div>

![GitHub repo size](https://img.shields.io/github/repo-size/dmm76/teste-unitario)
[![GitHub License](https://img.shields.io/github/license/dmm76/teste-unitario)](https://img.shields.io/github/license/dmm76/teste-unitario?cacheSeconds=0)
![GitHub language count](https://img.shields.io/github/languages/count/dmm76/teste-unitario)



# teste-unitario
Repositorio para estudos sobre testes unitários

Utilizando Junit4

    build.grade{
    
      dependencies {
        
        // Adiciona a biblioteca do JUnit 4
        
        testImplementation 'junit:junit:4.13.2'
      }
    
      tasks.test {
      
        useJUnit()
      }
    }
