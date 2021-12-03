package com.eduonix.votingsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.eduonix.votingsystem.entity.Candidate;
import com.eduonix.votingsystem.entity.Citizen;

@Repository
@EnableJpaRepositories
public interface CandidateRepo extends JpaRepository <Candidate,Integer>{

	public Candidate findById(long id);
	
}
