package cn.shuto.pdd.pojo;

import lombok.Data;

/**
 * @author lizj
 * DATE 2020/1/9 10:39
 * TODO 轮播图
 */
@Data
public class Banner {
	private Long bId;
	private String imageUrl;
	private String caption;
	private Long imageId;
}
