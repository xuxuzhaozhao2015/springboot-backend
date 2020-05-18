package com.example.demo.core.configurer;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import lombok.val;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DruidMonitorConfig {

    @Bean
    public ServletRegistrationBean registrationBean() {
        val bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");

        // 白名单("多个IP使用‘,’隔开")
        bean.addInitParameter("allow", "127.0.0.1,192.168.1.20");
        // 黑名单
        bean.addInitParameter("deny", "192.168.1.21");

        // 登陆druid的账号密码
        bean.addInitParameter("loginUsername", "admin");
        bean.addInitParameter("loginPassword", "admin");

        // 是否能够重置数据
        bean.addInitParameter("resetEnable", "false");
        return bean;
    }

    @Bean
    public FilterRegistrationBean druidStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new WebStatFilter());

        // 添加过滤规则
        bean.addUrlPatterns("/*");
        // 添加不需要的信息
        bean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return bean;
    }
}
