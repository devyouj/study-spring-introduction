package com.youj.hellospring;

import com.youj.hellospring.repository.MemberRepository;
import com.youj.hellospring.repository.MemoryMemberRepository;
import com.youj.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
