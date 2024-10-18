package org.moncef.userservice.repo;

import org.moncef.userservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController//??
public interface RepoUser extends JpaRepository<User,Long> {
}
