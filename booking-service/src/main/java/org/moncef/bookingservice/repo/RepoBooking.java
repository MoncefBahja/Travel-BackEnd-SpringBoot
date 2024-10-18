package org.moncef.bookingservice.repo;

import org.moncef.bookingservice.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface RepoBooking extends JpaRepository<Booking,Long> {
}
