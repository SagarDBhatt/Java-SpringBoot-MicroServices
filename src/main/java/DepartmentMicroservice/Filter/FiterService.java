package DepartmentMicroservice.Filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Filter Service to generate the custom headers for HttpServlet Response.
 */
@Component
public class FiterService implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        resp.addHeader("Custom-header","Filter-custom-resp");
        filterChain.doFilter(servletRequest,resp);
    }
}
