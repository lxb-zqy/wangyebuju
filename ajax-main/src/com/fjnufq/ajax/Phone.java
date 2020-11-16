package com.fjnufq.ajax;

/**
 * @author shkstart
 * @create 2020-11-16 13:15
 */
public class Phone {
    private String type;
    private String name;

    public Phone() {

    }

    public Phone(String type, String name) {
        super();
        this.type = type;
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String code) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
