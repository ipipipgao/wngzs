<template>
    <ContentField>
        游戏规则：玩家可以自己或者派出一名bot上阵，通过键盘的wdsa或者小键盘（就是4399小游戏人物的移动方式）控制蛇的移动。<br>两方玩家都输入蛇的移动信息之后，两条蛇就会同时移动一格，
        如果蛇撞墙或者撞到蛇的身体，就输了。如果你5秒钟之内不输入蛇的移动信息，也会输
    </ContentField>
</template>

<script>
import ContentField from '../components/ContentField.vue'

export default {
    components: {
        ContentField,
    }
}
</script>

<style>
</style>