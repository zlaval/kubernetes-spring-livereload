package com.zlrx.k8s.kuberneteslivereloadarticle.repository;

import com.zlrx.k8s.kuberneteslivereloadarticle.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
