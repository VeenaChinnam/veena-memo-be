package net.yorksolutions.memobe.repository;

import net.yorksolutions.memobe.Entity.Account;
import net.yorksolutions.memobe.Entity.Memo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoRepository extends CrudRepository<Memo, Long> {
    Iterable<Memo> findAllByOwner(Account owner);
}
