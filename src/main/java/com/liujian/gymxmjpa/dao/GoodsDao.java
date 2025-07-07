package com.liujian.gymxmjpa.dao;


import com.liujian.gymxmjpa.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description: 商品信息Dao层接口
 * 
 * @Date: 2025/4/3
 */
public interface GoodsDao extends JpaRepository<Goods,Long> {
}
