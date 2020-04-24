<template>
    <div>
        <v-alert type="info">Digite algo abaixo e buscarei os tweets mais recentes sobre!</v-alert>

        <v-form>
            <div>
                <v-row>
                    <v-col md="10">
                        <v-text-field
                                v-model="busca"
                                outlined
                                placeholder="Digite algo para pesquisar..."
                                dense
                                required

                        />
                    </v-col>
                    <v-col>
                        <v-btn tile color="primary" @click="realizarBusca">Vai!</v-btn>
                        <v-btn tile color="error" type="button" @click="busca = ''">Limpar</v-btn>
                    </v-col>
                </v-row>
            </div>

            <div>
                <v-simple-table v-if="tweets.length > 0">
                    <template v-slot:default>
                        <thead>
                        <th></th>
                        <th>Twitter User</th>
                        <th>Twitter NomeTela</th>
                        <th>Tweet</th>
                        </thead>
                        <tbody>
                        <tr v-for="tweet in tweets" :key="tweet.id">
                            <td>
                                <v-img :src="tweet.urlImagemPerfil"></v-img>
                            </td>
                            <td>{{tweet.usuario}}</td>
                            <td>{{tweet.nomeTela}}</td>
                            <td>{{tweet.texto}}</td>
                        </tr>
                        </tbody>
                    </template>
                </v-simple-table>
            </div>
        </v-form>
    </div>
</template>
<script>
    import axios from "axios";

    export default {
        name: "BuscaTweets",
        data() {
            return {
                tweets: [],
                busca: ""
            };
        },
        methods: {
            realizarBusca() {
                let url_api = "http://localhost:8081/buscaTweets/";

                if (this.busca.length != 0) {
                    console.log("buscando na api por .: " + this.busca);
                    axios.get(url_api.concat(this.busca)).then(response => {
                        this.tweets = response.data;
                        console.log("Buscou em " + url_api + ". Apresentando resultados...");
                    }).catch(error => console.log(error));
                } else {
                    alert("parametro nao informado");
                }
            }
        }
    };
</script>

