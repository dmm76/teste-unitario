# teste-unitario
Repositorio para estudos sobre testes unitárops

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
