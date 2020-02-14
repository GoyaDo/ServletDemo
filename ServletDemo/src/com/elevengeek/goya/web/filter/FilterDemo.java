package com.elevengeek.goya.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author cj
 * @create 2020-02-14-17:44
 */
@WebFilter(value = "/*",dispatcherTypes = DispatcherType.REQUEST)//访问所有资源之前，都会执行该过滤器
//浏览器直接请求该资源时，该过滤器会被执行
public class FilterDemo implements Filter {
    /**
     * 服务器启动后，会创建Filter对象，然后调用init方法，执行一次,加载资源
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /**
     * 在每一次请求被拦截资源时，会执行，执行多次
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //放行
        filterChain.doFilter(servletRequest,servletResponse);
    }

    /**
     * 在服务器关闭后，Filter对象被销毁，如果服务器是正常关闭，则会执行destroy方法，执行一次，释放资源
     */
    @Override
    public void destroy() {

    }
}
