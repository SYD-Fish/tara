<template>
    <div>
      <nav class="navbar navbar-expand-lg navbar-light"> <!--style="background-color: green"-->
        <!-- Navbar content -->
        <!--首页 | 软枣子品种 | 软枣子树苗 | 联系我们-->
        <!--<a class="navbar-brand" href="#">Navbar</a>-->
        <!--<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">-->
          <!--<span class="navbar-toggler-icon"></span>-->
        <!--</button>-->

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <router-link to="home" tag="span" class="nav-link">
                首页
              </router-link>
              <!--<a class="nav-link" href="/home">首页 <span class="sr-only">(current)</span></a>-->

            </li>
            <li class="nav-item dropdown">
              <!--<router-link to="fruit" tag="span" class="nav-link">-->
                <!--软枣子品种-->
              <!--</router-link>-->
              <div class="nav-link dropdown-toggle" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                软枣子
              </div>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <div v-for="goodsKind in goodsKinds" class="dropdown-item">
                  <span @click="linkToFruit(goodsKind.goodsKindId)">{{ goodsKind.goodsKindName }}</span>
                  <!--<span>{{ goodsKind.goodsKindName }}</span>-->
                </div>
                <!--<a class="dropdown-item" href="#">Action</a>-->
                <!--<a class="dropdown-item" href="#">Another action</a>-->
                <!--<div class="dropdown-divider"></div>-->
                <!--<a class="dropdown-item" href="#">Something else here</a>-->
              </div>
              <!--<a class="nav-link" href="/fruit"></a>-->
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                软枣子树苗
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="#">Action</a>
                <a class="dropdown-item" href="#">Another action</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">Something else here</a>
              </div>
            </li>
            <li class="nav-item">
              <router-link to="contact" tag="span" class="nav-link">
                联系我们
              </router-link>
            </li>
          </ul>
          <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
          </form>
        </div>
      </nav>

    </div>
</template>

<script>
    import global_variable from "../../../js/global_variable";

    export default {
      name: "UserDashboard",
      data(){
        return {
          goodsKinds:[]
        }

      },
      created() {
        this.$axios.get(this.rootUrl + '/system/getAdminId/' + window.location.href.split('/')[2])
          .then( response => {
          console.log(response);
          global_variable.setAdminId(response.data);
          this.$axios.get(this.rootUrl + '/goods/getAllFruitKind/' + global_variable.adminId)
            .then(response =>{
              console.log(response.data);
              this.goodsKinds =response.data;
            })
            .catch(error =>{
              this.$router.push('error')
            })
        })
          .catch(error => this.$router.push('error'))
      },
      methods: {
        linkToFruit:function (goodsKindId) {
          console.log(goodsKindId + 'aa');
          this.$router.push('fruit/'+goodsKindId);
        }
      }
    }
</script>

<style scoped>

</style>
