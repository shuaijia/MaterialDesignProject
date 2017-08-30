package com.jia.mddemo.domain;

import java.util.List;

/**
 * Describtion:
 * Created by jia on 2017/8/30.
 * 人之所以能，是相信能
 */
public class Picture {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-02-08 08:00","title":"柏木由纪  入山杏奈写真集","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-02/07/19/201702071940045881-3356886.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7647953-0-1.html"},{"ctime":"2017-02-08 08:00","title":"手机模特  王馨瑶","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-02/07/19/201702071927251531-3356886.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7647941-0-1.html"},{"ctime":"2017-02-08 09:00","title":"Amrita贞贞 [YouWu尤物馆] 20170111 VOL045 小家碧玉古韵妹子火红装肚兜丁裤喜庆中国年新春祝福","description":"美女写真","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2017/02/m.xxxiao.com_5abf67141a67bd62f506dc74963fc405-683x1024.jpg","url":"http://m.xxxiao.com/117814"},{"ctime":"2017-02-08 09:00","title":"刘丽娜cn鱼丸 [Kimoe激萌文化] KIM016 穹妹COS可爱软妹子","description":"美女写真","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2017/02/m.xxxiao.com_19a1b58b4414c4869884a43865d44113-683x1024.jpg","url":"http://m.xxxiao.com/117813"},{"ctime":"2017-02-08 09:00","title":"TASTE顽味生活 20160225 VOL008 Carol酱 清纯清新不失性感妩媚大尺度性感私房照","description":"美女写真","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2017/02/m.xxxiao.com_d34a910d9c0665b407cf8e5840cd6ade-683x1024.jpg","url":"http://m.xxxiao.com/117812"},{"ctime":"2017-02-08 11:00","title":"复古美人","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-02/08/08/2017020808474981-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7648279-0-1.html"},{"ctime":"2017-02-08 14:00","title":"曾惊艳了时光的琼瑶女郎，你还记得几个？","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-02/08/13/201702081316146621-5456010.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7648705-0-1.html"},{"ctime":"2017-02-08 18:00","title":"[贴图]沉思","description":"华声美女","picUrl":"http://image.hnol.net/c/2017-02/08/17/201702081751012261-4659347.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7649101-0-1.html"},{"ctime":"2017-02-08 19:00","title":"巨乳女神 刘娅希 [BoLoli波萝社新刊] 2017120 BOL019 泰国泳池嬉戏波涛胸涌比基尼清凉一夏","description":"美女写真","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2017/02/m.xxxiao.com_89c231f55669805191aae5fa50d2480d.jpg","url":"http://m.xxxiao.com/117996"},{"ctime":"2017-02-08 19:00","title":"台妹嫩模女郎 Irene小头(余晨瑀) 甜美少女比基尼靓丽美拍","description":"美女写真","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2017/02/m.xxxiao.com_452936a257ac62e54635271242c4606d.jpg","url":"http://m.xxxiao.com/117995"}]
     */

    private int code;
    private String msg;
    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        /**
         * ctime : 2017-02-08 08:00
         * title : 柏木由纪  入山杏奈写真集
         * description : 华声美女
         * picUrl : http://image.hnol.net/c/2017-02/07/19/201702071940045881-3356886.jpg
         * url : http://bbs.voc.com.cn/mm/meinv-7647953-0-1.html
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
