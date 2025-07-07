package com.liujian.gymxmjpa.dao;


import com.liujian.gymxmjpa.entity.Loos;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description: 丢失物品信息Dao层接口
 * 
 * @Date: 2025/4/3
 */
public interface LoosDao extends JpaRepository<Loos,Long> {
}
