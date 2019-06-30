<template>
  <div>
    <user-header></user-header>
    <user-dashboard></user-dashboard>
    <div>This is a home page</div>
    <user-footer></user-footer>
  </div>
</template>

<script>
    import UserDashboard from "../../common/dashboard/UserDashboard";
    import UserFooter from "../../common/footer/UserFooter";
    import UserHeader from "../../common/header/UserHeader";
    export default {
        name: "Home.vue",
        components: {
          UserHeader,
          UserFooter,
          UserDashboard
        }
    }
</script>

<style scoped>

</style>
