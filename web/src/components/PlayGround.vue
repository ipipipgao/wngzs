<template>
    <!-- <button @click="click_right" type="button" class="btn btn-outline-primary btn-lg">往右移动</button>
    <button @click="click_button" type="button" class="btn btn-outline-primary btn-lg">往下移动</button>
    <button @click="click_left" type="button" class="btn btn-outline-primary btn-lg">往左移动</button> 大大大大大大-->
    <div class="playground">
        <GameMap />
    </div>
    <div class="shang">
        <span v-if="$store.state.pk.status === 'playing'" class="left">
            <button @click="click_left" type="button" class="btn btn-outline-danger btn-lg">往左移动</button>
        </span>
        <span v-if="$store.state.pk.status === 'playing'" class="right">
            <button @click="click_right" type="button" class="btn btn-outline-danger btn-lg">往右移动</button>
        </span>
    </div>
    <div class="xia">
        <span v-if="$store.state.pk.status === 'playing'" class="upup">
            <button @click="click_up" type="button" class="btn btn-outline-danger btn-lg">往上移动</button>
        </span>
        <span v-if="$store.state.pk.status === 'playing'" class="down">
            <button @click="click_down" type="button" class="btn btn-outline-danger btn-lg">往下移动</button>
        </span>
    </div>


</template>

<script>
import GameMap from './GameMap.vue'
import { useStore } from 'vuex';
// import $ from 'jquery'

export default {
    components: {
        GameMap,
    },
    setup() {
        const store = useStore();

        const click_up = () => {
            store.commit("click_direction", 0);
        }

        const click_right = () => {
            store.commit("click_direction", 1);
        }
        const click_down = () => {
            store.commit("click_direction", 2);
        }
        const click_left = () => {
            store.commit("click_direction", 3);
        }


        return {
            click_up,
            click_right,
            click_down,
            click_left
        }
    }
}
</script>

<style scoped>
div.playground {
    width: 60vw;
    height: 80vh;
    margin: auto auto;
}

div.shang {
    margin-bottom: 5%;
}

span.upup {
    margin-left: 34%;
}

span.down {
    margin-left: 15%;
}

span.left {
    margin-left: 34%;
}

span.right {
    margin-left: 15%;
}
</style>