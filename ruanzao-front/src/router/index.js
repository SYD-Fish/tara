import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Home from "../components/page/home/Home";

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      components: {
        Home
      }
    }

  ]
})
