package com.project.gts.project.repositories;

import com.project.gts.project.entities.EmploymentAgreementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmploymentAgreementRepository extends JpaRepository<EmploymentAgreementEntity, Long> {

    @Query("SELECT e FROM EmploymentAgreementEntity e WHERE " +
            "(:employeeName IS NULL OR LOWER(e.employeeName) = LOWER(:employeeName)) AND " +
            "(:role IS NULL OR LOWER(e.role) = LOWER(:role))")
    List<EmploymentAgreementEntity> searchAgreements(@Param("employeeName") String employeeName,
                                                     @Param("role") String role);
}
