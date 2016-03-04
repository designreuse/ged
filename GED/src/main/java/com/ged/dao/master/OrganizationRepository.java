package com.ged.dao.master;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ged.domain.master.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Integer> {

}
