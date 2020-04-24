import Vue from 'vue'
import Router from 'vue-route';
import BuscaTweets from './components/BuscaTweets'

Vue.use(Router)

export default new Router({
  routes: [{
    path: '/', name: 'BuscaTweets', component: BuscaTweets
  }]
})

