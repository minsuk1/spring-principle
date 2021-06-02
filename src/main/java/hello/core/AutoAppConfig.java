package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import static org.springframework.context.annotation.ComponentScan.*;

// 스프링 부트를 사용하면 스프링 부트의 대표 시작 정보인 @SpringBootApplication 를
// 이 프로젝트 시작 루트 위치에 둔다. 그리고 이 설정안에 바로 @ComponentScan 이 들어있다
// 기본은 @ComponentScan 이 붙은 설정 정보 클래스의 패키지가 시작 위치부터 탐색 대상
@Configuration
@ComponentScan(
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes =
                Configuration.class))
public class AutoAppConfig {

}