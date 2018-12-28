package com.macfu.microcloud.security.util;

import com.macfu.microcloud.po.Member;
import com.macfu.microcloud.service.IMemberService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: liming
 * @Date: 2018/12/28 15:52
 * @Description: 用户数据库的读取
 */
public class DefaultUserDetailsService implements UserDetailsService {
    @Resource
    private IMemberService memberService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Map<String, Object> map = this.memberService.get(username);
        Member member = (Member) map.get("member");
        if (member == null) {
            throw new UsernameNotFoundException("用户" + username + "不存在");
        }
        Set<String> allRoles = (Set<String>) map.get("allRoles");
        Iterator<String> iter = allRoles.iterator();
        List<GrantedAuthority> allGrantedAuthority = new ArrayList<>();
        while (iter.hasNext()) {
            allGrantedAuthority.add(new SimpleGrantedAuthority(iter.next()));
        }
        User user = new User(username, member.getPassword(), allGrantedAuthority);
        return user;
    }
}
