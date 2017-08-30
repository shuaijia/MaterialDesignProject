package com.jia.mddemo.domain;

import java.util.List;

/**
 * Describtion:体育
 * Created by jia on 2017/8/30.
 * 人之所以能，是相信能
 */
public class Sports {


    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-08-30 00:00","title":"许安琪夺全运女重冠军 开赛前一周腿还有问题","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p2.ifengimg.com/a/2017_35/9d86941c0bee1e1_size162_w518_h294.png","url":"http://sports.ifeng.com/a/20170829/51800848_0.shtml"},{"ctime":"2017-08-29 22:54","title":"全运女子举重63公斤级赛 福建队邓薇夺金","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p3.ifengimg.com/a/2017_35/451f19d0664521a_size401_w683_h464.png","url":"http://sports.ifeng.com/a/20170829/51800921_0.shtml"},{"ctime":"2017-08-29 22:37","title":"许安琪夺全运女重冠军 开赛前一周腿还有问题","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p2.ifengimg.com/a/2017_35/9d86941c0bee1e1_size162_w518_h294.png","url":"http://sports.ifeng.com/a/20170829/51800848_0.shtml"},{"ctime":"2017-08-29 21:00","title":"苏炳添：场地内过生日太惊喜 要在全运推广短跑","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p2.ifengimg.com/a/2017_35/7563b9805f2dc6b_size82_w1000_h800.jpg","url":"http://sports.ifeng.com/a/20170829/51799659_0.shtml"},{"ctime":"2017-08-29 20:36","title":"孙玉洁：夺铜牌也开心 全运会后就要回北大上课","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p3.ifengimg.com/a/2017_35/d0d84bf9f30030d_size155_w520_h309.png","url":"http://sports.ifeng.com/a/20170829/51799999_0.shtml"},{"ctime":"2017-08-29 20:00","title":"全运女子重剑孙玉洁遭淘汰 许安琪进决赛","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/a/2017_35/956fae0b8b7d1a6_size160_w467_h303.png","url":"http://sports.ifeng.com/a/20170829/51799046_0.shtml"},{"ctime":"2017-08-29 19:01","title":"正视频直播：全运会女子举重63公斤级决赛","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p2.ifengimg.com/cmpp/2017/08/29/48171e0e396c96b9463bed107c1b4778_size42_w168_h120.png","url":"http://sports.ifeng.com/a/20170829/51799236_0.shtml"},{"ctime":"2017-08-29 19:00","title":"国乒新人上位？刘国梁钦点两大冠军全被他团灭","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0829/89000A92E3A2EB115EC1FD5E8A3A3E841A583B98_size1029_w1320_h924.png","url":"http://sports.ifeng.com/a/20170829/51798803_0.shtml"},{"ctime":"2017-08-29 19:00","title":"大冷门！陈梦领衔卫冕冠军小组出局 山东一天三败","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p0.ifengimg.com/pmop/2017/0829/A55ED1A528644C192BE1E4A3360818C295FD37DC_size1027_w1320_h924.png","url":"http://sports.ifeng.com/a/20170829/51799022_0.shtml"},{"ctime":"2017-08-29 18:35","title":"全运女子重剑孙玉洁遭淘汰 许安琪进决赛","description":"凤凰体育","picUrl":"http://d.ifengimg.com/w145_h103/p1.ifengimg.com/a/2017_35/104476c9ee092a5_size250_w544_h290.png","url":"http://sports.ifeng.com/a/20170829/51799046_0.shtml"}]
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
         * ctime : 2017-08-30 00:00
         * title : 许安琪夺全运女重冠军 开赛前一周腿还有问题
         * description : 凤凰体育
         * picUrl : http://d.ifengimg.com/w145_h103/p2.ifengimg.com/a/2017_35/9d86941c0bee1e1_size162_w518_h294.png
         * url : http://sports.ifeng.com/a/20170829/51800848_0.shtml
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
