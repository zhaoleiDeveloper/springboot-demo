package com.example.hibernate.demo.dao.oneToOne;

import com.example.hibernate.demo.entity.one.UserDetailsInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author zhaolei
 * Create: 2019/4/19 15:25
 * Modified By:
 * Description:
 */
@Repository
public interface IUserDetailsRepository extends JpaRepository<UserDetailsInfo, Integer>, JpaSpecificationExecutor {
}
