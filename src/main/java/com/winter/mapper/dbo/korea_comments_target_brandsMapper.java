package com.winter.mapper.dbo;

import com.winter.model.dbo.korea_comments_target_brands;

public interface korea_comments_target_brandsMapper {
    int deleteByPrimaryKey(Long pkId);

    int insert(korea_comments_target_brands record);

    int insertSelective(korea_comments_target_brands record);

    korea_comments_target_brands selectByPrimaryKey(Long pkId);

    int updateByPrimaryKeySelective(korea_comments_target_brands record);

    int updateByPrimaryKey(korea_comments_target_brands record);
}