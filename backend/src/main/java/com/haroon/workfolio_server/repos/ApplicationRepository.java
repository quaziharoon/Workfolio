package com.haroon.workfolio_server.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.haroon.workfolio_server.entity.Application;
import com.haroon.workfolio_server.entity.User;
import com.haroon.workfolio_server.model.ApplicationDetailsDto;

import java.util.List;
import java.util.Optional;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
    List<Application> findByJobId(Long jobId);
    List<Application> findBySeekerId(Long seekerId);

    @Query("SELECT new com.haroon.workfolio_server.model.ApplicationDetailsDto(j.companyName, j.title, u.name, u.skills) " +
            "FROM Application a " +
            "JOIN a.job j " +
            "JOIN a.seeker u")
    List<ApplicationDetailsDto> findAllApplicationDetails();
}