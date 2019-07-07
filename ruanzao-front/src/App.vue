<template>
  <div id="app">
    <user-header></user-header>
    <dash-board></dash-board>
    <router-view></router-view>
    <user-footer></user-footer>
    <!--<img src="./assets/logo.png">-->

  </div>
</template>

<script>
import UserHeader from "./components/common/header/UserHeader";
import UserFooter from "./components/common/footer/UserFooter";
import DashBoard from "./components/common/dashboard/DashBoard";

export default {
  name: 'App',
  components: {
    UserHeader,
    UserFooter,
    DashBoard
  },
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
