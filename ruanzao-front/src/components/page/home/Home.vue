<template>
  <div>
    <!--<user-header></user-header>-->
    <!--<dash-board></dash-board>-->
    <div>This is a home page</div>
    <!--<user-footer></user-footer>-->
  </div>
</template>

<script>
    import DashBoard from "../../common/dashboard/DashBoard";
    import UserFooter from "../../common/footer/UserFooter";
    import UserHeader from "../../common/header/UserHeader";
    export default {
        name: "Home.vue",
        components: {
          UserHeader,
          UserFooter,
          DashBoard
        }
    }
</script>

<style scoped>

</style>
