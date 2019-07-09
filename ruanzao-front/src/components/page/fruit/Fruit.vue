<template>
  <div>
    <!--<img src="../../../assets/image_01.jpg" />-->
    <ul v-for = 'item in goodsList'class="">
      <li>
        <a >
          <img :src="'../../../../static/' + item.images"  alt="图片加载出错"/>
          <p>{{item.goodsType}} 单价： {{item.price}} 库存： {{item.stockAmount}}</p>
        </a>
      </li>
    </ul>

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
            goodsList: []
          }

        },
        created() {
          this.$axios.get(this.rootUrl + '/goods/getGoods/' + this.$route.params.goodKindId)
            .then(response => {
              this.goodsList = response.data;
              console.log(response);
              console.log(this.goodsList);


            })
            .catch(error => {
              this.$router.push('/error')
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
