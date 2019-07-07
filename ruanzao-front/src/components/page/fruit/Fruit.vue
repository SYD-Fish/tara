<template>
  <div>
    <!--<dash-board></dash-board>-->
    <div @click="loadData">{{goodsKind}}</div>


  </div>
</template>

<script>
  import DashBoard from "../../common/dashboard/DashBoard";
  import global_variable from "../../../js/global_variable";
    export default {
        name: "Fruit",
        components: {
            DashBoard
        },
        data(){
          return{
            goodsKind: ''
          }

        },
        created() {
          this.$axios.get(this.rootUrl + '/goods/getAllGoods?adminId='+ global_variable.adminId)
            .then(response => {
              var data = response.data[0].goodsKind;
              console.log(global_variable.adminId);
              console.log(response.data[0].goodsKind);
              // goodsKind = response.data[0].goodsKind;
              console.log(this.$data);
              this.$nextTick(() => {
                this.goodsKind = data
              })
            })
            .catch(error => {
              this.$router.push('error')
            })
        },
        methods: {
          loadData: function() {
            this.$axios.get(this.rootUrl + '/goods/getAllGoods?adminId='+ global_variable.adminId)
              .then(response => {
                console.log(global_variable.adminId);
                console.log(response.data[0].goodsKind)
              })
              .catch(error => {
                this.$router.push('error')
              })
          }
        },
        mounted() {
          // this.gooksKind = 'wwwwbbbb'
        }

    }
</script>

<style scoped>

</style>
