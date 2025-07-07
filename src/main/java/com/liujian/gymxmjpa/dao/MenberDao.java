package com.liujian.gymxmjpa.dao;


import com.liujian.gymxmjpa.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description: 会员信息Dao层接口
 * @Date: 2025
 * @Date: 2025/4/3
 */
public interface MenberDao extends JpaRepository<Member,Long> {
}
