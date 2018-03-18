package com.xiaoma.design.pattern.adapter;

//现在我们需要接入微信第三方登陆。原有的接口是不适合的。
//所以我们需要在这里面即兼容以前的系统登陆，注册，也要有自己的新接口
//除了继承老系统，我们也可以在这里面直接持有老系统的对象
public class WechatLoginServer extends PassportServer implements ThirdPassport{
    public ResultMsg ThirdLogin() {
        System.out.println("微信登陆成功");
        this.login("asd", "asd");
        //这里面一般会根据第三方登陆来注册自己系统的账号
        //然后会将第三方返回回来的Token与自己系统的账号进行绑定
        //所以需要用到老系统的登陆，注册方式，只是在这里不以代码的形式展现了。
        return null;
    }
}
