<template>
  <div>
    <!--<dash-board></dash-board>-->
    <div @click="loadData">fruit</div>

  </div>
</template>

<script>
  import DashBoard from "../../common/dashboard/DashBoard";
    export default {
        name: "Fruit",
        components: {
            DashBoard
        },
        created() {
          // this.$http.get(this.rootUrl + '/goods/getAllGoods')
          //   .then(response => {
          //     console.log(response.body[0].goodsKind)
          //   })
        },
        methods: {
          loadData: function() {
            this.$http.get(this.rootUrl + '/goods/getAllGoods')
              .then(response => {
                console.log(response.body[0].goodsKind)
              })
          }
        }
    }
</script>

<style scoped>

</style>
