package hello3.hellospring;

import hello3.hellospring.repository.MemberRepository;
import hello3.hellospring.repository.MemoryMemberRepository;
import hello3.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
