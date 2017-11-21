package com.chinauicom.bluesky.repositories;

import com.chinauicom.bluesky.domain.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Jpa仓库
 */
public interface ActorRepository extends JpaRepository<Actor, Integer> {

}

