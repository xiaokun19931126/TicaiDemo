package com.xiaokun.myapplication;

/**
 * Created by 肖坤 on 2018/3/28.
 *
 * @author 肖坤
 * @date 2018/3/28
 */

public class ProportionEntity
{

    /**
     * data : {"_105821":{"had":{"id":"236339","type":"had","num":"2018-03-28","mid":"105821","win":"5502","lose":"1880","draw":"2751","odds_id":"0","total":"10133","pre_win":"54%","pre_lose":"19%","pre_draw":"27%"},"hhad":{"id":"236326","type":"hhad","num":"2018-03-28","mid":"105821","win":"2243","lose":"1861","draw":"2321","odds_id":"0","total":"6425","pre_win":"35%","pre_lose":"29%","pre_draw":"36%"}},"_105822":{"had":{"id":"236332","type":"had","num":"2018-03-28","mid":"105822","win":"6038","lose":"1832","draw":"3175","odds_id":"0","total":"11045","pre_win":"55%","pre_lose":"17%","pre_draw":"29%"},"hhad":{"id":"236325","type":"hhad","num":"2018-03-28","mid":"105822","win":"2730","lose":"1848","draw":"2579","odds_id":"0","total":"7157","pre_win":"38%","pre_lose":"26%","pre_draw":"36%"}},"_105823":{"had":{"id":"236341","type":"had","num":"2018-03-28","mid":"105823","win":"3895","lose":"1853","draw":"2149","odds_id":"0","total":"7897","pre_win":"49%","pre_lose":"23%","pre_draw":"27%"},"hhad":{"id":"236340","type":"hhad","num":"2018-03-28","mid":"105823","win":"1845","lose":"1725","draw":"1809","odds_id":"0","total":"5379","pre_win":"34%","pre_lose":"32%","pre_draw":"34%"}},"_105824":{"had":{"id":"236345","type":"had","num":"2018-03-28","mid":"105824","win":"4079","lose":"1528","draw":"2143","odds_id":"0","total":"7750","pre_win":"53%","pre_lose":"20%","pre_draw":"28%"},"hhad":{"id":"236346","type":"hhad","num":"2018-03-28","mid":"105824","win":"1615","lose":"1274","draw":"1721","odds_id":"0","total":"4610","pre_win":"35%","pre_lose":"28%","pre_draw":"37%"}},"_105825":{"had":{"id":"236342","type":"had","num":"2018-03-28","mid":"105825","win":"4217","lose":"998","draw":"1926","odds_id":"0","total":"7141","pre_win":"59%","pre_lose":"14%","pre_draw":"27%"},"hhad":{"id":"236343","type":"hhad","num":"2018-03-28","mid":"105825","win":"2182","lose":"926","draw":"1881","odds_id":"0","total":"4989","pre_win":"44%","pre_lose":"19%","pre_draw":"38%"}},"_105826":{"had":{"id":"236344","type":"had","num":"2018-03-28","mid":"105826","win":"4122","lose":"1225","draw":"2136","odds_id":"0","total":"7483","pre_win":"55%","pre_lose":"16%","pre_draw":"29%"},"hhad":{"id":"236347","type":"hhad","num":"2018-03-28","mid":"105826","win":"1769","lose":"1077","draw":"1666","odds_id":"0","total":"4512","pre_win":"39%","pre_lose":"24%","pre_draw":"37%"}}}
     */

    private DataBean data;

    public DataBean getData()
    {
        return data;
    }

    public void setData(DataBean data)
    {
        this.data = data;
    }

    public static class DataBean
    {
        /**
         * _105821 : {"had":{"id":"236339","type":"had","num":"2018-03-28","mid":"105821","win":"5502","lose":"1880","draw":"2751","odds_id":"0","total":"10133","pre_win":"54%","pre_lose":"19%","pre_draw":"27%"},"hhad":{"id":"236326","type":"hhad","num":"2018-03-28","mid":"105821","win":"2243","lose":"1861","draw":"2321","odds_id":"0","total":"6425","pre_win":"35%","pre_lose":"29%","pre_draw":"36%"}}
         * _105822 : {"had":{"id":"236332","type":"had","num":"2018-03-28","mid":"105822","win":"6038","lose":"1832","draw":"3175","odds_id":"0","total":"11045","pre_win":"55%","pre_lose":"17%","pre_draw":"29%"},"hhad":{"id":"236325","type":"hhad","num":"2018-03-28","mid":"105822","win":"2730","lose":"1848","draw":"2579","odds_id":"0","total":"7157","pre_win":"38%","pre_lose":"26%","pre_draw":"36%"}}
         * _105823 : {"had":{"id":"236341","type":"had","num":"2018-03-28","mid":"105823","win":"3895","lose":"1853","draw":"2149","odds_id":"0","total":"7897","pre_win":"49%","pre_lose":"23%","pre_draw":"27%"},"hhad":{"id":"236340","type":"hhad","num":"2018-03-28","mid":"105823","win":"1845","lose":"1725","draw":"1809","odds_id":"0","total":"5379","pre_win":"34%","pre_lose":"32%","pre_draw":"34%"}}
         * _105824 : {"had":{"id":"236345","type":"had","num":"2018-03-28","mid":"105824","win":"4079","lose":"1528","draw":"2143","odds_id":"0","total":"7750","pre_win":"53%","pre_lose":"20%","pre_draw":"28%"},"hhad":{"id":"236346","type":"hhad","num":"2018-03-28","mid":"105824","win":"1615","lose":"1274","draw":"1721","odds_id":"0","total":"4610","pre_win":"35%","pre_lose":"28%","pre_draw":"37%"}}
         * _105825 : {"had":{"id":"236342","type":"had","num":"2018-03-28","mid":"105825","win":"4217","lose":"998","draw":"1926","odds_id":"0","total":"7141","pre_win":"59%","pre_lose":"14%","pre_draw":"27%"},"hhad":{"id":"236343","type":"hhad","num":"2018-03-28","mid":"105825","win":"2182","lose":"926","draw":"1881","odds_id":"0","total":"4989","pre_win":"44%","pre_lose":"19%","pre_draw":"38%"}}
         * _105826 : {"had":{"id":"236344","type":"had","num":"2018-03-28","mid":"105826","win":"4122","lose":"1225","draw":"2136","odds_id":"0","total":"7483","pre_win":"55%","pre_lose":"16%","pre_draw":"29%"},"hhad":{"id":"236347","type":"hhad","num":"2018-03-28","mid":"105826","win":"1769","lose":"1077","draw":"1666","odds_id":"0","total":"4512","pre_win":"39%","pre_lose":"24%","pre_draw":"37%"}}
         */

        private _$105821Bean _105821;
        private _$105822Bean _105822;
        private _$105823Bean _105823;
        private _$105824Bean _105824;
        private _$105825Bean _105825;
        private _$105826Bean _105826;

        public _$105821Bean get_105821()
        {
            return _105821;
        }

        public void set_105821(_$105821Bean _105821)
        {
            this._105821 = _105821;
        }

        public _$105822Bean get_105822()
        {
            return _105822;
        }

        public void set_105822(_$105822Bean _105822)
        {
            this._105822 = _105822;
        }

        public _$105823Bean get_105823()
        {
            return _105823;
        }

        public void set_105823(_$105823Bean _105823)
        {
            this._105823 = _105823;
        }

        public _$105824Bean get_105824()
        {
            return _105824;
        }

        public void set_105824(_$105824Bean _105824)
        {
            this._105824 = _105824;
        }

        public _$105825Bean get_105825()
        {
            return _105825;
        }

        public void set_105825(_$105825Bean _105825)
        {
            this._105825 = _105825;
        }

        public _$105826Bean get_105826()
        {
            return _105826;
        }

        public void set_105826(_$105826Bean _105826)
        {
            this._105826 = _105826;
        }

        public static class _$105821Bean
        {
            /**
             * had : {"id":"236339","type":"had","num":"2018-03-28","mid":"105821","win":"5502","lose":"1880","draw":"2751","odds_id":"0","total":"10133","pre_win":"54%","pre_lose":"19%","pre_draw":"27%"}
             * hhad : {"id":"236326","type":"hhad","num":"2018-03-28","mid":"105821","win":"2243","lose":"1861","draw":"2321","odds_id":"0","total":"6425","pre_win":"35%","pre_lose":"29%","pre_draw":"36%"}
             */

            private HadBean had;
            private HhadBean hhad;

            public HadBean getHad()
            {
                return had;
            }

            public void setHad(HadBean had)
            {
                this.had = had;
            }

            public HhadBean getHhad()
            {
                return hhad;
            }

            public void setHhad(HhadBean hhad)
            {
                this.hhad = hhad;
            }

            public static class HadBean
            {
                /**
                 * id : 236339
                 * type : had
                 * num : 2018-03-28
                 * mid : 105821
                 * win : 5502
                 * lose : 1880
                 * draw : 2751
                 * odds_id : 0
                 * total : 10133
                 * pre_win : 54%
                 * pre_lose : 19%
                 * pre_draw : 27%
                 */

                private String id;
                private String type;
                private String num;
                private String mid;
                private String win;
                private String lose;
                private String draw;
                private String odds_id;
                private String total;
                private String pre_win;
                private String pre_lose;
                private String pre_draw;

                public String getId()
                {
                    return id;
                }

                public void setId(String id)
                {
                    this.id = id;
                }

                public String getType()
                {
                    return type;
                }

                public void setType(String type)
                {
                    this.type = type;
                }

                public String getNum()
                {
                    return num;
                }

                public void setNum(String num)
                {
                    this.num = num;
                }

                public String getMid()
                {
                    return mid;
                }

                public void setMid(String mid)
                {
                    this.mid = mid;
                }

                public String getWin()
                {
                    return win;
                }

                public void setWin(String win)
                {
                    this.win = win;
                }

                public String getLose()
                {
                    return lose;
                }

                public void setLose(String lose)
                {
                    this.lose = lose;
                }

                public String getDraw()
                {
                    return draw;
                }

                public void setDraw(String draw)
                {
                    this.draw = draw;
                }

                public String getOdds_id()
                {
                    return odds_id;
                }

                public void setOdds_id(String odds_id)
                {
                    this.odds_id = odds_id;
                }

                public String getTotal()
                {
                    return total;
                }

                public void setTotal(String total)
                {
                    this.total = total;
                }

                public String getPre_win()
                {
                    return pre_win;
                }

                public void setPre_win(String pre_win)
                {
                    this.pre_win = pre_win;
                }

                public String getPre_lose()
                {
                    return pre_lose;
                }

                public void setPre_lose(String pre_lose)
                {
                    this.pre_lose = pre_lose;
                }

                public String getPre_draw()
                {
                    return pre_draw;
                }

                public void setPre_draw(String pre_draw)
                {
                    this.pre_draw = pre_draw;
                }
            }

            public static class HhadBean
            {
                /**
                 * id : 236326
                 * type : hhad
                 * num : 2018-03-28
                 * mid : 105821
                 * win : 2243
                 * lose : 1861
                 * draw : 2321
                 * odds_id : 0
                 * total : 6425
                 * pre_win : 35%
                 * pre_lose : 29%
                 * pre_draw : 36%
                 */

                private String id;
                private String type;
                private String num;
                private String mid;
                private String win;
                private String lose;
                private String draw;
                private String odds_id;
                private String total;
                private String pre_win;
                private String pre_lose;
                private String pre_draw;

                public String getId()
                {
                    return id;
                }

                public void setId(String id)
                {
                    this.id = id;
                }

                public String getType()
                {
                    return type;
                }

                public void setType(String type)
                {
                    this.type = type;
                }

                public String getNum()
                {
                    return num;
                }

                public void setNum(String num)
                {
                    this.num = num;
                }

                public String getMid()
                {
                    return mid;
                }

                public void setMid(String mid)
                {
                    this.mid = mid;
                }

                public String getWin()
                {
                    return win;
                }

                public void setWin(String win)
                {
                    this.win = win;
                }

                public String getLose()
                {
                    return lose;
                }

                public void setLose(String lose)
                {
                    this.lose = lose;
                }

                public String getDraw()
                {
                    return draw;
                }

                public void setDraw(String draw)
                {
                    this.draw = draw;
                }

                public String getOdds_id()
                {
                    return odds_id;
                }

                public void setOdds_id(String odds_id)
                {
                    this.odds_id = odds_id;
                }

                public String getTotal()
                {
                    return total;
                }

                public void setTotal(String total)
                {
                    this.total = total;
                }

                public String getPre_win()
                {
                    return pre_win;
                }

                public void setPre_win(String pre_win)
                {
                    this.pre_win = pre_win;
                }

                public String getPre_lose()
                {
                    return pre_lose;
                }

                public void setPre_lose(String pre_lose)
                {
                    this.pre_lose = pre_lose;
                }

                public String getPre_draw()
                {
                    return pre_draw;
                }

                public void setPre_draw(String pre_draw)
                {
                    this.pre_draw = pre_draw;
                }
            }
        }

        public static class _$105822Bean
        {
            /**
             * had : {"id":"236332","type":"had","num":"2018-03-28","mid":"105822","win":"6038","lose":"1832","draw":"3175","odds_id":"0","total":"11045","pre_win":"55%","pre_lose":"17%","pre_draw":"29%"}
             * hhad : {"id":"236325","type":"hhad","num":"2018-03-28","mid":"105822","win":"2730","lose":"1848","draw":"2579","odds_id":"0","total":"7157","pre_win":"38%","pre_lose":"26%","pre_draw":"36%"}
             */

            private HadBeanX had;
            private HhadBeanX hhad;

            public HadBeanX getHad()
            {
                return had;
            }

            public void setHad(HadBeanX had)
            {
                this.had = had;
            }

            public HhadBeanX getHhad()
            {
                return hhad;
            }

            public void setHhad(HhadBeanX hhad)
            {
                this.hhad = hhad;
            }

            public static class HadBeanX
            {
                /**
                 * id : 236332
                 * type : had
                 * num : 2018-03-28
                 * mid : 105822
                 * win : 6038
                 * lose : 1832
                 * draw : 3175
                 * odds_id : 0
                 * total : 11045
                 * pre_win : 55%
                 * pre_lose : 17%
                 * pre_draw : 29%
                 */

                private String id;
                private String type;
                private String num;
                private String mid;
                private String win;
                private String lose;
                private String draw;
                private String odds_id;
                private String total;
                private String pre_win;
                private String pre_lose;
                private String pre_draw;

                public String getId()
                {
                    return id;
                }

                public void setId(String id)
                {
                    this.id = id;
                }

                public String getType()
                {
                    return type;
                }

                public void setType(String type)
                {
                    this.type = type;
                }

                public String getNum()
                {
                    return num;
                }

                public void setNum(String num)
                {
                    this.num = num;
                }

                public String getMid()
                {
                    return mid;
                }

                public void setMid(String mid)
                {
                    this.mid = mid;
                }

                public String getWin()
                {
                    return win;
                }

                public void setWin(String win)
                {
                    this.win = win;
                }

                public String getLose()
                {
                    return lose;
                }

                public void setLose(String lose)
                {
                    this.lose = lose;
                }

                public String getDraw()
                {
                    return draw;
                }

                public void setDraw(String draw)
                {
                    this.draw = draw;
                }

                public String getOdds_id()
                {
                    return odds_id;
                }

                public void setOdds_id(String odds_id)
                {
                    this.odds_id = odds_id;
                }

                public String getTotal()
                {
                    return total;
                }

                public void setTotal(String total)
                {
                    this.total = total;
                }

                public String getPre_win()
                {
                    return pre_win;
                }

                public void setPre_win(String pre_win)
                {
                    this.pre_win = pre_win;
                }

                public String getPre_lose()
                {
                    return pre_lose;
                }

                public void setPre_lose(String pre_lose)
                {
                    this.pre_lose = pre_lose;
                }

                public String getPre_draw()
                {
                    return pre_draw;
                }

                public void setPre_draw(String pre_draw)
                {
                    this.pre_draw = pre_draw;
                }
            }

            public static class HhadBeanX
            {
                /**
                 * id : 236325
                 * type : hhad
                 * num : 2018-03-28
                 * mid : 105822
                 * win : 2730
                 * lose : 1848
                 * draw : 2579
                 * odds_id : 0
                 * total : 7157
                 * pre_win : 38%
                 * pre_lose : 26%
                 * pre_draw : 36%
                 */

                private String id;
                private String type;
                private String num;
                private String mid;
                private String win;
                private String lose;
                private String draw;
                private String odds_id;
                private String total;
                private String pre_win;
                private String pre_lose;
                private String pre_draw;

                public String getId()
                {
                    return id;
                }

                public void setId(String id)
                {
                    this.id = id;
                }

                public String getType()
                {
                    return type;
                }

                public void setType(String type)
                {
                    this.type = type;
                }

                public String getNum()
                {
                    return num;
                }

                public void setNum(String num)
                {
                    this.num = num;
                }

                public String getMid()
                {
                    return mid;
                }

                public void setMid(String mid)
                {
                    this.mid = mid;
                }

                public String getWin()
                {
                    return win;
                }

                public void setWin(String win)
                {
                    this.win = win;
                }

                public String getLose()
                {
                    return lose;
                }

                public void setLose(String lose)
                {
                    this.lose = lose;
                }

                public String getDraw()
                {
                    return draw;
                }

                public void setDraw(String draw)
                {
                    this.draw = draw;
                }

                public String getOdds_id()
                {
                    return odds_id;
                }

                public void setOdds_id(String odds_id)
                {
                    this.odds_id = odds_id;
                }

                public String getTotal()
                {
                    return total;
                }

                public void setTotal(String total)
                {
                    this.total = total;
                }

                public String getPre_win()
                {
                    return pre_win;
                }

                public void setPre_win(String pre_win)
                {
                    this.pre_win = pre_win;
                }

                public String getPre_lose()
                {
                    return pre_lose;
                }

                public void setPre_lose(String pre_lose)
                {
                    this.pre_lose = pre_lose;
                }

                public String getPre_draw()
                {
                    return pre_draw;
                }

                public void setPre_draw(String pre_draw)
                {
                    this.pre_draw = pre_draw;
                }
            }
        }

        public static class _$105823Bean
        {
            /**
             * had : {"id":"236341","type":"had","num":"2018-03-28","mid":"105823","win":"3895","lose":"1853","draw":"2149","odds_id":"0","total":"7897","pre_win":"49%","pre_lose":"23%","pre_draw":"27%"}
             * hhad : {"id":"236340","type":"hhad","num":"2018-03-28","mid":"105823","win":"1845","lose":"1725","draw":"1809","odds_id":"0","total":"5379","pre_win":"34%","pre_lose":"32%","pre_draw":"34%"}
             */

            private HadBeanXX had;
            private HhadBeanXX hhad;

            public HadBeanXX getHad()
            {
                return had;
            }

            public void setHad(HadBeanXX had)
            {
                this.had = had;
            }

            public HhadBeanXX getHhad()
            {
                return hhad;
            }

            public void setHhad(HhadBeanXX hhad)
            {
                this.hhad = hhad;
            }

            public static class HadBeanXX
            {
                /**
                 * id : 236341
                 * type : had
                 * num : 2018-03-28
                 * mid : 105823
                 * win : 3895
                 * lose : 1853
                 * draw : 2149
                 * odds_id : 0
                 * total : 7897
                 * pre_win : 49%
                 * pre_lose : 23%
                 * pre_draw : 27%
                 */

                private String id;
                private String type;
                private String num;
                private String mid;
                private String win;
                private String lose;
                private String draw;
                private String odds_id;
                private String total;
                private String pre_win;
                private String pre_lose;
                private String pre_draw;

                public String getId()
                {
                    return id;
                }

                public void setId(String id)
                {
                    this.id = id;
                }

                public String getType()
                {
                    return type;
                }

                public void setType(String type)
                {
                    this.type = type;
                }

                public String getNum()
                {
                    return num;
                }

                public void setNum(String num)
                {
                    this.num = num;
                }

                public String getMid()
                {
                    return mid;
                }

                public void setMid(String mid)
                {
                    this.mid = mid;
                }

                public String getWin()
                {
                    return win;
                }

                public void setWin(String win)
                {
                    this.win = win;
                }

                public String getLose()
                {
                    return lose;
                }

                public void setLose(String lose)
                {
                    this.lose = lose;
                }

                public String getDraw()
                {
                    return draw;
                }

                public void setDraw(String draw)
                {
                    this.draw = draw;
                }

                public String getOdds_id()
                {
                    return odds_id;
                }

                public void setOdds_id(String odds_id)
                {
                    this.odds_id = odds_id;
                }

                public String getTotal()
                {
                    return total;
                }

                public void setTotal(String total)
                {
                    this.total = total;
                }

                public String getPre_win()
                {
                    return pre_win;
                }

                public void setPre_win(String pre_win)
                {
                    this.pre_win = pre_win;
                }

                public String getPre_lose()
                {
                    return pre_lose;
                }

                public void setPre_lose(String pre_lose)
                {
                    this.pre_lose = pre_lose;
                }

                public String getPre_draw()
                {
                    return pre_draw;
                }

                public void setPre_draw(String pre_draw)
                {
                    this.pre_draw = pre_draw;
                }
            }

            public static class HhadBeanXX
            {
                /**
                 * id : 236340
                 * type : hhad
                 * num : 2018-03-28
                 * mid : 105823
                 * win : 1845
                 * lose : 1725
                 * draw : 1809
                 * odds_id : 0
                 * total : 5379
                 * pre_win : 34%
                 * pre_lose : 32%
                 * pre_draw : 34%
                 */

                private String id;
                private String type;
                private String num;
                private String mid;
                private String win;
                private String lose;
                private String draw;
                private String odds_id;
                private String total;
                private String pre_win;
                private String pre_lose;
                private String pre_draw;

                public String getId()
                {
                    return id;
                }

                public void setId(String id)
                {
                    this.id = id;
                }

                public String getType()
                {
                    return type;
                }

                public void setType(String type)
                {
                    this.type = type;
                }

                public String getNum()
                {
                    return num;
                }

                public void setNum(String num)
                {
                    this.num = num;
                }

                public String getMid()
                {
                    return mid;
                }

                public void setMid(String mid)
                {
                    this.mid = mid;
                }

                public String getWin()
                {
                    return win;
                }

                public void setWin(String win)
                {
                    this.win = win;
                }

                public String getLose()
                {
                    return lose;
                }

                public void setLose(String lose)
                {
                    this.lose = lose;
                }

                public String getDraw()
                {
                    return draw;
                }

                public void setDraw(String draw)
                {
                    this.draw = draw;
                }

                public String getOdds_id()
                {
                    return odds_id;
                }

                public void setOdds_id(String odds_id)
                {
                    this.odds_id = odds_id;
                }

                public String getTotal()
                {
                    return total;
                }

                public void setTotal(String total)
                {
                    this.total = total;
                }

                public String getPre_win()
                {
                    return pre_win;
                }

                public void setPre_win(String pre_win)
                {
                    this.pre_win = pre_win;
                }

                public String getPre_lose()
                {
                    return pre_lose;
                }

                public void setPre_lose(String pre_lose)
                {
                    this.pre_lose = pre_lose;
                }

                public String getPre_draw()
                {
                    return pre_draw;
                }

                public void setPre_draw(String pre_draw)
                {
                    this.pre_draw = pre_draw;
                }
            }
        }

        public static class _$105824Bean
        {
            /**
             * had : {"id":"236345","type":"had","num":"2018-03-28","mid":"105824","win":"4079","lose":"1528","draw":"2143","odds_id":"0","total":"7750","pre_win":"53%","pre_lose":"20%","pre_draw":"28%"}
             * hhad : {"id":"236346","type":"hhad","num":"2018-03-28","mid":"105824","win":"1615","lose":"1274","draw":"1721","odds_id":"0","total":"4610","pre_win":"35%","pre_lose":"28%","pre_draw":"37%"}
             */

            private HadBeanXXX had;
            private HhadBeanXXX hhad;

            public HadBeanXXX getHad()
            {
                return had;
            }

            public void setHad(HadBeanXXX had)
            {
                this.had = had;
            }

            public HhadBeanXXX getHhad()
            {
                return hhad;
            }

            public void setHhad(HhadBeanXXX hhad)
            {
                this.hhad = hhad;
            }

            public static class HadBeanXXX
            {
                /**
                 * id : 236345
                 * type : had
                 * num : 2018-03-28
                 * mid : 105824
                 * win : 4079
                 * lose : 1528
                 * draw : 2143
                 * odds_id : 0
                 * total : 7750
                 * pre_win : 53%
                 * pre_lose : 20%
                 * pre_draw : 28%
                 */

                private String id;
                private String type;
                private String num;
                private String mid;
                private String win;
                private String lose;
                private String draw;
                private String odds_id;
                private String total;
                private String pre_win;
                private String pre_lose;
                private String pre_draw;

                public String getId()
                {
                    return id;
                }

                public void setId(String id)
                {
                    this.id = id;
                }

                public String getType()
                {
                    return type;
                }

                public void setType(String type)
                {
                    this.type = type;
                }

                public String getNum()
                {
                    return num;
                }

                public void setNum(String num)
                {
                    this.num = num;
                }

                public String getMid()
                {
                    return mid;
                }

                public void setMid(String mid)
                {
                    this.mid = mid;
                }

                public String getWin()
                {
                    return win;
                }

                public void setWin(String win)
                {
                    this.win = win;
                }

                public String getLose()
                {
                    return lose;
                }

                public void setLose(String lose)
                {
                    this.lose = lose;
                }

                public String getDraw()
                {
                    return draw;
                }

                public void setDraw(String draw)
                {
                    this.draw = draw;
                }

                public String getOdds_id()
                {
                    return odds_id;
                }

                public void setOdds_id(String odds_id)
                {
                    this.odds_id = odds_id;
                }

                public String getTotal()
                {
                    return total;
                }

                public void setTotal(String total)
                {
                    this.total = total;
                }

                public String getPre_win()
                {
                    return pre_win;
                }

                public void setPre_win(String pre_win)
                {
                    this.pre_win = pre_win;
                }

                public String getPre_lose()
                {
                    return pre_lose;
                }

                public void setPre_lose(String pre_lose)
                {
                    this.pre_lose = pre_lose;
                }

                public String getPre_draw()
                {
                    return pre_draw;
                }

                public void setPre_draw(String pre_draw)
                {
                    this.pre_draw = pre_draw;
                }
            }

            public static class HhadBeanXXX
            {
                /**
                 * id : 236346
                 * type : hhad
                 * num : 2018-03-28
                 * mid : 105824
                 * win : 1615
                 * lose : 1274
                 * draw : 1721
                 * odds_id : 0
                 * total : 4610
                 * pre_win : 35%
                 * pre_lose : 28%
                 * pre_draw : 37%
                 */

                private String id;
                private String type;
                private String num;
                private String mid;
                private String win;
                private String lose;
                private String draw;
                private String odds_id;
                private String total;
                private String pre_win;
                private String pre_lose;
                private String pre_draw;

                public String getId()
                {
                    return id;
                }

                public void setId(String id)
                {
                    this.id = id;
                }

                public String getType()
                {
                    return type;
                }

                public void setType(String type)
                {
                    this.type = type;
                }

                public String getNum()
                {
                    return num;
                }

                public void setNum(String num)
                {
                    this.num = num;
                }

                public String getMid()
                {
                    return mid;
                }

                public void setMid(String mid)
                {
                    this.mid = mid;
                }

                public String getWin()
                {
                    return win;
                }

                public void setWin(String win)
                {
                    this.win = win;
                }

                public String getLose()
                {
                    return lose;
                }

                public void setLose(String lose)
                {
                    this.lose = lose;
                }

                public String getDraw()
                {
                    return draw;
                }

                public void setDraw(String draw)
                {
                    this.draw = draw;
                }

                public String getOdds_id()
                {
                    return odds_id;
                }

                public void setOdds_id(String odds_id)
                {
                    this.odds_id = odds_id;
                }

                public String getTotal()
                {
                    return total;
                }

                public void setTotal(String total)
                {
                    this.total = total;
                }

                public String getPre_win()
                {
                    return pre_win;
                }

                public void setPre_win(String pre_win)
                {
                    this.pre_win = pre_win;
                }

                public String getPre_lose()
                {
                    return pre_lose;
                }

                public void setPre_lose(String pre_lose)
                {
                    this.pre_lose = pre_lose;
                }

                public String getPre_draw()
                {
                    return pre_draw;
                }

                public void setPre_draw(String pre_draw)
                {
                    this.pre_draw = pre_draw;
                }
            }
        }

        public static class _$105825Bean
        {
            /**
             * had : {"id":"236342","type":"had","num":"2018-03-28","mid":"105825","win":"4217","lose":"998","draw":"1926","odds_id":"0","total":"7141","pre_win":"59%","pre_lose":"14%","pre_draw":"27%"}
             * hhad : {"id":"236343","type":"hhad","num":"2018-03-28","mid":"105825","win":"2182","lose":"926","draw":"1881","odds_id":"0","total":"4989","pre_win":"44%","pre_lose":"19%","pre_draw":"38%"}
             */

            private HadBeanXXXX had;
            private HhadBeanXXXX hhad;

            public HadBeanXXXX getHad()
            {
                return had;
            }

            public void setHad(HadBeanXXXX had)
            {
                this.had = had;
            }

            public HhadBeanXXXX getHhad()
            {
                return hhad;
            }

            public void setHhad(HhadBeanXXXX hhad)
            {
                this.hhad = hhad;
            }

            public static class HadBeanXXXX
            {
                /**
                 * id : 236342
                 * type : had
                 * num : 2018-03-28
                 * mid : 105825
                 * win : 4217
                 * lose : 998
                 * draw : 1926
                 * odds_id : 0
                 * total : 7141
                 * pre_win : 59%
                 * pre_lose : 14%
                 * pre_draw : 27%
                 */

                private String id;
                private String type;
                private String num;
                private String mid;
                private String win;
                private String lose;
                private String draw;
                private String odds_id;
                private String total;
                private String pre_win;
                private String pre_lose;
                private String pre_draw;

                public String getId()
                {
                    return id;
                }

                public void setId(String id)
                {
                    this.id = id;
                }

                public String getType()
                {
                    return type;
                }

                public void setType(String type)
                {
                    this.type = type;
                }

                public String getNum()
                {
                    return num;
                }

                public void setNum(String num)
                {
                    this.num = num;
                }

                public String getMid()
                {
                    return mid;
                }

                public void setMid(String mid)
                {
                    this.mid = mid;
                }

                public String getWin()
                {
                    return win;
                }

                public void setWin(String win)
                {
                    this.win = win;
                }

                public String getLose()
                {
                    return lose;
                }

                public void setLose(String lose)
                {
                    this.lose = lose;
                }

                public String getDraw()
                {
                    return draw;
                }

                public void setDraw(String draw)
                {
                    this.draw = draw;
                }

                public String getOdds_id()
                {
                    return odds_id;
                }

                public void setOdds_id(String odds_id)
                {
                    this.odds_id = odds_id;
                }

                public String getTotal()
                {
                    return total;
                }

                public void setTotal(String total)
                {
                    this.total = total;
                }

                public String getPre_win()
                {
                    return pre_win;
                }

                public void setPre_win(String pre_win)
                {
                    this.pre_win = pre_win;
                }

                public String getPre_lose()
                {
                    return pre_lose;
                }

                public void setPre_lose(String pre_lose)
                {
                    this.pre_lose = pre_lose;
                }

                public String getPre_draw()
                {
                    return pre_draw;
                }

                public void setPre_draw(String pre_draw)
                {
                    this.pre_draw = pre_draw;
                }
            }

            public static class HhadBeanXXXX
            {
                /**
                 * id : 236343
                 * type : hhad
                 * num : 2018-03-28
                 * mid : 105825
                 * win : 2182
                 * lose : 926
                 * draw : 1881
                 * odds_id : 0
                 * total : 4989
                 * pre_win : 44%
                 * pre_lose : 19%
                 * pre_draw : 38%
                 */

                private String id;
                private String type;
                private String num;
                private String mid;
                private String win;
                private String lose;
                private String draw;
                private String odds_id;
                private String total;
                private String pre_win;
                private String pre_lose;
                private String pre_draw;

                public String getId()
                {
                    return id;
                }

                public void setId(String id)
                {
                    this.id = id;
                }

                public String getType()
                {
                    return type;
                }

                public void setType(String type)
                {
                    this.type = type;
                }

                public String getNum()
                {
                    return num;
                }

                public void setNum(String num)
                {
                    this.num = num;
                }

                public String getMid()
                {
                    return mid;
                }

                public void setMid(String mid)
                {
                    this.mid = mid;
                }

                public String getWin()
                {
                    return win;
                }

                public void setWin(String win)
                {
                    this.win = win;
                }

                public String getLose()
                {
                    return lose;
                }

                public void setLose(String lose)
                {
                    this.lose = lose;
                }

                public String getDraw()
                {
                    return draw;
                }

                public void setDraw(String draw)
                {
                    this.draw = draw;
                }

                public String getOdds_id()
                {
                    return odds_id;
                }

                public void setOdds_id(String odds_id)
                {
                    this.odds_id = odds_id;
                }

                public String getTotal()
                {
                    return total;
                }

                public void setTotal(String total)
                {
                    this.total = total;
                }

                public String getPre_win()
                {
                    return pre_win;
                }

                public void setPre_win(String pre_win)
                {
                    this.pre_win = pre_win;
                }

                public String getPre_lose()
                {
                    return pre_lose;
                }

                public void setPre_lose(String pre_lose)
                {
                    this.pre_lose = pre_lose;
                }

                public String getPre_draw()
                {
                    return pre_draw;
                }

                public void setPre_draw(String pre_draw)
                {
                    this.pre_draw = pre_draw;
                }
            }
        }

        public static class _$105826Bean
        {
            /**
             * had : {"id":"236344","type":"had","num":"2018-03-28","mid":"105826","win":"4122","lose":"1225","draw":"2136","odds_id":"0","total":"7483","pre_win":"55%","pre_lose":"16%","pre_draw":"29%"}
             * hhad : {"id":"236347","type":"hhad","num":"2018-03-28","mid":"105826","win":"1769","lose":"1077","draw":"1666","odds_id":"0","total":"4512","pre_win":"39%","pre_lose":"24%","pre_draw":"37%"}
             */

            private HadBeanXXXXX had;
            private HhadBeanXXXXX hhad;

            public HadBeanXXXXX getHad()
            {
                return had;
            }

            public void setHad(HadBeanXXXXX had)
            {
                this.had = had;
            }

            public HhadBeanXXXXX getHhad()
            {
                return hhad;
            }

            public void setHhad(HhadBeanXXXXX hhad)
            {
                this.hhad = hhad;
            }

            public static class HadBeanXXXXX
            {
                /**
                 * id : 236344
                 * type : had
                 * num : 2018-03-28
                 * mid : 105826
                 * win : 4122
                 * lose : 1225
                 * draw : 2136
                 * odds_id : 0
                 * total : 7483
                 * pre_win : 55%
                 * pre_lose : 16%
                 * pre_draw : 29%
                 */

                private String id;
                private String type;
                private String num;
                private String mid;
                private String win;
                private String lose;
                private String draw;
                private String odds_id;
                private String total;
                private String pre_win;
                private String pre_lose;
                private String pre_draw;

                public String getId()
                {
                    return id;
                }

                public void setId(String id)
                {
                    this.id = id;
                }

                public String getType()
                {
                    return type;
                }

                public void setType(String type)
                {
                    this.type = type;
                }

                public String getNum()
                {
                    return num;
                }

                public void setNum(String num)
                {
                    this.num = num;
                }

                public String getMid()
                {
                    return mid;
                }

                public void setMid(String mid)
                {
                    this.mid = mid;
                }

                public String getWin()
                {
                    return win;
                }

                public void setWin(String win)
                {
                    this.win = win;
                }

                public String getLose()
                {
                    return lose;
                }

                public void setLose(String lose)
                {
                    this.lose = lose;
                }

                public String getDraw()
                {
                    return draw;
                }

                public void setDraw(String draw)
                {
                    this.draw = draw;
                }

                public String getOdds_id()
                {
                    return odds_id;
                }

                public void setOdds_id(String odds_id)
                {
                    this.odds_id = odds_id;
                }

                public String getTotal()
                {
                    return total;
                }

                public void setTotal(String total)
                {
                    this.total = total;
                }

                public String getPre_win()
                {
                    return pre_win;
                }

                public void setPre_win(String pre_win)
                {
                    this.pre_win = pre_win;
                }

                public String getPre_lose()
                {
                    return pre_lose;
                }

                public void setPre_lose(String pre_lose)
                {
                    this.pre_lose = pre_lose;
                }

                public String getPre_draw()
                {
                    return pre_draw;
                }

                public void setPre_draw(String pre_draw)
                {
                    this.pre_draw = pre_draw;
                }
            }

            public static class HhadBeanXXXXX
            {
                /**
                 * id : 236347
                 * type : hhad
                 * num : 2018-03-28
                 * mid : 105826
                 * win : 1769
                 * lose : 1077
                 * draw : 1666
                 * odds_id : 0
                 * total : 4512
                 * pre_win : 39%
                 * pre_lose : 24%
                 * pre_draw : 37%
                 */

                private String id;
                private String type;
                private String num;
                private String mid;
                private String win;
                private String lose;
                private String draw;
                private String odds_id;
                private String total;
                private String pre_win;
                private String pre_lose;
                private String pre_draw;

                public String getId()
                {
                    return id;
                }

                public void setId(String id)
                {
                    this.id = id;
                }

                public String getType()
                {
                    return type;
                }

                public void setType(String type)
                {
                    this.type = type;
                }

                public String getNum()
                {
                    return num;
                }

                public void setNum(String num)
                {
                    this.num = num;
                }

                public String getMid()
                {
                    return mid;
                }

                public void setMid(String mid)
                {
                    this.mid = mid;
                }

                public String getWin()
                {
                    return win;
                }

                public void setWin(String win)
                {
                    this.win = win;
                }

                public String getLose()
                {
                    return lose;
                }

                public void setLose(String lose)
                {
                    this.lose = lose;
                }

                public String getDraw()
                {
                    return draw;
                }

                public void setDraw(String draw)
                {
                    this.draw = draw;
                }

                public String getOdds_id()
                {
                    return odds_id;
                }

                public void setOdds_id(String odds_id)
                {
                    this.odds_id = odds_id;
                }

                public String getTotal()
                {
                    return total;
                }

                public void setTotal(String total)
                {
                    this.total = total;
                }

                public String getPre_win()
                {
                    return pre_win;
                }

                public void setPre_win(String pre_win)
                {
                    this.pre_win = pre_win;
                }

                public String getPre_lose()
                {
                    return pre_lose;
                }

                public void setPre_lose(String pre_lose)
                {
                    this.pre_lose = pre_lose;
                }

                public String getPre_draw()
                {
                    return pre_draw;
                }

                public void setPre_draw(String pre_draw)
                {
                    this.pre_draw = pre_draw;
                }
            }
        }
    }
}
