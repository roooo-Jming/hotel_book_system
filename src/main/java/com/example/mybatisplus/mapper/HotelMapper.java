package com.example.mybatisplus.mapper;

import com.example.mybatisplus.model.domain.Hotel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


import java.sql.Date;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gzx
 * @since 2022-02-28
 */
public interface HotelMapper extends BaseMapper<Hotel> {

    List<Hotel> searchResult(String hotelName, Date checkIn, Date checkOut, Integer code, String roomType);
    List<Hotel> getrem();
    List<Hotel> showDetails(Long hId, java.util.Date checkinSql, java.util.Date checkoutSql);
//    List<Hotel> showDetails2(Long hId);
}
