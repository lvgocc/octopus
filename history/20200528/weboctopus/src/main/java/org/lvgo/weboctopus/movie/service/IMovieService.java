package org.lvgo.weboctopus.movie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.lvgo.weboctopus.movie.entity.Movie;

/**
 * <p>
 * 电影信息表 服务类
 * </p>
 *
 * @author lvgorice@gmail.com
 * @since 2020-05-27
 */
public interface IMovieService extends IService<Movie> {

    void fetchData(String source);
}
