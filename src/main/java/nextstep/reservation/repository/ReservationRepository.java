package nextstep.reservation.repository;

import nextstep.reservation.domain.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationRepository {

    Long save(Reservation reservation);

    Optional<Reservation> findById(Long id);

    List<Reservation> findByScheduleId(Long scheduleId);

    List<Reservation> findAllByMemberId(Long memberId);

    int deleteById(Long id);
}