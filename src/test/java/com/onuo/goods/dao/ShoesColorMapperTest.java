package com.onuo.goods.dao;

import com.onuo.common.util.CommonMapper;
import com.onuo.common.util.MybatisUtil;
import com.onuo.goods.model.ShoesColor;
import org.junit.Test;

import java.util.List;

/**
 * @
 */
public class ShoesColorMapperTest {
    ShoesColorMapper mapper= (ShoesColorMapper) CommonMapper.getInstance().getMapper(ShoesColorMapper.class);
    @Test
    public void queryAllColorByShooesId(){

        List<ShoesColor> list =  mapper.queryAllColorByShooesId("1001");
        for (ShoesColor c : list){
            System.out.println(c);
        }
        MybatisUtil.closeSession();
    }
}
