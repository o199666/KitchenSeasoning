package com.cwj.kitchenseasoning.menu.bean;

import java.util.List;

/**
 * Created by CWJ on 2020/5/12.
 * Author:Chen
 * Email:1181620038@qq.com
 * Ver:1
 * DEC: 菜单详细
 */
public class DetailsBean extends MenuBodyBean{

    /**
     * id : 76
     * title : 香菇鸡肉粥
     * tags : 家常菜;粥;原味;10-20分钟;煮;简单;午餐;晚餐;鲜香;维生素B;1-2人;滑嫩;防便秘;锅子;香味扑鼻啊
     * imtro : 自己做的要比外面卖的好吃很多倍，但却当不了早餐，因为每一样准备起来都需要点时间和心思，我是没有那份时间和心情在早上准备这样一顿早餐的，这只能是我家的午饭，或者周末的早午餐。
     * ingredients : 大米,500g;鸡胸肉,100g
     * burden : 香菇,适量;玉米粒,适量;胡萝卜,适量;盐,适量
     * albums : ["http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/t/1/76_557593.jpg"]
     * steps : [{"img":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/1/76_e183c3ebb7011464.jpg","step":"1.大米淘洗干净，放入汤锅，注入适量清水，开大火煮开，煮滚后转小火。然后就来洗胡萝卜、香菇，然后胡萝卜去皮切小丁；香菇去蒂切片，香菇切片放进粥里煮，样子会非常诱人、漂亮，我这么觉得。"},{"img":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/1/76_1e1fa58f51b2b641.jpg","step":"2.鸡胸肉洗净，我喜欢用刀随意的片成小片，形状不必规则。切成你满意的任意形状都可以。我没有腌渍鸡胸肉，没有做任何处理。你随自己的喜好可以提前将它调一下味。"},{"img":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/1/76_7f9a046b0a6a1252.jpg","step":"3.等锅里的粥煮的差不多了，就是米粒开花了，就可以放入玉米粒、胡萝卜丁、香菇片，搅拌均匀再煮上一会，等他们都断生后，就把切成小碎片的鸡胸肉倒进锅中，然后用筷子搅开，让它们快速烫熟，我喜欢这个时候加入鸡胸肉，这些做菜的细节都可以随主人的喜好和习惯随意调整。"},{"img":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/1/76_19f43ece6da5ef37.jpg","step":"4.最后加入一点盐调一下味就好了。香喷喷热乎乎的，做成稀饭也不错，大人小孩都适合。"}]
     */

    private String id;
    private String title;
    private String tags;
    private String imtro;
    private String ingredients;
    private String burden;
    private List<String> albums;
    private List<StepsBean> steps;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getImtro() {
        return imtro;
    }

    public void setImtro(String imtro) {
        this.imtro = imtro;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getBurden() {
        return burden;
    }

    public void setBurden(String burden) {
        this.burden = burden;
    }

    public List<String> getAlbums() {
        return albums;
    }

    public void setAlbums(List<String> albums) {
        this.albums = albums;
    }

    public List<StepsBean> getSteps() {
        return steps;
    }

    public void setSteps(List<StepsBean> steps) {
        this.steps = steps;
    }

    public static class StepsBean {
        /**
         * img : http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/1/76_e183c3ebb7011464.jpg
         * step : 1.大米淘洗干净，放入汤锅，注入适量清水，开大火煮开，煮滚后转小火。然后就来洗胡萝卜、香菇，然后胡萝卜去皮切小丁；香菇去蒂切片，香菇切片放进粥里煮，样子会非常诱人、漂亮，我这么觉得。
         */

        private String img;
        private String step;

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getStep() {
            return step;
        }

        public void setStep(String step) {
            this.step = step;
        }
    }
}
