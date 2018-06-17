package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TimeEntryRepository {
    public TimeEntry find(long id);

    public TimeEntry update(long id, TimeEntry timeEntry);

    public List<TimeEntry> list();

    public void delete(long id) ;

    public TimeEntry create(TimeEntry any);
}
