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
    import global_variable from "../../../js/global_variable";
    export default {
        name: "Home.vue",
        components: {
          UserHeader,
          UserFooter,
          DashBoard
        },
        created() {
        }
    }
</script>

<style scoped>

</style>
