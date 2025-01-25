![GitHub repo size](https://img.shields.io/github/repo-size/dmm76/teste-unitario)
![GitHub License](https://img.shields.io/github/license/dmm76/teste-unitario)


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
