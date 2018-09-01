package com.onuo.goods.dao;

import com.onuo.common.util.CommonMapper;
import com.onuo.common.util.MybatisUtil;
import com.onuo.goods.model.ShoesSize;
import org.junit.Test;

import java.util.List;

/**
 * @
 */
public class ShoesSizeMapperTest {
    ShoesSizeMapper mapper= (ShoesSizeMapper) CommonMapper.getInstance().getMapper(ShoesSizeMapper.class);
    @Test
    public void queryAllColorByShooesId(){

        List<ShoesSize> list =  mapper.queryAllSizeByShooesId("1001");
        for (ShoesSize c : list){
            System.out.println(c);
        }
        MybatisUtil.closeSession();
    }
}
