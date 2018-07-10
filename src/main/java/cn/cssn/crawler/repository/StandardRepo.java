package cn.cssn.crawler.repository;

import cn.cssn.crawler.entity.Standard;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 标准的数据库访问层
 *
 * @author luchenwei
 */
public interface StandardRepo extends JpaRepository<Standard, String> {}
