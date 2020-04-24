<template>
  <v-app id="app">
    <div>
      <v-app-bar dark>
        <v-toolbar-title>Busca Tweets</v-toolbar-title>
      </v-app-bar>
    </div>
    <div>
      <v-container>
      <BuscaTweets />
      </v-container>
    </div>
  </v-app>
</template>
<script>
import BuscaTweets from "./components/BuscaTweets";
export default {
  name: "App",

  components: { BuscaTweets },

  data: () => ({
    //
  })
};
</script>
