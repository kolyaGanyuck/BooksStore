package kolya.study.bookservice.repository;

import kolya.study.bookservice.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {
    Optional<Rating> findByBookId(Long id);
    List<Rating> findAllByRatingGreaterThan(Long rating);
}
