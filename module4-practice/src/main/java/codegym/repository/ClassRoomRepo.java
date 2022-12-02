package codegym.repository;

import codegym.model.ClassRoom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface ClassRoomRepo extends CrudRepository<ClassRoom, Long> {
}
