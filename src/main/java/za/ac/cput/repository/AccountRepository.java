package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Account;
import za.ac.cput.domain.Admin;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
