package com.macfu.microcloud.service.impl;

import com.macfu.microcloud.dao.IMemberDAO;
import com.macfu.microcloud.dao.IRoleDAO;
import com.macfu.microcloud.po.Member;
import com.macfu.microcloud.service.IMemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: liming
 * @Date: 2018/12/28 15:46
 * @Description: 业务实现类
 */
@Service
public class MemberServiceImpl implements IMemberService {
    @Resource
    private IMemberDAO memberDAO;
    @Resource
    private IRoleDAO roleDAO;

    @Override
    public Map<String, Object> get(String mid) {
        Map<String, Object> map = new HashMap<>();
        Member member = this.memberDAO.findById(mid);
        if (member != null) {
            map.put("allRoles", this.roleDAO.findAllByMember(mid));
        }
        map.put("member", member);
        return map;
    }
}
