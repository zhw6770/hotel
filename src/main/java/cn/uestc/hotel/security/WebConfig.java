package cn.uestc.hotel.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/adminlte/**", "/index/**", "/login","/", "//index", "/register","/hotelResult", "/hotelInformation","/showHotelImg","/showRoomImg1","/showRoomImg2","/showRoomImg3","/showRoomImg4","/showRoomImg5","/IP","/map");
    }
}
