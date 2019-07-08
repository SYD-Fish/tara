// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router/router'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.min'
import global_variable from './js/global_variable'
import axios from 'axios'
import qs from 'qs'

Vue.prototype.$axios = axios;   //全局注册，使用方法为:this.$axios
Vue.prototype.qs = qs;           //全局注册，使用方法为:this.qs
Vue.prototype.rootUrl = '/api';
Vue.prototype.global_variable = global_variable;


/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
