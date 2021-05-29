package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        // applicationContext, BeanFactory = 스프링 컨테이너
        // applicationContext vs BeanFactory
        // BeanFactory: Bean을 관리, 검색
        // applicationContext: BeanFactory기능 상속 받고, 부가적인 기능이 많다.
        // ex. 환경변수, application event(event 발행, 구독 모델 편리하게 지원)
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "memberA", Grade.VIP);

        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName()); System.out.println("find Member = " + findMember.getName());
    }
}