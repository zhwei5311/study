package com.study.exercise2;

/**
 * 定义一个女朋友类。女朋友的属性包含：姓名，身高，体重。行为包含：洗衣服wash()，做饭cook()。
 * 另外定义一个用于展示三个属性值的show()方法。
 * 请在测试类中通过有参构造方法创建对象并赋值，然后分别调用展示方法、洗衣服方法和做饭方法。打印效果如下：
 *
 * ```
 * 我女朋友叫凤姐,身高155.0厘米,体重130.0斤
 * 女朋友帮我洗衣服
 * 女朋友给我做饭
 * ```
 */
public class GirlFriend {

    private String name;

    private Integer high;

    private double weight;

    public GirlFriend(){};

    public GirlFriend(String name,Integer high,double weight) {
        this.name = name;
        this.high = high;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void print() {
        System.err.println("我爱" + name + ",身高" + high + "cm，身材" + weight + "非常好！");
    }
    //洗衣服wash()
    public void wash(){
        System.err.println(name + "帮我洗衣服！");
    }
    //做饭cook()
    public void cook() {
        System.err.println(name + "夫人帮香香做饭，可香了！");
    }
}
