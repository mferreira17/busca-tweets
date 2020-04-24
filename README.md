<h4>Busca Tweets - Um webapp simples para estudos de Vue.js + Spring Boot</h4>

<hr/>
<h4>Recursos utilizados</h4>
<ul>
  <li><a href="http://vuejs.org">Vue.js (framework javascript para criação de aplicações web)</a></li>
  <li><a href="https://cli.vuejs.org/">Vue-cli (para criar a estrutura do frontend)</a></li>
  <li><a href="https://router.vuejs.org/">Vue-router (para fazer a estrutura de roteamento) </a></li>
  <li><a href="https://vuetifyjs.com/en/">Vuetify (para os componentes de interface com o usuario)</a></li>
  <li><a href="https://spring.io/projects/spring-boot">Spring Boot (fornecer a api rest)</a></li>
  <li><a href="http://maven.apache.org/">Apache Maven (gerenciador de dependencias) </a></li>
  <li><a href="http://twitter4j.org/en/">Twitter4J (uma biblioteca de acesso a api do Twitter)</a></li>
</ul><hr/>

<p>É necessário ter o <a href="https://yarnpkg.com/">Yarn</a> instalado na máquina para execução do programa. Após isto, rodar na raiz do projeto, o comando (via terminal ou cmd).: <b>mvn clean install</b></p>

<p>Ao final será gerado um arquivo .jar, dentro da pasta target , com a nomenclatura <b>'vue-tweets-1.0.0.jar'</b>. A partir dai, resta somente executar o comando no terminal .: <b>java -jar vue-tweets-1.0.0.jar</b>. O sistema estará disponível no endereço 
<a href="http://localhost:8081/"> http://localhost:8081/ </a> </p>

<p>Como aplicação usa dados do Twitter, deve-se ter as chaves de acesso para as consultas. Com elas, substituir no arquivo
application.properties.</p>
