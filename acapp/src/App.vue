<template>
  <div class="window">
    <div class="game-body">
      <RuleView v-if="$store.state.router.router_name === 'rule'" />
      <MenuViewvue v-else-if="$store.state.router.router_name === 'menu'" />
      <PkIndexViewVue v-else-if="$store.state.router.router_name === 'pk'" />
      <RecordIndexViewVue v-else-if="$store.state.router.router_name === 'record'" />
      <RecordContentViewVue v-else-if="$store.state.router.router_name === 'record_content'" />
      <RanklistIndexViewVue v-else-if="$store.state.router.router_name === 'ranklist'" />
      <UserBotIndexViewVue v-else-if="$store.state.router.router_name === 'user_bot'" />
    </div>

  </div>

</template>

<script>
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"
import { useStore } from 'vuex'
import RuleView from "./views/RuleView.vue"
import MenuViewvue from "./views/MenuView.vue"
import PkIndexViewVue from "./views/pk/PkIndexView.vue"
import RecordIndexViewVue from "./views/record/RecordIndexView.vue"
import RecordContentViewVue from "./views/record/RecordContentView.vue"
import RanklistIndexViewVue from "./views/ranklist/RanklistIndexView.vue"
import UserBotIndexViewVue from "./views/user/bot/UserBotIndexView.vue"

export default {
  components: {
    RuleView,
    MenuViewvue,
    PkIndexViewVue,
    RecordIndexViewVue,
    RecordContentViewVue,
    RanklistIndexViewVue,
    UserBotIndexViewVue,
  },
  setup() {
    const store = useStore();

    const jwt_token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4ODI2ODFlMWNiODM0N2UxOGRmZmVhOWU2NWM3NzdkMSIsInN1YiI6IjIwIiwiaXNzIjoic2ciLCJpYXQiOjE2NjE5MDExNjMsImV4cCI6MTY2MzExMDc2M30.dAVCILp48ZXuuFvXfpQ4Q3A12AYgJsCb67O0DsKD44o";
    if (jwt_token) {
      store.commit("updateToken", jwt_token);
      store.dispatch("getinfo", {
        success() {
          store.commit("updatePullingInfo", false);
        },
        error() {
          store.commit("updatePullingInfo", false);
        }
      })
    } else {
      store.commit("updatePullingInfo", false);
    }
  }
}

</script>

<style scoped>
div.game-body {
  background-image: url("./assets/images/pexels-pixabay-355770.jpg");
  background-size: cover;
  width: 100%;
  height: 100%;
}


div.window {
  width: 100vw;
  height: 100vh;
}
</style>
