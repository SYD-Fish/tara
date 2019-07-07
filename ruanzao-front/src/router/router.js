import Vue from 'vue'
import VueRouter  from 'vue-router'
import Home from "../components/page/home/Home";
import App from "../App";
import Fruit from "../components/page/fruit/Fruit";
import Sapling from "../components/page/sapling/Sapling";
import Contact from "../components/page/contact/Contact";
import ErrorPage from "../components/page/error/ErrorPage";

Vue.use(VueRouter)

const routes = [
  {path: '/', redirect: '/home'},
  {path: '/home', name: 'home', component: Home},
  {path: '/fruit', component: Fruit},
  {path: '/sapling', component: Sapling},
  {path: '/contact', component: Contact},
  {path: '/error', component: ErrorPage}
]

const router = new VueRouter ({
  mode: 'history', //去除'#/'
  routes
})

const app = new Vue({
  router,
  render: h => h(App)
}).$mount('#app')

export  default router

// export default new Router({
//   routes: [
//
//     {
//       path: '/home',
//       name: 'home',
//       components: {
//         Home
//       }
//     }
//     ]
// })
