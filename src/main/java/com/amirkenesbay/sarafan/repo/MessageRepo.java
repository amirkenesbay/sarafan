package com.amirkenesbay.sarafan.repo;

import com.amirkenesbay.sarafan.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {

}
