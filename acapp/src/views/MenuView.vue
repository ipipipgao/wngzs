<template>
    <div class="menu-field">
        <div class="menu">
            <!-- <div @click="console">444</div> -->
            <div class="menu-item" @click="click_pk_handler">对战</div>
            <div class="menu-item" @click="click_record_handler">对局列表</div>
            <div class="menu-item" @click="click_record_content_handler">排行榜</div>
            <div class="menu-item" @click="click_user_bot_handler">我的Bot</div>
            <div class="menu-item" @click="click_rule_handler">游戏规则</div>
        </div>
    </div>
</template>

<script>
import { useStore } from 'vuex';

export default {
    setup() {
        const store = useStore();

        const click_pk_handler = () => {
            store.commit("updateRouterName", "pk");
        };

        const click_record_handler = () => {
            store.commit("updateRouterName", "record");
        };

        const click_record_content_handler = () => {
            store.commit("updateRouterName", "record_content");
        };

        const click_user_bot_handler = () => {
            store.commit("updateRouterName", "user_bot");
        };

        const click_rule_handler = () => {
            store.commit("updateRouterName", "rule");
        };

        return {
            click_pk_handler,
            click_record_handler,
            click_record_content_handler,
            click_user_bot_handler,
            click_rule_handler
        }

    }
}


</script>

<style scoped>
div.menu-field {
    display: flex;
    justify-content: center;
    align-items: center;
    width: 100%;
    height: 100%;
}

div.menu {
    width: 25vw;
    height: 38vh;
    background-color: rgba(0, 0, 0, 0.2);
}

div.menu-item {
    height: 7.5vh;
    width: 100%;
    font-size: 24px;
    line-height: 7.5vh;
    color: white;
    text-align: center;
    font-style: italic;
    font-weight: 600;
    cursor: pointer;
    user-select: none;
}

div.menu-item:hover {
    scale: 1.2;
    transition: 200ms;
}
</style>