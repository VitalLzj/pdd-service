package cn.shuto.pdd.mapper;

import cn.shuto.pdd.pojo.Banner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component()
public interface BannerMapper {

	Banner findById(Long id);

	List<Banner> findAll();

}
