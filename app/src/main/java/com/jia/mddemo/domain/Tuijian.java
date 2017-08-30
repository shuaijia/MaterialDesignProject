package com.jia.mddemo.domain;

import java.util.List;

/**
 * Describtion:推荐实体类
 * Created by jia on 2017/8/30.
 * 人之所以能，是相信能
 */
public class Tuijian {


    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-08-29 14:58","title":"习近平说不要把它搞丢了！","description":"搜狐国内","picUrl":"http://photocdn.sohu.com/20170829/Img508854537_ss.jpeg","url":"http://news.sohu.com/20170829/n508854536.shtml"},{"ctime":"2017-08-28 21:08","title":"习近平对河北塞罕坝林场建设者感人事迹作出重要指示","description":"搜狐国内","picUrl":"","url":"http://news.sohu.com/20170828/n508746873.shtml"},{"ctime":"2017-08-28 21:42","title":"十二届全国人大常委会第二十九次会议在京举行","description":"搜狐国内","picUrl":"","url":"http://news.sohu.com/20170828/n508760142.shtml"},{"ctime":"2017-08-28 21:43","title":"十二届全国人大常委会第二十九次会议分组审议有关法律草案","description":"搜狐国内","picUrl":"http://photocdn.sohu.com/20170828/Img508634700_ss.jpeg","url":"http://news.sohu.com/20170828/n508760281.shtml"},{"ctime":"2017-08-28 21:43","title":"全国政协十二届常委会第二十二次会议开幕","description":"搜狐国内","picUrl":"http://photocdn.sohu.com/20170828/Img508724330_ss.jpeg","url":"http://news.sohu.com/20170828/n508760326.shtml"},{"ctime":"2017-08-28 21:44","title":"全国政协十二届常委会第二十二次会议举行专题分组讨论","description":"搜狐国内","picUrl":"http://photocdn.sohu.com/20170828/Img508733412_ss.jpeg","url":"http://news.sohu.com/20170828/n508760396.shtml"},{"ctime":"2017-08-28 21:45","title":"4分钟速览《大国外交》之《大道之行》","description":"搜狐国内","picUrl":"http://photocdn.sohu.com/20170828/Img508746874_ss.png","url":"http://news.sohu.com/20170828/n508760535.shtml"},{"ctime":"2017-08-28 17:04","title":"中宣部、新华社和央视联合 共推《大国外交》六集政论片","description":"搜狐国内","picUrl":"http://photocdn.sohu.com/20170828/Img508724330_ss.jpeg","url":"http://news.sohu.com/20170828/n508724328.shtml"},{"ctime":"2017-08-28 17:56","title":"习近平一声令下 中国首次出动军舰撤侨","description":"搜狐国内","picUrl":"http://photocdn.sohu.com/20170828/Img508733412_ss.jpeg","url":"http://news.sohu.com/20170828/n508733411.shtml"},{"ctime":"2017-08-28 11:35","title":"第十三届全国运动会在天津隆重开幕 习近平出席并宣布运动会开幕","description":"搜狐国内","picUrl":"http://photocdn.sohu.com/20170828/Img508627104_ss.jpeg","url":"http://news.sohu.com/20170828/n508627103.shtml"}]
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
         * ctime : 2017-08-29 14:58
         * title : 习近平说不要把它搞丢了！
         * description : 搜狐国内
         * picUrl : http://photocdn.sohu.com/20170829/Img508854537_ss.jpeg
         * url : http://news.sohu.com/20170829/n508854536.shtml
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
