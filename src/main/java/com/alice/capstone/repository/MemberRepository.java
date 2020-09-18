package com.alice.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alice.capstone.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}

