package cn.shuto.pdd.controller;

import cn.shuto.pdd.mapper.BannerMapper;
import cn.shuto.pdd.pojo.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lizj
 * DATE 2020/1/9 10:47
 * TODO 轮播图控制器
 */
@RestController
public class BannerController {

	@Autowired
	private BannerMapper mBannerMapper;

	@Autowired
	public BannerController(BannerMapper mBannerMapper) {
		this.mBannerMapper = mBannerMapper;
	}

	@GetMapping("/banner/{id}")
	public Banner getBannerById(@PathVariable Long id) {
		return mBannerMapper.findById(id);
	}

	@GetMapping("/banner")
	public List<Banner> getBanner() {
		return mBannerMapper.findAll();
	}

}
