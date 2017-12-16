# Cache simples usando List e Map

Esse projeto é desenhado para ser usado como dependência nos projetos que seja necessário uma camada de cache.

Sendo assim, temos que pensar no cache a ser desenvolvido para não termos conflito entre aplicações

Hoje, temos 2 interfaces para cache:

  - List
  - Map
  
  
# Boas Práticas

Podemos ter Maps e Lists compartilhados entre aplicações, sendo assim, devemos manter uma boa comunicação.
Caso a informação deva ser compartilhada apenas pelas mesmas réplicas, o Enum deve ser mais específico para o get da Interface.


# Repositório e gradle.build

Atualmente usamos o nexus como repositorio, sendo assim, devemos colocar uma config
no projeto para que o gradle realize o upload dos pacotes.


nexus {
	sign = true
	repositoryUrl = 'http://nexus.icarros.com.br/repository/maven-releases/'
	snapshotRepositoryUrl = 'http://nexus.icarros.com.br/repository/maven-snapshots/'
}

Com isso feito, temos que adicionar o nosso usuario e senha em ~/.gradle/gradle.properties

nexusUsername = seuuser
nexusPassword = suasenha


# Dependência nos projetos

  ##gradle.build
    	compile('br.com.icarros:ms-cache:0.0.1-SNAPSHOT')
    	compile group: 'com.hazelcast', name: 'hazelcast', version: '3.9.1'
    	compile group: 'com.hazelcast', name: 'hazelcast-client', version: '3.9.1'
    	
    	
  ##aplication.properties
        icarros.cluster.cache.name=dev
        icarros.cluster.cache.pass=dev-pass
        
  ##service
        
        @Autowired
        private IcarrosCacheService icarrosCacheService;  	
    
  
  ##exemplo de chamada
        
        icarrosCacheService.getList(<ENUM>)
  	    icarrosCacheService.getList(EnumsCustom.TESTE).addAll(items);
